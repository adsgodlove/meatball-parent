/**
 * Project Name:meatball-rest
 * File Name:OrderService.java
 * Package Name:com.meatball.api.order.service
 * Date:2018年3月26日下午2:39:15
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.order.service;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.meatball.api.order.parems.MyServiceParems;
import com.meatball.api.order.parems.OrderInfoParems;
import com.meatball.api.order.parems.OrderListParems;
import com.meatball.api.order.parems.PayParems;
import com.meatball.api.order.parems.PayResultParems;
import com.meatball.api.order.parems.ServiceInfoParems;
import com.meatball.api.order.parems.ServiceParems;
import com.meatball.api.user.parems.MyServiceVO;
import com.meatball.exuanbao.dictionarie.service.DictionarieService;
import com.meatball.exuanbao.pay.dao.PaymentMapper;
import com.meatball.exuanbao.pay.model.Payment;
import com.meatball.exuanbao.pay.model.SysParamer;
import com.meatball.exuanbao.personal.dao.AccountMapper;
import com.meatball.exuanbao.personal.model.Account;
import com.meatball.utils.DateUtil;
import com.meatball.utils.weixin.WXPayUtil;
import com.meatball.utils.weixin.WXTradeService;
import com.meatball.vo.ResultMsg;

/**   
 * @Title: OrderService.java 
 * @Package com.meatball.api.order.service 
 * @Description: TODO(订单服务类) 
 * @author jw  
 * @date 2018年3月26日 下午2:39:15 
 * @version V1.0   
 */
@Service
public class OrderApiService {
	@Resource
	private AccountMapper accountMapper;
	
	@Resource
	private PaymentMapper paymentMapper;
	
	@Resource
	private WXTradeService tradeService;
	
	@Resource
	private DictionarieService dictionarieService;

	/**
	 * @Title: getOrderList 
	 * @Description: TODO(获取订单列表) 
	 * @param userid
	 * @return
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg getOrderList(String userid) {
		OrderListParems info = new OrderListParems(); 
		ResultMsg msg = new ResultMsg(200, info);
		List<Payment> list = paymentMapper.selectOrderList(userid);
		if(null != list && list.size() > 0) {
			info.setResultCode(1);
			info.setResultMsg("操作成功");
			info.setList(list);
		} else {
			info.setResultCode(1);
			info.setResultMsg("无订单信息");
		}
		return msg;
	}

	/**
	 * @Title: getOrderInfo 
	 * @Description: TODO(获取订单详情) 
	 * @param orderid
	 * @return
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg getOrderInfo(String orderid) {
		OrderInfoParems info = new OrderInfoParems();
		ResultMsg msg = new ResultMsg(200, info);
		Payment pay = paymentMapper.selectByPrimaryKey(Long.parseLong(orderid));
		if(null != pay) {
			info.setResultCode(1);
			info.setResultMsg("操作成功");
			info.setId(pay.getbId());
			info.setDealid(pay.getvDealid());
			info.setiStatus(pay.getiStatus());
			info.setiType(pay.getiType());
			info.setMoney(String.valueOf(pay.getdMoney()));
			info.setPayTime(DateUtil.getTime(pay.gettTime()));
			info.setPaytype(pay.getvPaytype());
			info.setRemark(pay.getRemark());
			info.setTel(pay.getvTel());
			info.setUsername(pay.getvUsername());
		} else {
			info.setResultCode(0);
			info.setResultMsg("无此订单");
		}
		return msg;
	}

	/**
	 * @Title: pay 
	 * @Description: TODO(下单操作) 
	 * @param parems
	 * @return
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg pay(PayParems parems) {
		PayResultParems info =  new  PayResultParems();
		ResultMsg msg = new ResultMsg(200, info);
		Double d = Double.parseDouble(parems.getBalance())*100;
		Account account = accountMapper.selectByPrimaryKey(parems.getUserId());
		if(null != account) {//如果存在，则组装微信下单信息
			Payment record = new Payment();
			record.setbUserid(parems.getUserId());
			record.setdMoney(new BigDecimal(parems.getBalance()));
			record.setiStatus(9);
			record.setiType(parems.getOrderType());
			record.settTime(new Date());
			record.setvPaytype("wx");
			record.setvUsername(account.getName());
			record.setvTel(account.getPhone());
			paymentMapper.insertSelective(record);
			//调用微信下单接口
			Map<String,String> map = tradeService.doUnifiedOrder(record.getbId().toString(), String.valueOf(d.longValue()), record.getbId().toString());
			System.out.println("返回信息===="+map);
			if("SUCCESS".equals(map.get("return_code"))) {
				info.setResultCode(1);
				info.setResultMsg("微信预下单成功");
				info.setOrderNumber("prepay_id="+record.getbId());
				info.setAppId(map.get("appid"));
				info.setNonceStr(map.get("nonce_str"));
				info.setPaySign(map.get("sign"));
				info.setSignType("MD5");
				info.setTimeStamp(String.valueOf(new Date().getTime()/1000));
			} else {
			//预下单失败
				info.setResultCode(0);
				info.setResultMsg(map.get("return_msg"));
			}
			 
		} else {
			info.setResultCode(0);
			info.setResultMsg("用户不存在");
		}
		return msg;
	}

	/**
	 * @Title: getWxBackMsg 
	 * @Description: TODO(微信回调) 
	 * @param request
	 * @param response
	 * @return void    返回类型
	 */
	public void getWxBackMsg(HttpServletRequest request, HttpServletResponse response) throws Exception{
		//解析转换微信回调返回信息 
		InputStream inputStream;  
        StringBuffer strXML = new StringBuffer();  
        inputStream = request.getInputStream();  
        String s;  
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));  
        while ((s = in.readLine()) != null) {  
        	strXML.append(s);  
        }  
        in.close();  
        inputStream.close();  
        Map<String, String> map = WXPayUtil.xmlToMap(strXML.toString());
        String resXml = "";// 反馈给微信服务器 
        /*1、如果支付成功，则取出订单数据，修改订单状态*/
  		if("SUCCESS".equals(map.get("return_code"))) {
  			String orderNumber = map.get("out_trade_no");
  			Payment record = paymentMapper.selectByPrimaryKey(Long.parseLong(orderNumber));
			record.setvDealid(map.get("transaction_id"));
			record.setiStatus(1);
			paymentMapper.updateByPrimaryKeySelective(record);
  			/*4、通知微信.异步确认成功.必写.不然会一直通知后台.八次之后就认为交易失败了.  */
            resXml = "<xml><return_code><![CDATA[SUCCESS]]></return_code>"  
                    + "<return_msg><![CDATA[OK]]></return_msg></xml> ";  
  		} else {
  			resXml = "<xml><return_code><![CDATA[FAIL]]></return_code>"  
                    + "<return_msg><![CDATA[报文为空]]></return_msg></xml> "; 
  		}
		 BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());  
	     out.write(resXml.getBytes());  
	     out.flush();  
	     out.close(); 
		
	}

	/**
	 * @Title: getServiceInfo 
	 * @Description: TODO(服务内容) 
	 * @param parems
	 * @return
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg getServiceInfo(ServiceParems parems) {
		ServiceInfoParems info = new ServiceInfoParems();
		ResultMsg msg = new ResultMsg(200, info);
		List<SysParamer> list =  dictionarieService.selectPayServiceInfo("pay",parems.getOtype());
		if(null != list && list.size() > 0) {
			info.setResultCode(1);
			info.setResultMsg("操作成功");
			for (SysParamer sysParamer : list) {
				if(sysParamer.getvName().equals("服务内容")) {
					info.setContent(sysParamer.getvValue());
				} else if (sysParamer.getvName().equals("服务流程")) {
					info.setFlow(sysParamer.getvValue());
				} else if (sysParamer.getvName().equals("服务保障")) {
					info.setSecurity(sysParamer.getvValue());
				} 
			}
		} else {
			info.setResultCode(0);
			info.setResultMsg("传入参数错误");
		}
		return msg;
	}

	/**
	 * @Title: getMyServiceList 
	 * @Description: TODO(我的服务列表) 
	 * @param userid
	 * @return
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg getMyServiceList(String userid) {
		MyServiceParems info = new MyServiceParems(); 
		ResultMsg msg = new ResultMsg(200, info);
		List<Payment> list = paymentMapper.selectOrderOKList(userid);
		List<MyServiceVO> reslist = new ArrayList<MyServiceVO>();
		if(null != list && list.size() > 0) {
			info.setResultCode(1);
			info.setResultMsg("操作成功");
			for (Payment payment : list ) {
				switch (payment.getiType()) {
				case 11:
					MyServiceVO service1 = new MyServiceVO();
					setMyServiceVOValues(reslist,service1, "智能填报", "规划师", DateUtil.getDay(payment.gettTime()));
					break;
				case 12:
					MyServiceVO service2 = new MyServiceVO();
					setMyServiceVOValues(reslist,service2, "智能填报", "高级规划师", DateUtil.getDay(payment.gettTime()));
					break;
				case 13:
					MyServiceVO service3 = new MyServiceVO();
					setMyServiceVOValues(reslist,service3, "智能填报", "教育专家", DateUtil.getDay(payment.gettTime()));
					break;
				default:
					break;
				}
			}
			info.setList(reslist);
		} else {
			info.setResultCode(1);
			info.setResultMsg("无服务信息");
		}
		
		return msg;
	}
	
	private void setMyServiceVOValues(List<MyServiceVO> reslist,MyServiceVO service,String type,String sclass,String time) {
		service.setStype(type);
		service.setSclass(sclass);
		service.setPayTime(time);
		reslist.add(service);
	}

}
