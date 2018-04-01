/**
 * Project Name:meatball-rest
 * File Name:ServiceParems.java
 * Package Name:com.meatball.api.order.parems
 * Date:2018年3月29日下午3:41:00
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.order.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: ServiceParems.java 
 * @Package com.meatball.api.order.parems 
 * @Description: TODO(服务内容参数类) 
 * @author jw  
 * @date 2018年3月29日 下午3:41:00 
 * @version V1.0   
 */
public class ServiceParems implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="支付类型 :11 智能填报(规划师) 12 智能填报(高级规划师) 13 智能填报(教育专家)", example="11", required = true)
	private int otype;

	public int getOtype() {
		return otype;
	}

	public void setOtype(int otype) {
		this.otype = otype;
	}
	
	
	
}
