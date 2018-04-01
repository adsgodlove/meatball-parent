package com.meatball.api.params.parems;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Title: SchoolBatchParams.java 
 * @Package com.meatball.api.params.parems 
 * @Description: TODO(学校录取批次) 
 * @author zk  
 * @date 2018年3月16日 下午4:58:58 
 * @version V1.0
 */
@ApiModel
public class SchoolBatchParams implements Serializable{
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="id", example="1")
	private Integer iId;

	@ApiModelProperty(value="年份", example="2017")
    private Date dYear;

	@ApiModelProperty(value="名称", example="xxx")
    private String vName;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Date getdYear() {
        return dYear;
    }

    public void setdYear(Date dYear) {
        this.dYear = dYear;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName == null ? null : vName.trim();
    }
}