/**
 * Project Name:meatball-rest
 * File Name:AppraisalApiService.java
 * Package Name:com.meatball.api.appraisal.service
 * Date:2018年3月28日上午10:54:28
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.appraisal.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.meatball.exuanbao.appraisal.dao.TestQuestionsGroupMapper;
import com.meatball.exuanbao.appraisal.model.TestQuestionsGroup;
import com.meatball.vo.ResultMsg;

/**   
 * @Title: AppraisalApiService.java 
 * @Package com.meatball.api.appraisal.service 
 * @Description: TODO(智能测评) 
 * @author 張翔宇  
 * @date 2018年3月28日 上午10:54:28 
 * @version V1.0   
 */
@Service
public class AppraisalApiService {
	@Resource
	private TestQuestionsGroupMapper questionsGroupMapper;
	
	/**
	 * @Title: validate 
	 * @Description: TODO(根据试卷ID查询出试题集合) 
	 * @param OptionsId
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg getQuestionsBank(Long testId) {
		List<TestQuestionsGroup> list = questionsGroupMapper.selectByQidForJson(testId);
		return new ResultMsg(200, list);
	}
}
