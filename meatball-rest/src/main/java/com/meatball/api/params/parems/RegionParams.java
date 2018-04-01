/**
 * Project Name:meatball-rest
 * File Name:RegionParams.java
 * Package Name:com.meatball.api.params.parems
 * Date:2018年3月16日下午4:22:49
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.params.parems;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: RegionParams.java 
 * @Package com.meatball.api.params.parems 
 * @Description: TODO(行政区域) 
 * @author zk  
 * @date 2018年3月16日 下午4:22:49 
 * @version V1.0   
 */
@ApiModel
public class RegionParams implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="编码", example="130100")
    private Integer iCode;
	
	@ApiModelProperty(value="地名", example="石家庄市")
    private String vName;
	
	@ApiModelProperty(value="父编码", example="130000")
    private Integer iPcode;
	
	@ApiModelProperty(value="父名称", example="河北省")
    private String vPname;
	
	@ApiModelProperty(value="父级编码", example="130000,130100")
    private String vFcode;
	
	@ApiModelProperty(value="父级名称", example="河北省,石家庄市")
    private String vFname;
	
	@ApiModelProperty(value="类型(1省 2市 3县)", example="1")
    private Integer iType;
	
	@ApiModelProperty(value="区号", example="315")
    private Integer iArea;
	
	@ApiModelProperty(value="邮编", example="63000")
    private Integer iZip;

	public Integer getiCode() {
		return iCode;
	}

	public void setiCode(Integer iCode) {
		this.iCode = iCode;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public Integer getiPcode() {
		return iPcode;
	}

	public void setiPcode(Integer iPcode) {
		this.iPcode = iPcode;
	}

	public String getvPname() {
		return vPname;
	}

	public void setvPname(String vPname) {
		this.vPname = vPname;
	}

	public String getvFcode() {
		return vFcode;
	}

	public void setvFcode(String vFcode) {
		this.vFcode = vFcode;
	}

	public String getvFname() {
		return vFname;
	}

	public void setvFname(String vFname) {
		this.vFname = vFname;
	}

	public Integer getiType() {
		return iType;
	}

	public void setiType(Integer iType) {
		this.iType = iType;
	}

	public Integer getiArea() {
		return iArea;
	}

	public void setiArea(Integer iArea) {
		this.iArea = iArea;
	}

	public Integer getiZip() {
		return iZip;
	}

	public void setiZip(Integer iZip) {
		this.iZip = iZip;
	}
	
}
