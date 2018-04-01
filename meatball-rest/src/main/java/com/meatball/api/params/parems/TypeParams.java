/**
 * Project Name:meatball-rest
 * File Name:TypeParams.java
 * Package Name:com.meatball.api.params.parems
 * Date:2018年3月16日下午4:49:23
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.params.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: TypeParams.java 
 * @Package com.meatball.api.params.parems 
 * @Description: TODO(行政区域类型) 
 * @author zk  
 * @date 2018年3月16日 下午4:49:23 
 * @version V1.0   
 */
@ApiModel
public class TypeParams implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="类型(1省 2市 3县)", example="1", required = true)
    private Integer iType;

	public Integer getiType() {
		return iType;
	}

	public void setiType(Integer iType) {
		this.iType = iType;
	}
	
}
