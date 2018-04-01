/**
 * Project Name:meatball-rest
 * File Name:UserInfoParams.java
 * Package Name:com.meatball.api.user.parems
 * Date:2018年3月26日上午9:39:25
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.user.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: UserInfoParams.java 
 * @Package com.meatball.api.user.parems 
 * @Description: TODO(用户返回信息) 
 * @author jw  
 * @date 2018年3月26日 上午9:39:25 
 * @version V1.0   
 */
public class UserInfoParams implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="操作结果(1：成功 0：失败)", example="1")
	private int resultCode;
	
	@ApiModelProperty(value="操作结果的详细描述信息", example="操作成功")
	private String resultMsg;
	
	@ApiModelProperty(value="用户id", example="123")
	private Long id;

	@ApiModelProperty(value="手机号", example="135xxxxxxxx")
	private String mobile;
	
	@ApiModelProperty(value="省份编码", example="8888")
	private String proCode;
	
	@ApiModelProperty(value="省份名称", example="四川省")
	private String proName;
	
	@ApiModelProperty(value="地区编码", example="9527")
	private String regionCode;
	
	@ApiModelProperty(value="地区名称", example="成华区")
	private String regionName;
	
	@ApiModelProperty(value="文/理科", example="文科")
	private String atype;
	
	@ApiModelProperty(value="平台id", example="asdasdasd")
	private String platformId;
	
	@ApiModelProperty(value="姓名", example="大天二")
	private String name;
	
	@ApiModelProperty(value="昵称", example="小包")
	private String nick;
	
	@ApiModelProperty(value="头像", example="大天二")
	private String head;
	
	@ApiModelProperty(value="性别（1 男 2女）", example="1")
	private int gender;
	
	@ApiModelProperty(value="年级", example="初中")
	private String grade;
	
	@ApiModelProperty(value="住址", example="四川省成都市xx区xx街道")
	private String address;
	
	@ApiModelProperty(value="出生日期 (yyyy-MM-dd)", example="1990-10-10")
	private String birthday;
	
	@ApiModelProperty(value="注册时间 (yyyy-MM-dd HH:mm:ss)", example="2010-10-10 15:11:12")
	private String createDate;

	public String getProCode() {
		return proCode;
	}

	public void setProCode(String proCode) {
		this.proCode = proCode;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
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

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	
}
