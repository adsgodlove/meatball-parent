/**
 * Project Name:meatball-admin
 * File Name:MeasurementController.java
 * Package Name:com.meatball.exuanbao.measurement
 * Date:2018年3月27日 下午2:28:39 
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.appraisal.dao;

import java.util.List;

import com.meatball.exuanbao.appraisal.model.TestQuestionsGroup;

/**
 * @Title: TestQuestionsGroupMapper.java 
 * @Package com.meatball.exuanbao.appraisal.dao 
 * @Description: TODO(試題分組) 
 * @author 張翔宇  
 * @date 2018年3月27日 下午2:28:39 
 * @version V1.0
 */
public interface TestQuestionsGroupMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TestQuestionsGroup record);

    int insertSelective(TestQuestionsGroup record);

    TestQuestionsGroup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TestQuestionsGroup record);

    int updateByPrimaryKey(TestQuestionsGroup record);
    
    /**
     * @Title: selectByQid 
     * @Description: TODO(根据试卷ID查询出所有分组) 
     * @param qId
     * @return List<TestQuestionsGroup>    返回类型
     */
    List<TestQuestionsGroup>selectByQid(Long qId);
    
    /**
     * @Title: selectByQidForJson 
     * @Description: TODO(根据试卷ID查询出所有分组ForJson) 
     * @param qId
     * @return List<TestQuestionsGroup>    返回类型
     */
    List<TestQuestionsGroup>selectByQidForJson(Long qId);
}