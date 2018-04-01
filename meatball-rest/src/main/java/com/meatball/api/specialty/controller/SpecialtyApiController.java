/**
 * Project Name:meatball-rest
 * File Name:SpecialtyApiController.java
 * Package Name:com.meatball.api.specialty.controller
 * Date:2018年3月25日下午3:44:14
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.specialty.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.meatball.api.specialty.parems.SuperiorityInfoParems;
import com.meatball.api.specialty.parems.SuperioritySpecialtyParems;
import com.meatball.api.specialty.parems.SuperiorityTypeParams;
import com.meatball.api.specialty.service.SpecialtyApiService;
import com.meatball.component.OperateLog;
import com.meatball.exuanbao.specialty.model.Specialty;
import com.meatball.exuanbao.specialty.model.SpecialtyTree;
import com.meatball.vo.ResultMsg;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**   
 * @Title: SpecialtyApiController.java 
 * @Package com.meatball.api.specialty.controller 
 * @Description: TODO(院校专业) 
 * @author zk  
 * @date 2018年3月25日 下午3:44:14 
 * @version V1.0   
 */
@Api(tags = "院校专业接口")
@RestController
@RequestMapping("/api/specialty")
public class SpecialtyApiController {
	@Resource
	private SpecialtyApiService specialtyApiService;
	
	
	@ApiOperation(value = "查询院校专业详情", notes = "返回院校专业详情")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = Specialty.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/specialtyInfo")
	@OperateLog("查询院校专业详情")
	public ResultMsg info(@RequestBody SuperiorityInfoParems entity) {
		ResultMsg resultMsg = new ResultMsg(200);
		resultMsg.setData(specialtyApiService.spectaltyInfo(entity));
		return resultMsg;
	}
	
	
	@ApiOperation(value = "分页查询院校专业数据集", notes = "返回院校专业数据集")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = SpecialtyTree.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/specialtyList")
	@OperateLog("分页查询院校专业数据集")
	public ResultMsg listParams(@RequestBody SuperiorityTypeParams entity) {
		ResultMsg resultMsg = new ResultMsg(200);
		resultMsg.setData(specialtyApiService.selectSpectaltys(entity));
		return resultMsg;
	}
	
	
	@ApiOperation(value = "分页查询院校优势专业数据集", notes = "返回院校专业数据集")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = SpecialtyTree.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/superioritySpecialtyList")
	@OperateLog("分页查询院校优势专业数据集")
	public ResultMsg superioritySpecialtyList(@RequestBody SuperioritySpecialtyParems entity) {
		ResultMsg resultMsg = new ResultMsg(200);
		resultMsg.setData(specialtyApiService.superioritySpecialtyList(entity));
		return resultMsg;
	}
}
