/**
 * Project Name:meatball-rest
 * File Name:Area.java
 * Package Name:com.meatball.parameter.model
 * Date:2018年3月27日下午2:13:51
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.parameter.model;

import java.io.Serializable;
import java.util.List;
import io.swagger.annotations.ApiModel;

/**   
 * @Title: Area.java 
 * @Package com.meatball.parameter.model
 * @Description: TODO(行政区域) 
 * @author zk  
 * @date 2018年3月27日 下午2:13:51 
 * @version V1.0   
 */
@ApiModel
public class Area implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// code
	private Integer v; 
	// 名称
	private String n; 
	// 父code
	private Integer p;
	// 层级
	private Integer t;
	// children。
	private List<Area> c;
	
	public Area(){}
	
	public Area(Integer t) {
		super();
		this.t = t;
	}

	public Area(Integer v, String n, Integer p, Integer t) {
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
	public List<Area> getC() {
		return c;
	}
	public void setC(List<Area> c) {
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
