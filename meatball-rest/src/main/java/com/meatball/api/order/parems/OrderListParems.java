/**
 * Project Name:meatball-rest
 * File Name:OrderListParems.java
 * Package Name:com.meatball.api.order.controller.parems
 * Date:2018年3月26日下午2:58:27
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.order.parems;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.meatball.exuanbao.pay.model.Payment;

import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: OrderListParems.java 
 * @Package com.meatball.api.order.controller.parems 
 * @Description: TODO(订单列表返回信息) 
 * @author jw  
 * @date 2018年3月26日 下午2:58:27 
 * @version V1.0   
 */
public class OrderListParems implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="操作结果(1：成功 0：失败)", example="1")
	private int resultCode;
	
	@ApiModelProperty(value="操作结果的详细描述信息", example="操作成功")
	private String resultMsg;
	
	@ApiModelProperty(value="订单列表", example="list")
	private List<Payment> list = new ArrayList<Payment>();

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

	public List<Payment> getList() {
		return list;
	}

	public void setList(List<Payment> list) {
		this.list = list;
	}

}
