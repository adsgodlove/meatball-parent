/**
 * Project Name:meatball-core
 * File Name:ResultMsg.java
 * Package Name:com.meatball.vo
 * Date:2017年10月17日下午4:18:11
 * Copyright (c) 2017, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import springfox.documentation.annotations.ApiIgnore;

/**   
 * @Title: ResultMsg.java 
 * @Package com.meatball.vo 
 * @Description: TODO(返回消息) 
 * @author 張翔宇  
 * @date 2017年10月17日 下午4:18:11 
 * @version V1.0   
 */
@ApiModel(value = "ResultMsg", description = "消息返回")
@ApiIgnore
public class ResultMsg implements Serializable {
	private static final long serialVersionUID = 1L;

	// 状态码
	@ApiModelProperty("状态码")
	private int code;
	
	// 消息内容
	@ApiModelProperty("消息内容")
	private String message;
	
	//
	@ApiModelProperty("权限令牌")
	private String access_token;
	
	@ApiModelProperty("返回数据")
	private Object data;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public ResultMsg(int code) {
		this.code = code;
	}
	
	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ResultMsg(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public ResultMsg(int code, String message, String access_token) {
		this.code = code;
		this.message = message;
		this.access_token = access_token;
	}
	
	public ResultMsg(int code, String message, String access_token, Object data) {
		this.code = code;
		this.message = message;
		this.access_token = access_token;
		this.data = data;
	}
	
	public ResultMsg(int code, Object data) {
		this.code = code;
		this.data = data;
	}
	
	public ResultMsg(int code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}
}
