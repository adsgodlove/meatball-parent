/**
 * Project Name:meatball-rest
 * File Name:AreaParams.java
 * Package Name:com.meatball.api.params.parems
 * Date:2018年3月27日下午2:13:51
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.params.parems;

import java.io.Serializable;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: AreaParams.java 
 * @Package com.meatball.api.params.parems 
 * @Description: TODO(行政区域) 
 * @author zk  
 * @date 2018年3月27日 下午2:13:51 
 * @version V1.0   
 */
@ApiModel
public class AreaParams implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// code
	@ApiModelProperty(value="区域编码", example="110000")
	private Integer v; 
	// 名称
	@ApiModelProperty(value="名称", example="北京")
	private String n; 
	// 父code
	@ApiModelProperty(value="父code", example="110000")
	private Integer p;
	// 层级
	@ApiModelProperty(value="层级", example="1")
	private Integer t;
	// children。
	@ApiModelProperty(value="children", example="[]")
	private List<AreaParams> c;
	
	public AreaParams(){}
	
	public AreaParams(Integer v, String n, Integer p, Integer t) {
		super();
		this.v = v;
		this.n = n;
		this.p = p;
		this.t = t;
	}

	public Integer getV() {
		return v;
	}
	public void setV(Integer v) {
		this.v = v;
	}
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	public List<AreaParams> getC() {
		return c;
	}
	public void setC(List<AreaParams> c) {
		this.c = c;
	}
	public Integer getP() {
		return p;
	}
	public void setP(Integer p) {
		this.p = p;
	}
	public Integer getT() {
		return t;
	}
	public void setT(Integer t) {
		this.t = t;
	} 
	
}
