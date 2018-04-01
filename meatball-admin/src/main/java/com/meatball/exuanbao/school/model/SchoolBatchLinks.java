package com.meatball.exuanbao.school.model;

import java.io.Serializable;

/**
 * @Title: SchoolBatchLinks.java 
 * @Package com.meatball.exuanbao.school.model 
 * @Description: TODO(学校录取批次中间表) 
 * @author zk  
 * @date 2018年3月15日 下午4:18:58 
 * @version V1.0
 */
public class SchoolBatchLinks implements Serializable {
	private static final long serialVersionUID = 1L;
	//录取批次id
	private Integer iBatchid;
	//学校id
    private Long bSchoolid;

    public Integer getiBatchid() {
        return iBatchid;
    }

    public void setiBatchid(Integer iBatchid) {
        this.iBatchid = iBatchid;
    }

    public Long getbSchoolid() {
        return bSchoolid;
    }

    public void setbSchoolid(Long bSchoolid) {
        this.bSchoolid = bSchoolid;
    }
}