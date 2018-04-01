/**
 * Project Name:meatball-rest
 * File Name:UserApiController.java
 * Package Name:com.meatball.api.user.controller
 * Date:2018年3月4日下午3:45:54
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.user.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meatball.api.user.parems.MobileParems;
import com.meatball.api.user.parems.MobileValidateParems;
import com.meatball.api.user.parems.UserInfoParams;
import com.meatball.api.user.parems.UserParems;
import com.meatball.api.user.service.UserApiService;
import com.meatball.component.OperateLog;
import com.meatball.vo.ResultMsg;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**   
 * @Title: UserApiController.java 
 * @Package com.meatball.api.user.controller 
 * @Description: TODO(微信用户接口) 
 * @author 張翔宇  
 * @date 2018年3月4日 下午3:45:54 
 * @version V1.0   
 */
@Api(tags = "微信用户接口")
@RestController
@RequestMapping("/api/wxuser")
public class UserApiController {
	@Resource
	private UserApiService service;
	
	@ApiOperation(value = "获取手机短信验证码", notes = "返回手机短信验证码")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = MobileValidateParems.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/getMobileCode")
	@OperateLog("获取手机短信验证码")
	public ResultMsg getMobileCode(String mobile) {
		return service.getMobileVerifycode(mobile);
	}
	
	@ApiOperation(value = "验证手机短信验证码", notes = "返回验证提示信息")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = MobileValidateParems.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/validateMobileCode")
	@OperateLog("验证手机短信验证码")
	public ResultMsg validateMobileCode(@RequestBody MobileParems parems) {
		return service.getMobileVerifycodeCheck(parems);
	}
	
	
	@ApiOperation(value = "保存微信注册用户信息", notes = "返回微信用户信息")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = UserInfoParams.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/saveWxUser")
	@OperateLog("保存微信注册用户信息")
	public ResultMsg saveWxUser(@RequestBody UserParems parems,HttpServletRequest request) {
		return service.getSaveWxUserResult(parems,request);
	}
	
	
	@ApiOperation(value = "获取微信用户信息", notes = "返回微信用户信息")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = UserInfoParams.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/getWxUser")
	@OperateLog("获取微信用户信息")
	public ResultMsg getWxUser(String userid) {
		return service.getWxUserInfo(userid);
	}
	
	
	
	
}
