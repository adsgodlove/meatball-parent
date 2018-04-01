/**
 * Project Name:meatball-rest
 * File Name:PidParams.java
 * Package Name:com.meatball.api.params.parems
 * Date:2018年3月16日下午4:20:06
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.params.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: PidParams.java 
 * @Package com.meatball.api.params.parems 
 * @Description: TODO(父id参数) 
 * @author zk  
 * @date 2018年3月16日 下午4:20:06 
 * @version V1.0   
 */
@ApiModel
public class PidParams implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="父级id", example="1", required = true)
	private Integer iPid;

	public Integer getiPid() {
		return iPid;
	}

	public void setiPid(Integer iPid) {
		this.iPid = iPid;
	}
	
}
