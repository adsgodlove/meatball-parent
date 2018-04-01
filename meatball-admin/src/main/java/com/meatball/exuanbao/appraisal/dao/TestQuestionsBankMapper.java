/**
 * Project Name:meatball-admin
 * File Name:MeasurementController.java
 * Package Name:com.meatball.exuanbao.measurement
 * Date:2018年3月25日 上午2:55:27 
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.appraisal.dao;

import java.util.List;

import com.meatball.exuanbao.appraisal.model.TestQuestionsBank;
/**
 * @Title: TestQuestionsBankMapper.java 
 * @Package com.meatball.exuanbao.appraisal.dao 
 * @Description: TODO(试题持久层) 
 * @author 張翔宇  
 * @date 2018年3月25日 上午2:54:24 
 * @version V1.0
 */
public interface TestQuestionsBankMapper {
    int deleteByPrimaryKey(Long bId);

    int insert(TestQuestionsBank record);

    int insertSelective(TestQuestionsBank record);

    TestQuestionsBank selectByPrimaryKey(Long bId);

    int updateByPrimaryKeySelective(TestQuestionsBank record);

    int updateByPrimaryKey(TestQuestionsBank record);
    
    /**
     * @Title: selectByBQid 
     * @Description: TODO(根據試卷ID查詢試題) 
     * @param bId
     * @return List<TestQuestionsBank>    返回类型
     */
    List<TestQuestionsBank> selectByBQid(Long bId);
}