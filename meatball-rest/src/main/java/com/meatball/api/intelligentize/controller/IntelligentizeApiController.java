/**
 * Project Name:meatball-rest
 * File Name:IntelligentizeApiController.java
 * Package Name:com.meatball.api.intelligentize
 * Date:2018年3月28日下午4:43:16
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.intelligentize.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meatball.api.intelligentize.params.IntelligentizeParams;
import com.meatball.api.intelligentize.service.IntelligentizeApiService;
import com.meatball.component.OperateLog;
import com.meatball.exuanbao.appraisal.model.TestQuestionsGroup;
import com.meatball.vo.ResultMsg;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**   
 * @Title: IntelligentizeApiController.java 
 * @Package com.meatball.api.intelligentize 
 * @Description: TODO(智能填报) 
 * @author 張翔宇  
 * @date 2018年3月28日 下午4:43:16 
 * @version V1.0   
 */
@Api(tags = "智能填报")
@RestController
@RequestMapping("/api/intelligentize")
public class IntelligentizeApiController {
	@Resource
	private IntelligentizeApiService service;
	
	@ApiOperation(value = "获取志愿列表", notes = "返回志愿列表集合")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/getVolunteerList")
	@OperateLog("获取志愿列表")
	public ResultMsg getVolunteerList(@RequestBody IntelligentizeParams record) {
		return service.getVolunteerList(record);
	}
}
