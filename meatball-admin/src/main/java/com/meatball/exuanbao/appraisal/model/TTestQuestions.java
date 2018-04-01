/**
 * Project Name:meatball-admin
 * File Name:MeasurementController.java
 * Package Name:com.meatball.exuanbao.measurement
 * Date:2018年3月19日下午4:43:53
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.appraisal.model;

import java.util.Date;

import com.meatball.utils.DateUtil;
import com.meatball.vo.Page;

/**
 * @Title: TTestQuestions.java 
 * @Package com.meatball.exuanbao.appraisal.model 
 * @Description: TODO(智能测评-试卷实体) 
 * @author 張翔宇  
 * @date 2018年3月20日 下午4:58:59 
 * @version V1.0
 */
public class TTestQuestions extends Page {
	private static final long serialVersionUID = 1L;
	
	// 主键
	private Long bId;

	// 试题名称
    private String vName;

    // 试题类型
    private Integer iType;

    // 试题类型描述
    private String vTypename;

    // 试题出卷方式
    private Integer iMode;

    // 试题出卷方式描述
    private String vModename;

    // 试题模式
    private Integer iPattern;

    // 试题模式描述
    private String vPatternname;

    // 试题时长（分钟）
    private Integer iDuration;

    // 试题次数
    private Integer iFrequency;

    // 总分值
    private Float fScore;

    // 总题数
    private Integer iCount;
    
    // 试卷描述
    private String vExamPaperDes;
    
    // 创建时间
    private Date dCreateTime;
    private String dCreateTimeVo;

	/** 
	 * @return bId 
	 */
	public Long getbId() {
		return bId;
	}

	/** 
	 * @param bId 要设置的 bId 
	 */
	public void setbId(Long bId) {
		this.bId = bId;
	}

	/** 
	 * @return vName 
	 */
	public String getvName() {
		return vName;
	}

	/** 
	 * @param vName 要设置的 vName 
	 */
	public void setvName(String vName) {
		this.vName = vName;
	}

	/** 
	 * @return iType 
	 */
	public Integer getiType() {
		return iType;
	}

	/** 
	 * @param iType 要设置的 iType 
	 */
	public void setiType(Integer iType) {
		this.iType = iType;
	}

	/** 
	 * @return vTypename 
	 */
	public String getvTypename() {
		return vTypename;
	}

	/** 
	 * @param vTypename 要设置的 vTypename 
	 */
	public void setvTypename(String vTypename) {
		this.vTypename = vTypename;
	}

	/** 
	 * @return iMode 
	 */
	public Integer getiMode() {
		return iMode;
	}

	/** 
	 * @param iMode 要设置的 iMode 
	 */
	public void setiMode(Integer iMode) {
		this.iMode = iMode;
	}

	/** 
	 * @return vModename 
	 */
	public String getvModename() {
		return vModename;
	}

	/** 
	 * @param vModename 要设置的 vModename 
	 */
	public void setvModename(String vModename) {
		this.vModename = vModename;
	}

	/** 
	 * @return iPattern 
	 */
	public Integer getiPattern() {
		return iPattern;
	}

	/** 
	 * @param iPattern 要设置的 iPattern 
	 */
	public void setiPattern(Integer iPattern) {
		this.iPattern = iPattern;
	}

	/** 
	 * @return vPatternname 
	 */
	public String getvPatternname() {
		return vPatternname;
	}

	/** 
	 * @param vPatternname 要设置的 vPatternname 
	 */
	public void setvPatternname(String vPatternname) {
		this.vPatternname = vPatternname;
	}

	/** 
	 * @return iDuration 
	 */
	public Integer getiDuration() {
		return iDuration;
	}

	/** 
	 * @param iDuration 要设置的 iDuration 
	 */
	public void setiDuration(Integer iDuration) {
		this.iDuration = iDuration;
	}

	/** 
	 * @return iFrequency 
	 */
	public Integer getiFrequency() {
		return iFrequency;
	}

	/** 
	 * @param iFrequency 要设置的 iFrequency 
	 */
	public void setiFrequency(Integer iFrequency) {
		this.iFrequency = iFrequency;
	}

	/** 
	 * @return fScore 
	 */
	public Float getfScore() {
		return fScore;
	}

	/** 
	 * @param fScore 要设置的 fScore 
	 */
	public void setfScore(Float fScore) {
		this.fScore = fScore;
	}

	/** 
	 * @return iCount 
	 */
	public Integer getiCount() {
		return iCount;
	}

	/** 
	 * @param iCount 要设置的 iCount 
	 */
	public void setiCount(Integer iCount) {
		this.iCount = iCount;
	}

	/** 
	 * @return vExamPaperDes 
	 */
	public String getvExamPaperDes() {
		return vExamPaperDes;
	}

	/** 
	 * @param vExamPaperDes 要设置的 vExamPaperDes 
	 */
	public void setvExamPaperDes(String vExamPaperDes) {
		this.vExamPaperDes = vExamPaperDes;
	}

	/** 
	 * @return dCreateTime 
	 */
	public Date getdCreateTime() {
		return dCreateTime;
	}

	/** 
	 * @param dCreateTime 要设置的 dCreateTime 
	 */
	public void setdCreateTime(Date dCreateTime) {
		this.dCreateTimeVo = DateUtil.getTime(dCreateTime);
		this.dCreateTime = dCreateTime;
	}

	/** 
	 * @return dCreateTimeVo 
	 */
	public String getdCreateTimeVo() {
		return dCreateTimeVo;
	}

	/** 
	 * @param dCreateTimeVo 要设置的 dCreateTimeVo 
	 */
	public void setdCreateTimeVo(String dCreateTimeVo) {
		this.dCreateTimeVo = dCreateTimeVo;
	}
	
}