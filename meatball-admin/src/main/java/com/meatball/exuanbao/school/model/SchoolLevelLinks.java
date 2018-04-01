package com.meatball.exuanbao.school.model;

import java.io.Serializable;

/**
 * @Title: SchoolLevelLinks.java 
 * @Package com.meatball.exuanbao.school.model 
 * @Description: TODO(学校层次中间表) 
 * @author zk  
 * @date 2018年3月15日 下午4:18:55 
 * @version V1.0
 */
public class SchoolLevelLinks implements Serializable {
	private static final long serialVersionUID = 1L;
	//学校层次id
	private Integer iLevelid;
	//学校id
    private Long bSchoolid;
    
    public SchoolLevelLinks(){}
    
    public SchoolLevelLinks(Long bSchoolid, Integer iLevelid) {
		super();
		this.iLevelid = iLevelid;
		this.bSchoolid = bSchoolid;
	}

	public Integer getiLevelid() {
        return iLevelid;
    }

    public void setiLevelid(Integer iLevelid) {
        this.iLevelid = iLevelid;
    }

    public Long getbSchoolid() {
        return bSchoolid;
    }

    public void setbSchoolid(Long bSchoolid) {
        this.bSchoolid = bSchoolid;
    }
}