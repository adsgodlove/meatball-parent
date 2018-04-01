/**
 * Project Name:meatball-rest
 * File Name:TypeParams.java
 * Package Name:com.meatball.api.specialty.parems
 * Date:2018年3月25日下午3:59:26
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.specialty.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: TypeParams.java 
 * @Package com.meatball.api.specialty.parems 
 * @Description: TODO(专业类型查询专业) 
 * @author zk  
 * @date 2018年3月25日 下午3:59:26 
 * @version V1.0   
 */
@ApiModel
public class SuperiorityTypeParams implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="类型(全部专业 10、热门专业 11、女生适合专业 12、男生适合专业 13、文科热门专业 14、理科热门专业 15)", example="1", required = true)
	private Integer iType;

	public Integer getiType() {
		return iType;
	}

	public void setiType(Integer iType) {
		this.iType = iType;
	}

}
