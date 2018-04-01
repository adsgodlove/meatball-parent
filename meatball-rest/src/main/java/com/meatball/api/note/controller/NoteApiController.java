/**
 * Project Name:meatball-rest
 * File Name:NoteApiController.java
 * Package Name:com.meatball.api.note.controller
 * Date:2018年3月30日下午2:42:03
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.note.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meatball.api.note.parems.FeedbackParems;
import com.meatball.api.note.parems.FeedbackResultParems;
import com.meatball.api.note.parems.MyNoteInfoParems;
import com.meatball.api.note.parems.MyNoteParems;
import com.meatball.api.note.service.NoteApiService;
import com.meatball.component.OperateLog;
import com.meatball.vo.ResultMsg;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**   
 * @Title: NoteApiController.java 
 * @Package com.meatball.api.note.controller 
 * @Description: TODO(通知接口) 
 * @author jw  
 * @date 2018年3月30日 下午2:42:03 
 * @version V1.0   
 */
@Api(tags = "通知接口")
@RestController
@RequestMapping("/api/note")
public class NoteApiController {
	
	@Resource
	private NoteApiService noteApiService;
	
	@ApiOperation(value = "服务消息", notes = "返回我的服务消息列表")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = MyNoteParems.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/getMyNoteList")
	@OperateLog("服务消息")
	public ResultMsg getMyNoteList(String userid) {
		return noteApiService.getMyNoteList(userid);
	}
	
	@ApiOperation(value = "服务消息详情", notes = "返回我的服务消息详情")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = MyNoteInfoParems.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/getMyNoteInfo")
	@OperateLog("服务消息详情")
	public ResultMsg getMyNoteInfo(String noteid) {
		return noteApiService.getMyNoteInfo(noteid);
	}
	
	
	
	@ApiOperation(value = "意见反馈", notes = "返回意见反馈结果")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = FeedbackResultParems.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PutMapping("/getFeedbackResult")
	@OperateLog("意见反馈")
	public ResultMsg getFeedbackResult(@RequestBody FeedbackParems parems) {
		return noteApiService.getFeedbackResult(parems);
	}

}
