/**
 * Project Name:meatball-rest
 * File Name:PayParems.java
 * Package Name:com.meatball.api.user.parems
 * Date:2018年3月26日下午5:04:09
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.order.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: PayParems.java 
 * @Package com.meatball.api.user.parems 
 * @Description: TODO(支付参数类) 
 * @author jw  
 * @date 2018年3月26日 下午5:04:09 
 * @version V1.0   
 */
public class PayParems implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="用户id", example="111111", required = true)
	private Long userId;

	@ApiModelProperty(value="支付类型 :11 智能填报(规划师) 12 智能填报(高级规划师) 13 智能填报(教育专家)", example="11", required = true)
	private int orderType;
	
	@ApiModelProperty(value="金额(单位:元)", example="5000", required = true)
	private String balance;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public int getOrderType() {
		return orderType;
	}

	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	
}
