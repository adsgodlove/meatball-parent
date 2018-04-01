package com.meatball.exuanbao.school.model;

import java.io.Serializable;

/**
 * @Title: SchoolSpecialtySuperiorityLinks.java 
 * @Package com.meatball.exuanbao.school.model 
 * @Description: TODO(优势专业/优势院校) 
 * @author zk  
 * @date 2018年3月26日 上午10:58:53 
 * @version V1.0
 */
public class SchoolSpecialtySuperiorityLinks implements Serializable{
	private static final long serialVersionUID = 1L;
	//院校id
    private Long bSchoolid;
    //专业id
    private Long bSpecialtyid;

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