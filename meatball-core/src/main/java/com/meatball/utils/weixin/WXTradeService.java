/**
 * Project Name:meatball-core
 * File Name:WXTradeService.java
 * Package Name:com.meatball.utils.pay.weixin
 * Date:2018年3月22日下午4:22:53
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.utils.weixin;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Service;

/**   
 * @Title: WXTradeService.java 
 * @Package com.meatball.utils.pay.weixin 
 * @Description: TODO(微信交易服务) 
 * @author jw 
 * @date 2018年3月22日 下午4:22:53 
 * @version V1.0   
 */
@Service
public class WXTradeService {
	private WXPay wxpay;
    private WXPayConfigImpl config;

    public WXTradeService() throws Exception {
        config = WXPayConfigImpl.getInstance();
        wxpay = new WXPay(config);
    }
    
    /**
     * @Title: doUnifiedOrder 
     * @Description: TODO(下单) 
     * @param out_trade_no 商户订单号   充值订单格式 :cz+订单id 消费订单格式:xf+订单id
     * @param total_fee 金额
     * @param productId 商品编号
     * @return
     * @return Map<String,String>    返回类型
     */
    public Map<String, String> doUnifiedOrder(String out_trade_no,String total_fee,String productId){
    	Map<String, String> result = new HashMap<String, String>();
    	HashMap<String, String> data = new HashMap<String, String>();
		data.put("body", "易选报");//商品描述
		data.put("out_trade_no", out_trade_no);//商户订单号
		data.put("fee_type", "CNY");//标价币种 人民币
		data.put("total_fee", total_fee);//金额
		data.put("spbill_create_ip", SecurityUtils.getSubject().getSession().getHost());//用户IP
		data.put("notify_url", "http://jw.jydz-yjy.com/api/ykt/order/wxback");//回调地址
		data.put("trade_type", "JSAPI");//交易类型 公众号支付
        data.put("device_info", "WEB");//设备号 
        data.put("product_id",  productId);//商品编号
        data.put("openid",  "");//公众号支付时，此参数必传
        //data.put("limit_pay", "no_credit");//指定支付方式 不支持信用卡
        // data.put("time_expire", "20170112104120");

        try {
        	System.out.println("请求数据================"+data);
        	result = wxpay.unifiedOrder(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
}
