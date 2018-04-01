/**
 * Project Name:meatball-admin
 * File Name:AppraisalServiceImpl.java
 * Package Name:com.meatball.exuanbao.appraisal.service.impl
 * Date:2018年3月20日下午2:48:00
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.appraisal.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.appraisal.dao.TTestQuestionsMapper;
import com.meatball.exuanbao.appraisal.dao.TestQuestionsBankMapper;
import com.meatball.exuanbao.appraisal.dao.TestQuestionsGroupMapper;
import com.meatball.exuanbao.appraisal.dao.TestQuestionsSubjectOptionMapper;
import com.meatball.exuanbao.appraisal.model.TTestQuestions;
import com.meatball.exuanbao.appraisal.model.TestQuestionsBank;
import com.meatball.exuanbao.appraisal.model.TestQuestionsGroup;
import com.meatball.exuanbao.appraisal.model.TestQuestionsSubjectOption;
import com.meatball.exuanbao.appraisal.service.AppraisalService;
import com.meatball.vo.ResultMsg;

/**   
 * @Title: AppraisalServiceImpl.java 
 * @Package com.meatball.exuanbao.appraisal.service.impl 
 * @Description: TODO(智能测评) 
 * @author 張翔宇  
 * @date 2018年3月20日 下午2:48:00 
 * @version V1.0   
 */
@Service
public class AppraisalServiceImpl implements AppraisalService {
	@Resource
	private TTestQuestionsMapper mapper;
	@Resource
	private TestQuestionsBankMapper bankMapper;
	@Resource
	private TestQuestionsSubjectOptionMapper subjectOptionMapper;
	@Resource
	private TestQuestionsGroupMapper questionsGroupMapper;
	
	@Override
	public PageInfo<TTestQuestions> table(TTestQuestions record) {
		PageInfo<TTestQuestions> list = PageHelper.startPage(record.getOffset(), record.getLimit()).doSelectPageInfo(() -> mapper.findPageList(record));
		return list;
	}

	@Override
	public ResultMsg add(TTestQuestions record) {
		record.setdCreateTime(new Date());
		mapper.insert(record);
		return new ResultMsg(200, "新增成功。");
	}

	@Override
	public ResultMsg addTopic(String record) {
		// 解析出题目集合
		List<TestQuestionsBank> banks = JSON.parseArray(record, TestQuestionsBank.class);
		banks.forEach(bank -> {
			bankMapper.insertSelective(bank);
			// 解析出当前题目下的所有选项集合
			List<TestQuestionsSubjectOption> options = JSON.parseArray(bank.getOptions(), TestQuestionsSubjectOption.class);
			options.forEach(option -> {
				option.setbQbankid(bank.getbId());
				option.setType(bank.getiType());
				subjectOptionMapper.insertSelective(option);
			});
		});
		return new ResultMsg(200, "保存成功。");
	}

	@Override
	public ResultMsg detail(long id) {
		List<TestQuestionsGroup> list = questionsGroupMapper.selectByQidForJson(id);
		return new ResultMsg(200, list);
	}

	/* (新增分組) 
	 * <p>Title: addGroup</p> 
	 * <p>Description: </p> 
	 * @param record
	 * @return 
	 * @see com.meatball.exuanbao.appraisal.service.AppraisalService#addGroup(com.meatball.exuanbao.appraisal.model.TestQuestionsGroup) 
	 */
	@Override
	public ResultMsg addGroup(TestQuestionsGroup record) {
		questionsGroupMapper.insertSelective(record);
		return new ResultMsg(200, "新增成功。");
	}

	/* (非 Javadoc) 
	 * <p>Title: getAllGroup</p> 
	 * <p>Description: </p> 
	 * @param qId
	 * @return 
	 * @see com.meatball.exuanbao.appraisal.service.AppraisalService#getAllGroup(java.lang.Long) 
	 */
	@Override
	public List<TestQuestionsGroup> getAllGroup(Long qId) {
		return questionsGroupMapper.selectByQid(qId);
	}
}
