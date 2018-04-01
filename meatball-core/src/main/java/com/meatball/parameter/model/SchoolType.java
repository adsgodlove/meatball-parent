package com.meatball.parameter.model;

import java.io.Serializable;

/**
 * @Title: SchoolType.java 
 * @Package com.meatball.parameter.model 
 * @Description: TODO(学校类型) 
 * @author zk  
 * @date 2018年3月15日 下午4:40:20 
 * @version V1.0
 */
public class SchoolType implements Serializable{
	private static final long serialVersionUID = 1L;
	//id
	private Integer iId;
	//名称
    private String vName;
	//类型
    private Integer iType;
	//父级id
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
        this.vName = vName == null ? null : vName.trim();
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