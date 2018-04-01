package com.meatball.exuanbao.specialty.model;

import java.io.Serializable;

/**
 * @Title: SubjectSpecialtylinks.java 
 * @Package com.meatball.school.model 
 * @Description: TODO(学科专业中间表) 
 * @author zk  
 * @date 2018年3月15日 下午4:18:26 
 * @version V1.0
 */
public class SubjectSpecialtylinks implements Serializable {
	private static final long serialVersionUID = 1L;
	//专业id
	private Integer iSubjectid;
	//专业id
    private Long bSpecialtyid;

    public Integer getiSubjectid() {
        return iSubjectid;
    }

    public void setiSubjectid(Integer iSubjectid) {
        this.iSubjectid = iSubjectid;
    }

    public Long getbSpecialtyid() {
        return bSpecialtyid;
    }

    public void setbSpecialtyid(Long bSpecialtyid) {
        this.bSpecialtyid = bSpecialtyid;
    }
}