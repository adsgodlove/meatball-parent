package com.meatball.utils.weixin;

import java.io.Serializable;

/**
 * 全局的微信公众号access_token实体
 * @author jw
 *
 */
public class WeixinToken implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * 微信公众号access_token
	 */
	private String access_token;
	
	/**
	 * 创建时间的总秒数
	 */
	private Long createTime;
	
	public WeixinToken() {
		
	}
	
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	
	
}
