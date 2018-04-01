package com.meatball.exuanbao.school.model;

import java.io.Serializable;

/**
 * @Title: SchoolSpecialtyLinks.java 
 * @Package com.meatball.exuanbao.school.model 
 * @Description: TODO(学校专业中间表) 
 * @author zk  
 * @date 2018年3月15日 下午4:18:51 
 * @version V1.0
 */
public class SchoolSpecialtyLinks implements Serializable {
	private static final long serialVersionUID = 1L;
	//学校id
	private Long bSchoolid;
	//学科专业id
    private Long bSpecialtyid;
    
    public SchoolSpecialtyLinks(){}
    
    public SchoolSpecialtyLinks(Long bSchoolid, Long bSpecialtyid) {
		super();
		this.bSchoolid = bSchoolid;
		this.bSpecialtyid = bSpecialtyid;
	}

	public Long getbSchoolid() {
        return bSchoolid;
    }

    public void setbSchoolid(Long bSchoolid) {
        this.bSchoolid = bSchoolid;
    }

    public Long getbSpecialtyid() {
        return bSpecialtyid;
    }

    public void setbSpecialtyid(Long bSpecialtyid) {
        this.bSpecialtyid = bSpecialtyid;
    }
}