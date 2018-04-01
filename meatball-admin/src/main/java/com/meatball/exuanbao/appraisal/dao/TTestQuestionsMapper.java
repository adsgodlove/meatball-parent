/**
 * Project Name:meatball-admin
 * File Name:MeasurementController.java
 * Package Name:com.meatball.exuanbao.measurement
 * Date:2018年3月25日 上午2:55:27 
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.appraisal.dao;

import java.util.List;

import com.meatball.exuanbao.appraisal.model.TTestQuestions;

/**
 * @Title: TTestQuestionsMapper.java 
 * @Package com.meatball.exuanbao.appraisal.dao 
 * @Description: TODO(试卷) 
 * @author 張翔宇  
 * @date 2018年3月25日 上午3:12:15 
 * @version V1.0
 */
public interface TTestQuestionsMapper {
    int deleteByPrimaryKey(Long bId);

    int insert(TTestQuestions record);

    int insertSelective(TTestQuestions record);

    TTestQuestions selectByPrimaryKey(Long bId);

    int updateByPrimaryKeySelective(TTestQuestions record);

    int updateByPrimaryKey(TTestQuestions record);
    
    List<TTestQuestions> findPageList(TTestQuestions record);
}