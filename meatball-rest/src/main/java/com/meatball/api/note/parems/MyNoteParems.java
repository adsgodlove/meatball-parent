/**
 * Project Name:meatball-rest
 * File Name:MyNoteParems.java
 * Package Name:com.meatball.api.note.parems
 * Date:2018年3月30日下午2:50:07
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.note.parems;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.meatball.exuanbao.note.model.Note;

import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: MyNoteParems.java 
 * @Package com.meatball.api.note.parems 
 * @Description: TODO(服务消息列表返回信息) 
 * @author jw  
 * @date 2018年3月30日 下午2:50:07 
 * @version V1.0   
 */
public class MyNoteParems implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="操作结果(1：成功 0：失败)", example="1")
	private int resultCode;
	
	@ApiModelProperty(value="操作结果的详细描述信息", example="操作成功")
	private String resultMsg;
	
	@ApiModelProperty(value="服务消息列表", example="list")
    private List<Note> list = new ArrayList<Note>();

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

	public List<Note> getList() {
		return list;
	}

	public void setList(List<Note> list) {
		this.list = list;
	}
	

}
