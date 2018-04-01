/**
 * Project Name:meatball-rest
 * File Name:MobileValidateParems.java
 * Package Name:com.meatball.api.user.parems
 * Date:2018年3月26日上午9:39:48
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.user.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: MobileValidateParems.java 
 * @Package com.meatball.api.user.parems 
 * @Description: TODO(手机验证返回信息) 
 * @author jw  
 * @date 2018年3月26日 上午9:39:48 
 * @version V1.0   
 */
public class MobileValidateParems implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="操作结果(1：成功 0：失败)", example="1")
	private int resultCode;
	
	@ApiModelProperty(value="操作结果的详细描述信息", example="操作成功")
	private String resultMsg;
	
	@ApiModelProperty(value="手机号", example="135xxxxxxxx")
	private String mobile;
	
	@ApiModelProperty(value="验证码", example="9527")
	private String verifyCode;

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

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
