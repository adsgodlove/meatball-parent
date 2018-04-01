/**
 * Project Name:meatball-rest
 * File Name:ServiceInfoParems.java
 * Package Name:com.meatball.api.order.parems
 * Date:2018年3月29日下午3:51:51
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.order.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: ServiceInfoParems.java 
 * @Package com.meatball.api.order.parems 
 * @Description: TODO(服务内容返回信息类) 
 * @author jw  
 * @date 2018年3月29日 下午3:51:51 
 * @version V1.0   
 */
public class ServiceInfoParems implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="操作结果(1：成功 0：失败)", example="1")
	private int resultCode;
	
	@ApiModelProperty(value="操作结果的详细描述信息", example="操作成功")
	private String resultMsg;
	
	@ApiModelProperty(value="服务内容", example="啊啊啊啊啊啊")
	private String content;
	
	@ApiModelProperty(value="服务流程", example="啊啊啊啊啊啊啊")
	private String flow;
	
	@ApiModelProperty(value="服务保障", example="啊啊啊啊啊啊啊啊")
	private String security;

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFlow() {
		return flow;
	}

	public void setFlow(String flow) {
		this.flow = flow;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}
	

}
