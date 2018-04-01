/**
 * Project Name:meatball-rest
 * File Name:OrderController.java
 * Package Name:com.meatball.api.order
 * Date:2018年3月26日下午2:37:25
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.order.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meatball.api.order.parems.MyServiceParems;
import com.meatball.api.order.parems.OrderInfoParems;
import com.meatball.api.order.parems.OrderListParems;
import com.meatball.api.order.parems.PayParems;
import com.meatball.api.order.parems.PayResultParems;
import com.meatball.api.order.parems.ServiceInfoParems;
import com.meatball.api.order.parems.ServiceParems;
import com.meatball.api.order.service.OrderApiService;
import com.meatball.component.OperateLog;
import com.meatball.vo.ResultMsg;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.annotations.ApiIgnore;

/**   
 * @Title: OrderController.java 
 * @Package com.meatball.api.order 
 * @Description: TODO(微信订单) 
 * @author jw  
 * @date 2018年3月26日 下午2:37:25 
 * @version V1.0   
 */
@Api(tags = "微信订单接口")
@RestController
@RequestMapping("/api/wxorder")
public class OrderController {
	
	@Resource
	private OrderApiService orderService;
	
	@ApiOperation(value = "微信下单", notes = "返回下单结果信息")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = PayResultParems.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/pay")
	@OperateLog("下单")
	public ResultMsg pay(@RequestBody PayParems parems) {
		return orderService.pay(parems);
	}
	
	
	@ApiOperation(value = "获取我的支付订单", notes = "返回我的支付订单列表")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = OrderListParems.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/getOrderList")
	@OperateLog("支付记录")
	public ResultMsg getOrderList(String userid) {
		return orderService.getOrderList(userid);
	}
	
	@ApiOperation(value = "获取支付记录订单详情", notes = "返回支付记录订单详情")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = OrderInfoParems.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/getOrderInfo")
	@OperateLog("支付记录详情")
	public ResultMsg getOrderInfo(String orderid) {
		return orderService.getOrderInfo(orderid);
	}
	
	/**
	 * @Title: wxback 
	 * @Description: TODO(微信接口回调操作) 
	 * @param request
	 * @return
	 * @return void    返回类型
	 * @throws Exception 
	 */
	@PostMapping("/wxback")
	@OperateLog("微信接口回调")
	@ApiIgnore
	public void wxback(HttpServletRequest request, HttpServletResponse response) throws Exception {
		orderService.getWxBackMsg(request,response);
	}

	
	@ApiOperation(value = "获取服务内容", notes = "返回服务内容详情")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = ServiceInfoParems.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/getServiceInfo")
	@OperateLog("服务内容")
	public ResultMsg getServiceInfo(@RequestBody ServiceParems parems) {
		return orderService.getServiceInfo(parems);
	}
	
	@ApiOperation(value = "获取我的服务列表", notes = "返回我的服务列表")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = MyServiceParems.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/getMyServiceList")
	@OperateLog("我的服务")
	public ResultMsg getMyServiceList(String userid) {
		return orderService.getMyServiceList(userid);
	}
	
	 
}
