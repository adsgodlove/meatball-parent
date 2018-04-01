/**
 * Project Name:meatball-admin
 * File Name:AppraisalService.java
 * Package Name:com.meatball.exuanbao.appraisal.service
 * Date:2018年3月20日下午2:47:29
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.appraisal.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.appraisal.model.TTestQuestions;
import com.meatball.exuanbao.appraisal.model.TestQuestionsGroup;
import com.meatball.vo.ResultMsg;

/**   
 * @Title: AppraisalService.java 
 * @Package com.meatball.exuanbao.appraisal.service 
 * @Description: TODO(智能测评) 
 * @author 張翔宇  
 * @date 2018年3月20日 下午2:47:29 
 * @version V1.0   
 */
public interface AppraisalService {
	/**
	 * @Title: table 
	 * @Description: TODO(测试试卷列表) 
	 * @param record
	 * @return PageInfo<TTestQuestions>    返回类型
	 */
	public PageInfo<TTestQuestions> table (TTestQuestions record);
	
	/**
	 * @Title: add 
	 * @Description: TODO(新增试卷) 
	 * @param record
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg add(TTestQuestions record);
	
	/**
	 * @Title: addGroup 
	 * @Description: TODO(新增分組) 
	 * @param record
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg addGroup(TestQuestionsGroup record);
	
	/**
	 * @Title: getAllGroup 
	 * @Description: TODO(根据试卷ID查询出所有分组) 
	 * @param qId
	 * @return TestQuestionsGroup    返回类型
	 */
	public List<TestQuestionsGroup> getAllGroup(Long qId);
	
	/**
	 * @Title: addTopic 
	 * @Description: TODO(新增题目) 
	 * @param record
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg addTopic(String record);
	
	/**
	 * @Title: view 
	 * @Description: TODO(查看试题) 
	 * @param id
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg detail(long id);
}
