/**
 * Project Name:meatball-rest
 * File Name:AppraisalApiController.java
 * Package Name:com.meatball.api.appraisal.Controller
 * Date:2018年3月28日上午10:48:57
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.appraisal.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meatball.api.appraisal.service.AppraisalApiService;
import com.meatball.component.OperateLog;
import com.meatball.exuanbao.appraisal.model.TestQuestionsGroup;
import com.meatball.vo.ResultMsg;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @Title: AppraisalApiController.java
 * @Package com.meatball.api.appraisal.Controller
 * @Description: TODO(智能測評接口)
 * @author 張翔宇
 * @date 2018年3月28日 上午10:48:57
 * @version V1.0
 */
@Api(tags = "智能测评")
@RestController
@RequestMapping("/api/appraisal")
public class AppraisalApiController {
	@Resource
	private AppraisalApiService service;
	
	/**
	 * @Title: validate 
	 * @Description: TODO(验证用户，并返回token) 
	 * @param user
	 * @RequestBody 必须指定参数获取位置，否则无法获取到参数
	 * @return boolean    返回类型
	 */
	@ApiOperation(value = "智能测评试题集合", notes = "返回智能测评当前试卷的所有试题集合")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = TestQuestionsGroup.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@GetMapping("/{testId}")
	@OperateLog("用户登陆")
	public ResultMsg getQuestionsBank(@PathVariable Long testId) {
		return service.getQuestionsBank(testId);
	}
}
