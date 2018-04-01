/**
 * Project Name:meatball-core
 * File Name:WXconfig.java
 * Package Name:com.meatball.utils.weixin
 * Date:2018年3月25日下午4:46:57
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.utils.weixin;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**   
 * @Title: WXconfig.java 
 * @Package com.meatball.utils.weixin 
 * @Description: TODO(微信配置) 
 * @author jw  
 * @date 2018年3月25日 下午4:46:57 
 * @version V1.0   
 */
@Component
@ConfigurationProperties(prefix = "weixin")
@PropertySource("classpath:wechat.yml")
public class WXconfig implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Value("${appid}")
	private String appid;
	
	@Value("${appsecret}")
	private String appsecret;
	
	@Value("${mch_id}")
	private String mch_id;
	
	@Value("${key}")
	private String key;
	
	@Value("${payCallback}")
	private String payCallback;
	
	@Value("${host}")
	private String host;

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getAppsecret() {
		return appsecret;
	}

	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}

	public String getMch_id() {
		return mch_id;
	}

	public void setMch_id(String mch_id) {
		this.mch_id = mch_id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getPayCallback() {
		return payCallback;
	}

	public void setPayCallback(String payCallback) {
		this.payCallback = payCallback;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

}
