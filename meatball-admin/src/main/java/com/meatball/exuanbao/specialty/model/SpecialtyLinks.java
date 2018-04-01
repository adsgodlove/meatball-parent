package com.meatball.exuanbao.specialty.model;

import java.io.Serializable;

/**
 * @Title: SpecialtyLinks.java 
 * @Package com.meatball.school.model 
 * @Description: TODO(相近专业中间表) 
 * @author zk  
 * @date 2018年3月15日 下午4:18:41 
 * @version V1.0
 */
public class SpecialtyLinks implements Serializable {
	private static final long serialVersionUID = 1L;
	//专业id
	private Long bSpecialtyid;
	//相近专业id
    private Long bBrospecialtyid;

    public Long getbSpecialtyid() {
        return bSpecialtyid;
    }

    public void setbSpecialtyid(Long bSpecialtyid) {
        this.bSpecialtyid = bSpecialtyid;
    }

    public Long getbBrospecialtyid() {
        return bBrospecialtyid;
    }

    public void setbBrospecialtyid(Long bBrospecialtyid) {
        this.bBrospecialtyid = bBrospecialtyid;
    }
}