/**
 * Project Name:meatball-rest
 * File Name:PcodeParams.java
 * Package Name:com.meatball.api.params.parems
 * Date:2018年3月16日下午4:17:42
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.params.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: PcodeParams.java 
 * @Package com.meatball.api.params.parems 
 * @Description: TODO(通过父级编码查询参数) 
 * @author zk  
 * @date 2018年3月16日 下午4:17:42 
 * @version V1.0   
 */
@ApiModel
public class PcodeParams implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="父级编码", example="110000", required = true)
	private Integer iPcode;

	public Integer getiPcode() {
		return iPcode;
	}

	public void setiPcode(Integer iPcode) {
		this.iPcode = iPcode;
	}

	
}
