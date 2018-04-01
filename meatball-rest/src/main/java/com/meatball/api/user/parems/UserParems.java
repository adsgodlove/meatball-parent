/**
 * Project Name:meatball-rest
 * File Name:UserParems.java
 * Package Name:com.meatball.api.user.parems
 * Date:2018年3月4日下午3:48:58
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.user.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: UserParems.java 
 * @Package com.meatball.api.user.parems 
 * @Description: TODO(微信完善信息参数类) 
 * @author 張翔宇  
 * @date 2018年3月4日 下午3:48:58 
 * @version V1.0   
 */
public class UserParems implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="手机号", example="135xxxxxxxx", required=true)
	private String mobile;
	
	@ApiModelProperty(value="省份编码", example="8888", required=true)
	private String proCode;
	
	@ApiModelProperty(value="省份名称", example="四川省", required=true)
	private String proName;
	
	@ApiModelProperty(value="地区编码", example="9527", required=true)
	private String regionCode;
	
	@ApiModelProperty(value="地区名称", example="成华区", required=true)
	private String regionName;
	
	@ApiModelProperty(value="文/理科", example="文科", required=true)
	private String atype;
	
	@ApiModelProperty(value="token", example="asdasdasd", required=true)
	private String token;
	
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
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
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

	 
}
