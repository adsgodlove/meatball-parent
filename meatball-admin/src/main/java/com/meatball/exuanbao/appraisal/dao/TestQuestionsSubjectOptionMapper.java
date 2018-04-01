/**
 * Project Name:meatball-admin
 * File Name:MeasurementController.java
 * Package Name:com.meatball.exuanbao.measurement
 * Date:2018年3月25日 上午2:55:27 
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.appraisal.dao;

import com.meatball.exuanbao.appraisal.model.TestQuestionsSubjectOption;

/**
 * @Title: TestQuestionsSubjectOptionMapper.java 
 * @Package com.meatball.exuanbao.appraisal.dao 
 * @Description: TODO(试题选项) 
 * @author 張翔宇  
 * @date 2018年3月25日 上午3:11:50 
 * @version V1.0
 */
public interface TestQuestionsSubjectOptionMapper {
    int deleteByPrimaryKey(Long bId);

    int insert(TestQuestionsSubjectOption record);

    int insertSelective(TestQuestionsSubjectOption record);

    TestQuestionsSubjectOption selectByPrimaryKey(Long bId);

    int updateByPrimaryKeySelective(TestQuestionsSubjectOption record);

    int updateByPrimaryKey(TestQuestionsSubjectOption record);
}