/**
 * Project Name:meatball-rest
 * File Name:HierarchyParams.java
 * Package Name:com.meatball.api.params.parems
 * Date:2018年3月16日下午5:05:57
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.params.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: HierarchyParams.java 
 * @Package com.meatball.api.params.parems 
 * @Description: TODO(层次参数) 
 * @author zk  
 * @date 2018年3月16日 下午5:05:57 
 * @version V1.0   
 */
@ApiModel
public class HierarchyParams implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="id", example="1")
	private Integer iId;

	@ApiModelProperty(value="名称", example="xxx")
    private String vName;

	@ApiModelProperty(value="类型", example="0")
    private Integer iType;

	@ApiModelProperty(value="父级id", example="0")
    private Integer iPid;

	public Integer getiId() {
		return iId;
	}

	public void setiId(Integer iId) {
		this.iId = iId;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public Integer getiType() {
		return iType;
	}

	public void setiType(Integer iType) {
		this.iType = iType;
	}

	public Integer getiPid() {
		return iPid;
	}

	public void setiPid(Integer iPid) {
		this.iPid = iPid;
	}
	
}
