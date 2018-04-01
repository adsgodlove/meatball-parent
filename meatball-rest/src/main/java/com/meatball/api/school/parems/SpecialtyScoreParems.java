/**
 * Project Name:meatball-rest
 * File Name:SpecialtyScoreParems.java
 * Package Name:com.meatball.api.school.parems
 * Date:2018年3月29日下午2:39:31
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.school.parems;

import java.io.Serializable;
import com.meatball.vo.Page;
import io.swagger.annotations.ApiModelProperty;


/**   
 * @Title: SpecialtyScoreParems.java 
 * @Package com.meatball.api.school.parems 
 * @Description: TODO(院校专业分数线查询) 
 * @author zk  
 * @date 2018年3月29日 下午2:39:31 
 * @version V1.0   
 */
public class SpecialtyScoreParems extends Page implements Serializable{

	private static final long serialVersionUID = 1L;
	//学校id
	@ApiModelProperty(value="学校id", example="11", required = true)
    private Long bSchoolid;
	//年份
	@ApiModelProperty(value="年份", example="11", required = true)
    private Integer dYear;
	//录取批次id
	@ApiModelProperty(value="录取批次id", example="11", required = true)
    private Integer iBatchid;
    //分数线类型(1 院校分数线、2专业分数线)
	@ApiModelProperty(value="分数线类型(1 院校、2专业)", example="1", required = true)
    private Integer iType;
    //文理科（1文科，2理科）
	@ApiModelProperty(value="文理科（文科，理科）", example="文科", required = true)
    private String iSubject;
    
	public Long getbSchoolid() {
		return bSchoolid;
	}
	public void setbSchoolid(Long bSchoolid) {
		this.bSchoolid = bSchoolid;
	}
	public Integer getdYear() {
		return dYear;
	}
	public void setdYear(Integer dYear) {
		this.dYear = dYear;
	}
	public Integer getiBatchid() {
		return iBatchid;
	}
	public void setiBatchid(Integer iBatchid) {
		this.iBatchid = iBatchid;
	}
	public Integer getiType() {
		return iType;
	}
	public void setiType(Integer iType) {
		this.iType = iType;
	}
	public String getiSubject() {
		return iSubject;
	}
	public void setiSubject(String iSubject) {
		this.iSubject = iSubject;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
