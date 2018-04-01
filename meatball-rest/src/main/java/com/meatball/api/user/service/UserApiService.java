/**
 * Project Name:meatball-rest
 * File Name:UserApiService.java
 * Package Name:com.meatball.api.user.service
 * Date:2018年3月4日下午3:51:06
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.user.service;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Service;

import com.meatball.api.user.parems.MobileParems;
import com.meatball.api.user.parems.MobileValidateParems;
import com.meatball.api.user.parems.UserInfoParams;
import com.meatball.api.user.parems.UserParems;
import com.meatball.component.TokenComponent;
import com.meatball.exuanbao.pay.dao.MobileMessageMapper;
import com.meatball.exuanbao.pay.model.MobileMessage;
import com.meatball.exuanbao.personal.dao.AccountMapper;
import com.meatball.exuanbao.personal.model.Account;
import com.meatball.system.user.service.SysUserService;
import com.meatball.utils.DateUtil;
import com.meatball.vo.ResultMsg;

/**   
 * @Title: UserApiService.java 
 * @Package com.meatball.api.user.service 
 * @Description: TODO(用户信息) 
 * @author 張翔宇  
 * @date 2018年3月4日 下午3:51:06 
 * @version V1.0   
 */
@Service
public class UserApiService {
	@Resource
	private SysUserService service;
	@Resource
	private TokenComponent tokenComponent;
	
	@Resource
	private MobileMessageMapper mobileMessageMapper;
	
	@Resource
	private AccountMapper accountMapper;
	
	/**
	 * @Title: info 
	 * @Description: TODO(用户详情) 
	 * @param token
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg info(UserParems parems) {
//		long userId = tokenComponent.parseJWT(parems.getToken());
//		SysUser sysUser = service.info(userId);
		return new ResultMsg(200, null);
	}

	/**
	 * @Title: getMobileVerifycode 
	 * @Description: TODO(获取微信验证码) 
	 * @param mobile
	 * @return
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg getMobileVerifycode(String mobile) {
		MobileValidateParems info = new MobileValidateParems();
		ResultMsg msg = new ResultMsg(200, info);
		//调用手机短信接口获取验证码
		setMobileVerifyCodeReturnInfo(info,1,"操作成功",mobile,"6666");
		return msg;
	}

	/**
	 * @Title: getMobileVerifycodeCheck 
	 * @Description: TODO(验证手机短信验证码) 
	 * @param parems
	 * @return
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg getMobileVerifycodeCheck(MobileParems parems) {
		MobileValidateParems info = new MobileValidateParems();
		ResultMsg msg = new ResultMsg(200, info);
		//先检查手机是否注册
		int num = accountMapper.selectCountByMobile(parems.getMobile());
		if(num > 0) {
			setMobileVerifyCodeReturnInfo(info,0,"手机号码已注册",parems.getMobile(),parems.getVerifyCode());
		} else {
			MobileMessage message = mobileMessageMapper.selectInfoByMobileCode(parems.getMobile(),parems.getVerifyCode());
			if(null != message) {
				setMobileVerifyCodeReturnInfo(info,1,"操作成功",parems.getMobile(),parems.getVerifyCode());
			} else {
				setMobileVerifyCodeReturnInfo(info,0,"验证码错误",parems.getMobile(),parems.getVerifyCode());
			}
		}
		
		return msg;
	}

	private void setMobileVerifyCodeReturnInfo(MobileValidateParems info,int m,String msg,String mobile,String code) {
		info.setResultCode(m);
		info.setResultMsg(msg);
		info.setMobile(mobile);
		info.setVerifyCode(code);
	}

	/**
	 * @Title: getSaveWxUserResult 
	 * @Description: TODO(保存微信注册用户信息) 
	 * @param parems
	 * @return
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg getSaveWxUserResult(UserParems parems,HttpServletRequest request) {
		UserInfoParams info = new UserInfoParams();
		ResultMsg msg = new ResultMsg(200, info);
		String platformId = tokenComponent.parseJWT(request.getHeader("access_token"), SecurityUtils.getSubject().getSession().getHost());
		Account account = accountMapper.selectInfoByPlatformId(platformId);
		int m = 0;
		//查询用户是否存在，存在则修改信息，不存在则新增信息
		if (null != account) {
			account.setName(parems.getName());
			account.setNickname(parems.getNick());
			account.setSex(String.valueOf(parems.getGender()));
			account.setAddress(parems.getAddress());
			account.setvType(parems.getAtype());
			setAccountValue(parems, account);
			account.setGrade(parems.getGrade());
			account.setBirthday(parems.getBirthday() != null ? DateUtil.parseDate(parems.getBirthday()) : new Date());
			account.setUpdatetime(new Date());
			m = accountMapper.updateByPrimaryKeySelective(account);
		} else {
			account = new Account();
			setAccountValue(parems, account);
			account.setPlatformid(platformId);
			account.setStatus(1);
			account.setUpdatetime(new Date());
			account.setBirthday(new Date());
			account.setRegisteredtime(new Date());
			m = accountMapper.insertSelective(account);
		}
		
		if(m == 1) {
			setUserReturnInfo(info, account);
		} else {
			info.setResultCode(0);
			info.setResultMsg("网络繁忙");
		}
		
		return msg;
	}

	private void setAccountValue(UserParems parems, Account account) {
		account.setCitycode(Integer.parseInt(parems.getRegionCode()));
		account.setCityname(parems.getRegionName());
		account.setProvincecode(Integer.parseInt(parems.getProCode()));
		account.setProvincename(parems.getProName());
		account.setvType(parems.getAtype());
		account.setPhone(parems.getMobile());
	}

	/**
	 * @Title: getWxUserInfo 
	 * @Description: TODO(获取微信用户信息) 
	 * @param userid
	 * @return
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg getWxUserInfo(String userid) {
		UserInfoParams info = new UserInfoParams();
		ResultMsg msg = new ResultMsg(200, info);
		Account account = accountMapper.selectByPrimaryKey(Long.parseLong(userid));
		if(null != account) {
			setUserReturnInfo(info, account);
		} else {
			info.setResultCode(0);
			info.setResultMsg("用户不存在");
		}
		return msg;
	}

	private void setUserReturnInfo(UserInfoParams info, Account account) {
		info.setResultCode(1);
		info.setResultMsg("操作成功");
		info.setId(account.getbId());
		info.setAddress(account.getAddress());
		info.setAtype(account.getvType());
		info.setBirthday(DateUtil.getTime(account.getBirthday()));
		info.setCreateDate(DateUtil.getTime(account.getRegisteredtime()));
		info.setGender(account.getSex() != null ?Integer.parseInt(account.getSex()) : 1);
		info.setGrade(account.getGrade());
		info.setHead(account.getAvatar());
		info.setMobile(account.getPhone());
		info.setName(account.getName());
		info.setNick(account.getNickname());
		info.setPlatformId(account.getPlatformid());
		info.setRegionCode(account.getCitycode().toString());
		info.setRegionName(account.getCityname());
		info.setProCode(account.getProvincecode().toString());
		info.setProName(account.getProvincename());
	}
}
