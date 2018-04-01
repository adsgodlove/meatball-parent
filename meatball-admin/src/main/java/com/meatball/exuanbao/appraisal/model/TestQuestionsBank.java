/**
 * Project Name:meatball-admin
 * File Name:MeasurementController.java
 * Package Name:com.meatball.exuanbao.measurement
 * Date:2018年3月25日 上午2:55:27 
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.appraisal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Title: TestQuestionsBank.java 
 * @Package com.meatball.exuanbao.appraisal.model 
 * @Description: TODO(试题题目) 
 * @author 張翔宇  
 * @date 2018年3月25日 上午2:55:27 
 * @version V1.0
 */
@ApiModel(value = "banks", description = "试题")
public class TestQuestionsBank implements Serializable {
	private static final long serialVersionUID = 1L;

	// 主键
	@ApiModelProperty(value="试题ID", example="1", required = true)
	private Long bId;

	// 试题ID
	@ApiModelProperty(value="分组ID", example="4", required = true)
    private Long bGid;

    // 试题名称
	@ApiModelProperty(value="试题名称", example="这是一道选择题", required = true)
    private String vQname;

    // 题型（radio，checkbox）
	@ApiModelProperty(hidden = true)
	@JsonIgnore
    private String iType;

    // 试题题目
	@ApiModelProperty(hidden = true)
	@JsonIgnore
    private String vTitle;

    // 分值
	@ApiModelProperty(hidden = true)
	@JsonIgnore
    private Float fValue;

    // 创建时间
	@ApiModelProperty(hidden = true)
	@JsonIgnore
    private Date dCreatetime;

    // 正确答案
	@ApiModelProperty(hidden = true)
	@JsonIgnore
    private String vAnswer;

    // 试题解析
	@ApiModelProperty(hidden = true)
	@JsonIgnore
    private String vAnalysis;
    
    // vo 选项数组
	@ApiModelProperty(hidden = true)
	@JsonIgnore
    private String options;
    
    // 当前选题下所有选项
	@ApiModelProperty(value="选项集合", required = true)
    private List<TestQuestionsSubjectOption> questionsSubjectOption;

    public Long getbId() {
        return bId;
    }
    
    public void setbId(Long bId) {
        this.bId = bId;
    }

    /** 
	 * @return bGid 
	 */
	public Long getbGid() {
		return bGid;
	}

	/** 
	 * @param bGid 要设置的 bGid 
	 */
	public void setbGid(Long bGid) {
		this.bGid = bGid;
	}

	public String getvQname() {
        return vQname;
    }

    public void setvQname(String vQname) {
        this.vQname = vQname;
    }
    
    public String getiType() {
		return iType;
	}

	public void setiType(String iType) {
		this.iType = iType;
	}

	public String getvTitle() {
        return vTitle;
    }

    public void setvTitle(String vTitle) {
        this.vTitle = vTitle;
    }

    public Float getfValue() {
        return fValue;
    }

    public void setfValue(Float fValue) {
        this.fValue = fValue;
    }

    public Date getdCreatetime() {
        return dCreatetime;
    }

    public void setdCreatetime(Date dCreatetime) {
        this.dCreatetime = dCreatetime;
    }

    public String getvAnswer() {
        return vAnswer;
    }

    public void setvAnswer(String vAnswer) {
        this.vAnswer = vAnswer;
    }

    public String getvAnalysis() {
        return vAnalysis;
    }

    public void setvAnalysis(String vAnalysis) {
        this.vAnalysis = vAnalysis;
    }

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	/** 
	 * @return questionsSubjectOption 
	 */
	public List<TestQuestionsSubjectOption> getQuestionsSubjectOption() {
		return questionsSubjectOption;
	}

	/** 
	 * @param questionsSubjectOption 要设置的 questionsSubjectOption 
	 */
	public void setQuestionsSubjectOption(List<TestQuestionsSubjectOption> questionsSubjectOption) {
		this.questionsSubjectOption = questionsSubjectOption;
	}
}