/**
 * Project Name:meatball-admin
 * File Name:MeasurementController.java
 * Package Name:com.meatball.exuanbao.measurement
 * Date:2018年3月19日下午4:43:53
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.appraisal.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.appraisal.model.TTestQuestions;
import com.meatball.exuanbao.appraisal.model.TestQuestionsGroup;
import com.meatball.exuanbao.appraisal.service.AppraisalService;
import com.meatball.vo.ResultMsg;

/**   
 * @Title: MeasurementController.java 
 * @Package com.meatball.exuanbao.measurement 
 * @Description: TODO(智能测评) 
 * @author 張翔宇  
 * @date 2018年3月19日 下午4:43:53 
 * @version V1.0   
 */
@Controller
@RequestMapping("/exuanbao/appraisal")
public class AppraisalController {
	@Resource
	private AppraisalService service;
	
	/**
	 * @Title: index 
	 * @Description: TODO(主页) 
	 * @return String    返回类型
	 */
	@GetMapping("/index")
	@RequiresPermissions("exuanbao:appraisal:index")
	public String index() {
		return "exuanbao/appraisal/appraisal";
	}
	
	/**
	 * @Title: table 
	 * @Description: TODO(试卷分页列表) 
	 * @param record
	 * @return PageInfo<TTestQuestions>    返回类型
	 */
	@GetMapping("/table")
	@ResponseBody
	@RequiresPermissions("exuanbao:appraisal:index")
	public PageInfo<TTestQuestions> table (TTestQuestions record) { 
		return service.table(record);
	}
	
	/**
	 * @Title: add 
	 * @Description: TODO(新增试卷) 
	 * @param record
	 * @return ResultMsg    返回类型
	 */
	@PostMapping("/")
	@ResponseBody
	public ResultMsg add(TTestQuestions record) {
		return service.add(record);
	}
	
	/**
	 * @Title: view 
	 * @Description: TODO(显示试题) 
	 * @param id
	 * @return ResultMsg    返回类型
	 */
	@GetMapping("/{id}")
	@ResponseBody
	public ResultMsg detail(@PathVariable long id) {
		return service.detail(id);
	}
	
	/**
	 * @Title: addGroup 
	 * @Description: TODO(新增分組) 
	 * @param record
	 * @return
	 * @return ResultMsg    返回类型
	 */
	@PostMapping("/group/")
	@ResponseBody
	public ResultMsg addGroup(TestQuestionsGroup record) {
		return service.addGroup(record);
	}
	
	/**
	 * @Title: getAllGroup 
	 * @Description: TODO(根据试卷ID查询出所有分组) 
	 * @param qId
	 * @return List<TestQuestionsGroup>    返回类型
	 */
	@GetMapping("/group/{qId}")
	@ResponseBody
	public List<TestQuestionsGroup> getAllGroup(@PathVariable Long qId) {
		return service.getAllGroup(qId);
	}
	
	/**
	 * @Title: addTopic 
	 * @Description: TODO(新增题目) 
	 * @param option
	 * @return ResultMsg    返回类型
	 */
	@PostMapping("/topic/")
	@ResponseBody
	public ResultMsg addTopic(String record) {
		return service.addTopic(record);
	}
}
