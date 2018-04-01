/**
 * Project Name:meatball-rest
 * File Name:MyServiceParems.java
 * Package Name:com.meatball.api.order.parems
 * Date:2018年3月29日下午3:52:57
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.order.parems;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.meatball.api.user.parems.MyServiceVO;

import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: MyServiceParems.java 
 * @Package com.meatball.api.order.parems 
 * @Description: TODO(我的服务列表返回类) 
 * @author jw  
 * @date 2018年3月29日 下午3:52:57 
 * @version V1.0   
 */
public class MyServiceParems implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="操作结果(1：成功 0：失败)", example="1")
	private int resultCode;
	
	@ApiModelProperty(value="操作结果的详细描述信息", example="操作成功")
	private String resultMsg;
	
	@ApiModelProperty(value="服务列表", example="list")
    private List<MyServiceVO> list = new ArrayList<MyServiceVO>();

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

	public List<MyServiceVO> getList() {
		return list;
	}

	public void setList(List<MyServiceVO> list) {
		this.list = list;
	}
	 

	 
}
