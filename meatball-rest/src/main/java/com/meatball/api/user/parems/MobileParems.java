/**
 * Project Name:meatball-rest
 * File Name:MobileParems.java
 * Package Name:com.meatball.api.user.parems
 * Date:2018年3月26日上午9:39:38
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.user.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: MobileParems.java 
 * @Package com.meatball.api.user.parems 
 * @Description: TODO(手机参数类) 
 * @author jw  
 * @date 2018年3月26日 上午9:39:38 
 * @version V1.0   
 */
public class MobileParems implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="手机号", example="13503345874", required=true)
	private String mobile;
	
	@ApiModelProperty(value="验证码", example="6666", required=true)
	private String verifyCode;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	
	
}
