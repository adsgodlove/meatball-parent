/**
 * Project Name:meatball-rest
 * File Name:OrderInfoParems.java
 * Package Name:com.meatball.api.order.controller.parems
 * Date:2018年3月26日下午2:46:28
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.order.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: OrderInfoParems.java 
 * @Package com.meatball.api.order.controller.parems 
 * @Description: TODO(订单详情返回信息) 
 * @author jw  
 * @date 2018年3月26日 下午2:46:28 
 * @version V1.0   
 */
public class OrderInfoParems implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="操作结果(1：成功 0：失败)", example="1")
	private int resultCode;
	
	@ApiModelProperty(value="操作结果的详细描述信息", example="操作成功")
	private String resultMsg;
	
	@ApiModelProperty(value="订单id", example="123")
	private long id;
	
	@ApiModelProperty(value="支付类型 :11 智能填报(规划师) 12 智能填报(高级规划师) 13 智能填报(教育专家)", example="11")
	private Integer iType;

	@ApiModelProperty(value="用户姓名", example="安安")
    private String username;

	@ApiModelProperty(value="支付平台  wx微信 zfb支付宝", example="wx")
    private String paytype;

	@ApiModelProperty(value="支付平台交易流水号", example="adsadsad")
    private String dealid;

	@ApiModelProperty(value="支付金额", example="操作成功")
    private String money; 

	@ApiModelProperty(value="用户电话", example="13500000000")
    private String tel;

	@ApiModelProperty(value="支付时间(yyyy-MM-dd HH:mm:ss)", example="2010-10-10 15:11:12")
    private String payTime;

	@ApiModelProperty(value="支付状态 0失败 1成功 9未支付", example="1")
    private int iStatus;

	@ApiModelProperty(value="备注", example="xxxxx")
    private String remark;

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getiType() {
		return iType;
	}

	public void setiType(Integer iType) {
		this.iType = iType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPaytype() {
		return paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public String getDealid() {
		return dealid;
	}

	public void setDealid(String dealid) {
		this.dealid = dealid;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public int getiStatus() {
		return iStatus;
	}

	public void setiStatus(int iStatus) {
		this.iStatus = iStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	 
}
