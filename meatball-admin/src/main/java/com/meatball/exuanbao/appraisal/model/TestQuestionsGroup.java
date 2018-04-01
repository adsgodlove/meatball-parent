package com.meatball.exuanbao.appraisal.model;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Title: TestQuestionsGroup.java 
 * @Package com.meatball.exuanbao.appraisal.model 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 張翔宇  
 * @date 2018年3月27日 下午3:04:14 
 * @version V1.0
 */
@ApiModel(value = "试题分组")
public class TestQuestionsGroup implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="分组ID", example="1", required = true)
	private Long id;
	
	@ApiModelProperty(value="试卷ID", example="4", required = true)
    private Long qId;

	@ApiModelProperty(value="分组名称", example="第一组", required = true)
    private String name;

	@ApiModelProperty(value="分组描述", example="这是一组选择题", required = true)
    private String des;
	
	@ApiModelProperty(value="测评解析", example="你非常具有XX能力，棒极了", required = true)
    private String appraisalAnalysis;
	
	@ApiModelProperty(value="专业推荐", example="软件工程、信息化技术", required = true)
    private String specialtyRecommend;

	@ApiModelProperty(value="职业推荐", example="法师、战士、猎人、圣骑士", required = true)
    private String professionRecommend;
    
    // 试题集合
	@ApiModelProperty(value="试题集合", example="", required = true)
    private List<TestQuestionsBank> banks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getqId() {
        return qId;
    }

    public void setqId(Long qId) {
        this.qId = qId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

	/** 
	 * @return banks 
	 */
	public List<TestQuestionsBank> getBanks() {
		return banks;
	}

	/** 
	 * @param banks 要设置的 banks 
	 */
	public void setBanks(List<TestQuestionsBank> banks) {
		this.banks = banks;
	}

	/** 
	 * @return appraisalAnalysis 
	 */
	public String getAppraisalAnalysis() {
		return appraisalAnalysis;
	}

	/** 
	 * @param appraisalAnalysis 要设置的 appraisalAnalysis 
	 */
	public void setAppraisalAnalysis(String appraisalAnalysis) {
		this.appraisalAnalysis = appraisalAnalysis;
	}

	/** 
	 * @return specialtyRecommend 
	 */
	public String getSpecialtyRecommend() {
		return specialtyRecommend;
	}

	/** 
	 * @param specialtyRecommend 要设置的 specialtyRecommend 
	 */
	public void setSpecialtyRecommend(String specialtyRecommend) {
		this.specialtyRecommend = specialtyRecommend;
	}

	/** 
	 * @return professionRecommend 
	 */
	public String getProfessionRecommend() {
		return professionRecommend;
	}

	/** 
	 * @param professionRecommend 要设置的 professionRecommend 
	 */
	public void setProfessionRecommend(String professionRecommend) {
		this.professionRecommend = professionRecommend;
	}

}