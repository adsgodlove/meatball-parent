/**
 * Project Name:meatball-rest
 * File Name:MyNoteInfoParems.java
 * Package Name:com.meatball.api.note.parems
 * Date:2018年3月30日下午2:50:26
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.note.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: MyNoteInfoParems.java 
 * @Package com.meatball.api.note.parems 
 * @Description: TODO(服务消息详情返回信息) 
 * @author jw  
 * @date 2018年3月30日 下午2:50:26 
 * @version V1.0   
 */
public class MyNoteInfoParems implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="操作结果(1：成功 0：失败)", example="1")
	private int resultCode;
	
	@ApiModelProperty(value="操作结果的详细描述信息", example="操作成功")
	private String resultMsg;
	
	@ApiModelProperty(value="通知id", example="1")
	private Long bId;

	@ApiModelProperty(value="标题", example="贪玩蓝月")
    private String vTitle; 

	@ApiModelProperty(value="内容", example="大概好我系咋咋辉")
    private String vContent; 

	@ApiModelProperty(value="发送时间(yyyy-MM-dd HH:mm:ss)", example="2018-03-22 03:01:00")
    private String tSendtime; 

	@ApiModelProperty(value="创建时间(yyyy-MM-dd HH:mm:ss)", example="2018-03-30 12:07:25")
    private String tCreatetime; 

	@ApiModelProperty(value="状态 0 无效  1有效", example="1")
    private int iStatus; 

	@ApiModelProperty(value="通知类型", example="1")
    private int iType;
	
	@ApiModelProperty(value="通知类型名称", example="消息")
    private String iTypeName;

	public String getiTypeName() {
		return iTypeName;
	}

	public void setiTypeName(String iTypeName) {
		this.iTypeName = iTypeName;
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

	public Long getbId() {
		return bId;
	}

	public void setbId(Long bId) {
		this.bId = bId;
	}

	public String getvTitle() {
		return vTitle;
	}

	public void setvTitle(String vTitle) {
		this.vTitle = vTitle;
	}

	public String getvContent() {
		return vContent;
	}

	public void setvContent(String vContent) {
		this.vContent = vContent;
	}

	public String gettSendtime() {
		return tSendtime;
	}

	public void settSendtime(String tSendtime) {
		this.tSendtime = tSendtime;
	}

	public String gettCreatetime() {
		return tCreatetime;
	}

	public void settCreatetime(String tCreatetime) {
		this.tCreatetime = tCreatetime;
	}

	public int getiStatus() {
		return iStatus;
	}

	public void setiStatus(int iStatus) {
		this.iStatus = iStatus;
	}

	public int getiType() {
		return iType;
	}

	public void setiType(int iType) {
		this.iType = iType;
	}

}
