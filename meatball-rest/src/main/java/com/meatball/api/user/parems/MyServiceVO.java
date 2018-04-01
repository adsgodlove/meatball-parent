/**
 * Project Name:meatball-rest
 * File Name:MyServiceVO.java
 * Package Name:com.meatball.api.order.parems
 * Date:2018年3月29日下午5:07:35
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.user.parems;

import java.io.Serializable;

/**   
 * @Title: MyServiceVO.java 
 * @Package com.meatball.api.order.parems 
 * @Description: TODO(我的服务列表VO) 
 * @author jw  
 * @date 2018年3月29日 下午5:07:35 
 * @version V1.0   
 */
public class MyServiceVO implements Serializable {
	private static final long serialVersionUID = 1L;

    private String stype;//服务类型  智能填报
	
    private String sclass;//服务类别    规划师

    private String payTime;//服务时间

	public String getStype() {
		return stype;
	}

	public void setStype(String stype) {
		this.stype = stype;
	}

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
    
    
}
