/**
 * Project Name:meatball-rest
 * File Name:SuperioritySpecialtyParems.java
 * Package Name:com.meatball.api.specialty.parems
 * Date:2018年3月26日下午3:17:14
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.specialty.parems;

import java.io.Serializable;
import com.meatball.vo.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: SuperioritySpecialtyParems.java 
 * @Package com.meatball.api.specialty.parems 
 * @Description: TODO(优势专业查询) 
 * @author zk  
 * @date 2018年3月26日 下午3:17:14 
 * @version V1.0   
 */
@ApiModel
public class SuperioritySpecialtyParems extends Page implements Serializable{

	private static final long serialVersionUID = 1L;
	//院校id(查询该院校优势专业)
	@ApiModelProperty(value="院校id(查询该院校优势专业)", example="10001", required = true)
	private Long schoolid;
	
	public Long getSchoolid() {
		return schoolid;
	}
	public void setSchoolid(Long schoolid) {
		this.schoolid = schoolid;
	}
	
}
