/**
 * Project Name:meatball-rest
 * File Name:SuperioritySchoolParems.java
 * Package Name:com.meatball.api.school.parems
 * Date:2018年3月26日下午3:09:43
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.school.parems;

import java.io.Serializable;
import com.meatball.vo.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: SuperioritySchoolParems.java 
 * @Package com.meatball.api.school.parems 
 * @Description: TODO(优势院校查询) 
 * @author zk  
 * @date 2018年3月26日 下午3:09:43 
 * @version V1.0   
 */
@ApiModel
public class SuperioritySchoolParems extends Page implements Serializable {

	private static final long serialVersionUID = 1L;
	//专业id(查询该专业优势院校)
	@ApiModelProperty(value="专业id(查询该专业优势院校)", example="10001", required = true)
	private Long specialtyid;

	public Long getSpecialtyid() {
		return specialtyid;
	}

	public void setSpecialtyid(Long specialtyid) {
		this.specialtyid = specialtyid;
	}
	
}
