/**
 * Project Name:meatball-rest
 * File Name:PayResultParems.java
 * Package Name:com.meatball.api.user.parems
 * Date:2018年3月26日下午5:15:57
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.order.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: PayResultParems.java 
 * @Package com.meatball.api.user.parems 
 * @Description: TODO(下单返回信息) 
 * @author jw  
 * @date 2018年3月26日 下午5:15:57 
 * @version V1.0   
 */
public class PayResultParems implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="交易结果(1：成功 0：失败)", example="1")
	private int resultCode;
	
	@ApiModelProperty(value="支付结果的详细描述信息", example="微信支付成功20元")
	private String resultMsg;
	
	@ApiModelProperty(value="订单详情扩展字符串", example="prepay_id=123456789")
	private String orderNumber;
	
	@ApiModelProperty(value="公众号id", example="wx8888888888888888")
	private String appId;
	
	@ApiModelProperty(value="时间戳，自1970年以来的秒数", example="1414561699")
	private String timeStamp;
	
	@ApiModelProperty(value="随机串", example="5K8264ILTKCH16CQ2502SI8ZNMTM67VS")
	private String nonceStr;
	
	@ApiModelProperty(value="微信签名方式", example="MD5")
	private String signType;
	
	@ApiModelProperty(value="微信签名 ", example="C380BEC2BFD727A4B6845133519F3AD6")
	private String paySign;

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

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getNonceStr() {
		return nonceStr;
	}

	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getPaySign() {
		return paySign;
	}

	public void setPaySign(String paySign) {
		this.paySign = paySign;
	}


}
