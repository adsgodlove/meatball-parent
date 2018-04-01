package com.meatball.parameter.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: SchoolBatch.java 
 * @Package com.meatball.parameter.model 
 * @Description: TODO(学校录取批次) 
 * @author zk  
 * @date 2018年3月15日 下午4:40:10 
 * @version V1.0
 */
public class SchoolBatch implements Serializable{
	private static final long serialVersionUID = 1L;
	//id
	private Integer iId;
	//年份
    private Integer dYear;
	//名称
    private String vName;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Integer getdYear() {
        return dYear;
    }

    public void setdYear(Integer dYear) {
        this.dYear = dYear;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName == null ? null : vName.trim();
    }
}