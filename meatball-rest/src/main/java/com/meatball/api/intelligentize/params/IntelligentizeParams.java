/**
 * Project Name:meatball-rest
 * File Name:IntelligentizeParams.java
 * Package Name:com.meatball.api.intelligentize.params
 * Date:2018年3月28日下午5:00:41
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.intelligentize.params;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: IntelligentizeParams.java 
 * @Package com.meatball.api.intelligentize.params 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 張翔宇  
 * @date 2018年3月28日 下午5:00:41 
 * @version V1.0   
 */
@ApiModel(value = "专业查询参数")
public class IntelligentizeParams implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="用户ID", example="3", required = true)
	private Long userId;
	
	@ApiModelProperty(value="专业(传入专业ID，以英文逗号分隔)", example="3016,1014", required = true)
	private String profession;
	
	@ApiModelProperty(value="地区(传入地区代码，以英文逗号分隔)", example="510100,510700", required = true)
	private String district;
	
	@ApiModelProperty(value="提前批次(传入批次ID)", example="1") 
	private String batchAdvance;
	
	@ApiModelProperty(value="国家专项(传入专项ID)", example="22")
	private Integer specialNational;
	
	@ApiModelProperty(value="地方专项(传入专项ID)", example="10")
	private Integer placeSpecial;
	
	@ApiModelProperty(value="高校性质(传入性质ID)", example="111")
	private Integer universityNature;
	
	@ApiModelProperty(value="分数(传入高考分数)", example="700")
	private Integer score;
	
	@ApiModelProperty(value="位置(传入位次排名)", example="220")
	private Integer precedence;

	/** 
	 * @return userId 
	 */
	public Long getUserId() {
		return userId;
	}

	/** 
	 * @param userId 要设置的 userId 
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/** 
	 * @return profession 
	 */
	public String getProfession() {
		return profession;
	}

	/** 
	 * @param profession 要设置的 profession 
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}

	/** 
	 * @return district 
	 */
	public String getDistrict() {
		return district;
	}

	/** 
	 * @param district 要设置的 district 
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/** 
	 * @return batchAdvance 
	 */
	public String getBatchAdvance() {
		return batchAdvance;
	}

	/** 
	 * @param batchAdvance 要设置的 batchAdvance 
	 */
	public void setBatchAdvance(String batchAdvance) {
		this.batchAdvance = batchAdvance;
	}

	/** 
	 * @return specialNational 
	 */
	public Integer getSpecialNational() {
		return specialNational;
	}

	/** 
	 * @param specialNational 要设置的 specialNational 
	 */
	public void setSpecialNational(Integer specialNational) {
		this.specialNational = specialNational;
	}

	/** 
	 * @return placeSpecial 
	 */
	public Integer getPlaceSpecial() {
		return placeSpecial;
	}

	/** 
	 * @param placeSpecial 要设置的 placeSpecial 
	 */
	public void setPlaceSpecial(Integer placeSpecial) {
		this.placeSpecial = placeSpecial;
	}

	/** 
	 * @return universityNature 
	 */
	public Integer getUniversityNature() {
		return universityNature;
	}

	/** 
	 * @param universityNature 要设置的 universityNature 
	 */
	public void setUniversityNature(Integer universityNature) {
		this.universityNature = universityNature;
	}

	/** 
	 * @return score 
	 */
	public Integer getScore() {
		return score;
	}

	/** 
	 * @param score 要设置的 score 
	 */
	public void setScore(Integer score) {
		this.score = score;
	}

	/** 
	 * @return precedence 
	 */
	public Integer getPrecedence() {
		return precedence;
	}

	/** 
	 * @param precedence 要设置的 precedence 
	 */
	public void setPrecedence(Integer precedence) {
		this.precedence = precedence;
	}
}
