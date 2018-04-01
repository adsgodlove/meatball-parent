/**
 * Project Name:meatball-core
 * File Name:WXPublicService.java
 * Package Name:com.meatball.utils.weixin
 * Date:2018年3月25日下午3:47:38
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.utils.weixin;

import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.meatball.utils.HttpHelper;
import com.meatball.utils.JsonMapper;

/**   
 * @Title: WXPublicService.java 
 * @Package com.meatball.utils.weixin 
 * @Description: TODO(微信公众平台授权类接口) 
 * @author jw  
 * @date 2018年3月25日 下午3:47:38 
 * @version V1.0   
 */
@Service
public class WXPublicService {

	@Resource
	private WXconfig wXconfig;
	 
	public static WeixinToken weixinToken = new WeixinToken();
	
	@SuppressWarnings("unchecked")
	public HashMap<String, Object> getWeixinPulicNumAccessTokenByCode(String code) {
		String jsonString = HttpHelper.requestGet("https://api.weixin.qq.com/sns/oauth2/access_token?appid="+wXconfig.getAppid()+"&secret="+wXconfig.getAppsecret()+"&code="+code+"&grant_type=authorization_code");
		HashMap<String, Object>  map= JsonMapper.getInstance().fromJson(jsonString, HashMap.class);
		return map;
	}

	public WeixinUser getWeixinPulicNumUserInfoBy(String openid) {
		String userString = HttpHelper.requestPost("https://api.weixin.qq.com/cgi-bin/user/info?access_token="+
										getWeiXinPublicToken()+"&openid="+openid);
		WeixinUser user = (WeixinUser) JsonMapper.fromJsonString(userString, WeixinUser.class); 
		return user;
	}

	@SuppressWarnings("deprecation")
	public String createWeixinMenu(String access_token) {
		
		String mainurl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + wXconfig.getAppid() + "&redirect_uri=" + URLEncoder.encode(wXconfig.getHost()+"/main/chengshi") + 
		"&response_type=code&scope=snsapi_userinfo&state=1#wechat_redirect";
		
		String zhaoshang = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + wXconfig.getAppid() + "&redirect_uri=" + URLEncoder.encode(wXconfig.getHost()+"/project/index") + 
				"&response_type=code&scope=snsapi_userinfo&state=1#wechat_redirect";
				
		String guanyu = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + wXconfig.getAppid() + "&redirect_uri=" + URLEncoder.encode(wXconfig.getHost()+"/service/index") + 
				"&response_type=code&scope=snsapi_userinfo&state=1#wechat_redirect";		
		
		String url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token="+access_token;
		String menujson = "{\"button\":[{\"type\":\"view\",\"name\":\"城市合伙人\", \"url\":\""+mainurl+"\"}, "
				+ "{\"type\":\"view\",\"name\":\"拿项目\", \"url\":\""+zhaoshang+"\"},"
				+ "{\"type\":\"view\",\"name\":\"找服务\", \"url\":\""+guanyu+"\"} ]}";
		 
		return HttpHelper.requestPost(url,menujson);
	}

	
	
	/**
	 * 获取微信公众号token
	 * @param weiXinToken
	 * @return
	 */
	public String getWeiXinPublicToken() {
		Long nowTime = new Date().getTime();
		if (null != weixinToken.getCreateTime()) {
			//如果以前时间加上2个小时 小于当前时间，则查询新的token，并将创建时间重新赋值
			if(weixinToken.getCreateTime() + 7200000 < nowTime) {
				return getNewUserTokenByWeiXinPublicNum();
				
			} else {
				return weixinToken.getAccess_token();
			}
		} else {
			return getNewUserTokenByWeiXinPublicNum();
		}
		
	}
	
	
	/**
	 * 获取新的微信公众号token
	 * @param nowTime
	 * @return
	 */
	private String getNewUserTokenByWeiXinPublicNum() {
		String str = HttpHelper.requestGet("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+wXconfig.getAppid()+"&secret="+wXconfig.getAppsecret());
		String access_token = (String) JsonMapper.getInstance().fromJson(str, HashMap.class).get("access_token");
		if(null != access_token && !"".equals(access_token)) {
			weixinToken.setAccess_token(access_token);
			weixinToken.setCreateTime(new Date().getTime());
			return access_token;
		} else {
			return getWeiXinPublicToken();
		}
	}
	
	
	public static void main(String[] args) {
		String string = HttpHelper.requestGet("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+new WXconfig().getAppid()+"&secret="+ new WXconfig().getAppsecret());
		@SuppressWarnings("unchecked")
		Map<String, Object> map = JsonMapper.getInstance().fromJson(string, HashMap.class);
		new WXPublicService().createWeixinMenu(map.get("access_token").toString());
	}
}
