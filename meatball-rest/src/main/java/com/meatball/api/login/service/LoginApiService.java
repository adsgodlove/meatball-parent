/**
 * Project Name:meatball-rest
 * File Name:LoginApiService.java
 * Package Name:com.meatball.api.login.service
 * Date:2018年3月2日下午3:25:16
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.login.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.meatball.api.login.parems.LoginParams;
import com.meatball.component.TokenComponent;
import com.meatball.exuanbao.personal.dao.AccountMapper;
import com.meatball.exuanbao.personal.dao.PlatformUserMapper;
import com.meatball.exuanbao.personal.dao.UserTokenMapper;
import com.meatball.exuanbao.personal.model.PlatformUser;
import com.meatball.exuanbao.personal.model.UserToken;
import com.meatball.login.service.LoginService;
import com.meatball.system.user.model.SysUser;
import com.meatball.utils.weixin.WXPublicService;
import com.meatball.utils.weixin.WeixinUser;
import com.meatball.vo.ResultMsg;

/**   
 * @Title: LoginApiService.java 
 * @Package com.meatball.api.login.service 
 * @Description: TODO(登陆权限验证) 
 * @author 張翔宇  
 * @date 2018年3月2日 下午3:25:16 
 * @version V1.0   
 */
@Service
public class LoginApiService {
	@Resource
	private LoginService loginService;
	
	@Resource
	private WXPublicService wxPublicService;
	
	@Resource
	private PlatformUserMapper platformUserMapper;
	
	@Resource
	private UserTokenMapper userTokenMapper;
	
	@Resource
	private AccountMapper accountMapper;
	
	@Resource
	private TokenComponent tokenComponent;
	
	/**
	 * @Title: validate 
	 * @Description: TODO(登陆验证) 
	 * @param params
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg validate(LoginParams params) {
		SysUser user = new SysUser();
		user.setAccount(params.getAccount());
		user.setPassword(params.getPassword());
		return loginService.validate(user);
	}

	/**
	 * @Title: getWeixinRequestInfo 
	 * @Description: TODO(获取微信请求数据) 
	 * @param code
	 * @return
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg getWeixinRequestInfo(String code) {
		ResultMsg msg = null;
		if(null != code) {
			HashMap<String, Object> hm = wxPublicService.getWeixinPulicNumAccessTokenByCode(code);
			if(null == hm.get("errcode")) {
				String openid = (String) hm.get("openid");
				String unionid = (String) hm.get("unionid");
				//先根据openid查询本平台用户表信息是否存在，存在的话更新最新数据，不存在的话再调用微信接口将信息保存在本平台中
				PlatformUser user = platformUserMapper.selectByPrimaryKey(openid);
				WeixinUser weixinUser = wxPublicService.getWeixinPulicNumUserInfoBy(openid);
				if(null != weixinUser) {
					if(null == user) {
						user = new PlatformUser();
						user.setId(openid);
						user.setCreateTime(new Date());
						user.setRegisteFlag(1);
						setPlatformUserByWeixinUser(openid, unionid, user, weixinUser);
						platformUserMapper.insertSelective(user);
					} else {
						setPlatformUserByWeixinUser(openid, unionid, user, weixinUser);
						platformUserMapper.updateByPrimaryKeySelective(user);
					}
					//绑定微信token
					UserToken userToken =  userTokenMapper.getUserTokenByUserId(user.getId());
					String token = UUID.randomUUID().toString();
					if(null != userToken) {
						setUserTokenInfo(userToken, token, user.getId(), new Date().getTime(), (long) -1);
						userTokenMapper.updateByPrimaryKey(userToken);
					} else {
						userToken = new UserToken();
						setUserTokenInfo(userToken, token, user.getId(), new Date().getTime(), (long) -1);
						userTokenMapper.insert(userToken);
					}
					
					msg = new ResultMsg(200, "微信数据接收成功",tokenComponent.createJWT(user.getId()));
					
				}
			} else {
				msg = new ResultMsg(200,"微信数据为空");
			}
			
		} else {
			msg = new ResultMsg(200,"请求参数为空");
		}
		return msg;
	}
	 

	private void setPlatformUserByWeixinUser(String openid, String unionid, PlatformUser user, WeixinUser weixinUser) {
		String sexString = weixinUser.getSex();
		if(null != sexString) {
			user.setSex("1".equals(sexString) ? 1 : "2".equals(sexString) ? 2 : 9);
			user.setSexName(sexString.equals("1")?"男":sexString.equals("2")?"女":"未知");
		}
		user.setBindType("微信");
		try {
			user.setNick(URLEncoder.encode(weixinUser.getNickname() != null ? weixinUser.getNickname() : "昵称不存在", "utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		user.setHead(weixinUser.getHeadimgurl());
		user.setUnionid(unionid);
		user.setLoginEndDate(new Date());
		user.setOpendid(openid);
		user.setUpdateTime(new Date());
	}

	
	private void setUserTokenInfo(UserToken utn,String tokenid,String userid,Long createTime,Long expiresTime) {
		utn.setToken(tokenid);
		utn.setUserId(userid);
		utn.setCreateTime(createTime);
		utn.setExpiresTime(expiresTime);
		
	}
}
