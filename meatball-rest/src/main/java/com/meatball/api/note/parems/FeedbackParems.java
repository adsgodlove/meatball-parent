/**
 * Project Name:meatball-rest
 * File Name:FeedbackParems.java
 * Package Name:com.meatball.api.order.parems
 * Date:2018年3月30日下午3:46:13
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.note.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: FeedbackParems.java 
 * @Package com.meatball.api.order.parems 
 * @Description: TODO(意见反馈参数类) 
 * @author jw  
 * @date 2018年3月30日 下午3:46:13 
 * @version V1.0   
 */
public class FeedbackParems implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="意见内容", example="胜多负少快乐撒地方后就开始大华会计师大会就开始大幅很快就", required = true)
	private String content;
	
	@ApiModelProperty(value="用户id", example="12", required = true)
	private String userid;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	

}
