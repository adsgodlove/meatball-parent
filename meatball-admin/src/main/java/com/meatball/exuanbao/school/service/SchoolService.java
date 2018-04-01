/**
 * Project Name:meatball-admin
 * File Name:SchoolService.java
 * Package Name:com.meatball.exuanbao.school.service
 * Date:2018年3月15日下午5:18:47
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.school.service;

import java.util.List;
import com.meatball.exuanbao.school.model.School;
import com.meatball.exuanbao.school.model.SpecialtyScore;

/**   
 * @Title: SchoolService.java 
 * @Package com.meatball.exuanbao.school.service 
 * @Description: TODO(学校) 
 * @author zk  
 * @date 2018年3月15日 下午5:18:47 
 * @version V1.0   
 */
public interface SchoolService {
	
	/**
	 * @Title: schoolInfo 
	 * @Description: TODO(学校详情) 
	 * @param bId 学校id
	 * @return
	 * @return School    返回类型
	 */
	public School schoolInfo(Long bId);

	/**
	 * @Title: schoolAdd 
	 * @Description: TODO(学校添加) 
	 * @param entity 学校
	 * @return
	 * @return int    返回类型
	 */
	public int schoolAdd(School entity);
	
	/**
	 * @Title: schoolEdit 
	 * @Description: TODO(学校编辑) 
	 * @param entity 学校
	 * @return
	 * @return int    返回类型
	 */
	public int schoolEdit(School entity);
	
	/**
	 * @Title: schoolDelete 
	 * @Description: TODO(删除) 
	 * @param entity
	 * @return
	 * @return int    返回类型
	 */
	public int schoolDelete(School entity);
	
	/**
	 * @Title: schoolList 
	 * @Description: TODO(学校查询) 
	 * @param entity 学校信息
	 * @return
	 * @return List<School>    返回类型
	 */
	public List<School> schoolList(School entity);
	
	
	
	
	/**
	 * @Title: specialtyScores 
	 * @Description: TODO(查询学校专业分数线) 
	 * @param record
	 * @return
	 * @return List<SpecialtyScore>    返回类型
	 */
    List<SpecialtyScore> specialtyScores(SpecialtyScore record);
    
    /**
     * @Title: groupByYear 
     * @Description: TODO(查询学校专业分数线年份) 
     * @return
     * @return List<Integer>    返回类型
     */
    List<Integer> groupByYear();
}
