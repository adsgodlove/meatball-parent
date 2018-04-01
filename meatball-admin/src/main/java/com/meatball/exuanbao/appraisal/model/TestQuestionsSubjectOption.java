/**
 * Project Name:meatball-admin
 * File Name:MeasurementController.java
 * Package Name:com.meatball.exuanbao.measurement
 * Date:2018年3月25日 上午2:55:27 
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.appraisal.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Title: TestQuestionsSubjectOption.java 
 * @Package com.meatball.exuanbao.appraisal.model 
 * @Description: TODO(试题选项表) 
 * @author 張翔宇  
 * @date 2018年3月25日 上午3:11:08 
 * @version V1.0
 */
@ApiModel(value = "questionsSubjectOption", description = "试题选项集合")
public class TestQuestionsSubjectOption implements Serializable {
	private static final long serialVersionUID = 1L;

	// 主键
	@ApiModelProperty(value="选项ID", example="4", required = true)
    private Long bId;

    // 题库关联id
	@ApiModelProperty(value="试题ID", example="4", required = true)
    private Long bQbankid;

    // 选项
	@ApiModelProperty(hidden = true)
	@JsonIgnore
    private String vOption;

    // 选项内容
    @ApiModelProperty(value="选项名称", example="选项一", required = true)
    private String vContent;

    // 分值
    @ApiModelProperty(value="选项分值", example="4", required = true)
    private Float fFraction;

    // 选项类型（radio，checkbox）
    @ApiModelProperty(value="选项类型（radio，checkbox）", example="radio", required = true)
    private String type;
    
    // vo 试题名称
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    private String vQname;

    public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }

    public Long getbQbankid() {
        return bQbankid;
    }

    public void setbQbankid(Long bQbankid) {
        this.bQbankid = bQbankid;
    }

    public String getvOption() {
        return vOption;
    }

    public void setvOption(String vOption) {
        this.vOption = vOption;
    }

    public String getvContent() {
        return vContent;
    }

    public void setvContent(String vContent) {
        this.vContent = vContent;
    }

    public Float getfFraction() {
        return fFraction;
    }

    public void setfFraction(Float fFraction) {
        this.fFraction = fFraction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

	public String getvQname() {
		return vQname;
	}
	
	public void setvQname(String vQname) {
		this.vQname = vQname;
	}
}