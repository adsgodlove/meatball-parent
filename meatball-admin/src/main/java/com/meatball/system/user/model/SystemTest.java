/**
 * Project Name:meatball-admin
 * File Name:SystemTest.java
 * Package Name:com.meatball.system.user.model
 * Date:2018年4月1日上午11:01:33
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.system.user.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Title: SystemTest.java
 * @Package com.meatball.system.user.model
 * @Description: TODO(用一句话描述该文件做什么)
 * @author 張翔宇
 * @date 2018年4月1日 上午11:01:33
 * @version V1.0
 */
@Entity
public class SystemTest {
	// 主键
	@Id
	@GeneratedValue
	private Long id;

	// 头像
	@NotEmpty
	private String avatar;

	// 账号
	private String account;

	// 密码
	private String password;
	// vo 是否重置密码
	private boolean resetPwd = false;

	// md5密码盐
	private String salt;

	// 名字
	private String name;
	
	private Date birthday;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isResetPwd() {
		return resetPwd;
	}

	public void setResetPwd(boolean resetPwd) {
		this.resetPwd = resetPwd;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
