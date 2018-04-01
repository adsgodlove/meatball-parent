/**
 * Project Name:meatball-rest
 * File Name:FeedbackResultParems.java
 * Package Name:com.meatball.api.note.parems
 * Date:2018年3月30日下午3:47:05
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.note.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: FeedbackResultParems.java 
 * @Package com.meatball.api.note.parems 
 * @Description: TODO(意见反馈返回信息) 
 * @author jw  
 * @date 2018年3月30日 下午3:47:05 
 * @version V1.0   
 */
public class FeedbackResultParems implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="操作结果(1：成功 0：失败)", example="1")
	private int resultCode;
	
	@ApiModelProperty(value="操作结果的详细描述信息", example="操作成功")
	private String resultMsg;

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
	
}
