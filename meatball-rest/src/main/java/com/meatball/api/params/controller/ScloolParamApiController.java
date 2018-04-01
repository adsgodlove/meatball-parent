/**
 * Project Name:meatball-rest
 * File Name:ScloolParamApiController.java
 * Package Name:com.meatball.api.parameter.controller
 * Date:2018年3月16日下午3:50:38
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.params.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import com.meatball.api.params.parems.*;
import com.meatball.api.params.service.ScloolParamApiService;
import com.meatball.component.OperateLog;
import com.meatball.vo.ResultMsg;
import io.swagger.annotations.*;

/**   
 * @Title: ScloolParamApiController.java 
 * @Package com.meatball.api.parameter.controller 
 * @Description: TODO(系统参数) 
 * @author zk  
 * @date 2018年3月16日 下午3:50:38 
 * @version V1.0   
 */
@Api(tags = "系统参数")
@RestController
@RequestMapping("/api/scloolParam")
public class ScloolParamApiController {
	@Resource
	private ScloolParamApiService scloolParamService;
	
	
	@ApiOperation(value = "通过父级编码查询行政单位", notes = "返回行政编码及名称等")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = RegionParams.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/regionByPcode")
	@OperateLog("通过父级编码查询行政单位")
	public ResultMsg regionByPcode(@RequestBody PcodeParams params) {
		ResultMsg resultMsg = new ResultMsg(200);
		resultMsg.setData(scloolParamService.regionByPcode(params.getiPcode()));
		return resultMsg;
	}
	
	
	@ApiOperation(value = "通过类型查询行政单位（1省、2市、3县）", notes = "返回行政编码及名称等")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = RegionParams.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/regionByType")
	@OperateLog("通过类型查询行政单位")
	public ResultMsg regionByType(@RequestBody TypeParams params) {
		ResultMsg resultMsg = new ResultMsg(200);
		resultMsg.setData(scloolParamService.regionByType(params.getiType()));
		return resultMsg;
	}
	
	
	@ApiOperation(value = "查询全部行政区域", notes = "返回行政区域数据树集")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = AreaParams.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/selectRegions")
	@OperateLog("查询全部行政区域")
	public ResultMsg selectRegions(@RequestBody TypeParams params) {
		ResultMsg resultMsg = new ResultMsg(200);
		resultMsg.setData(scloolParamService.selectRegions(null));
		return resultMsg;
	}
	
	
	@ApiOperation(value = "查询全部学校录取批次", notes = "返回全部学校录取批次")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = SchoolBatchParams.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/batchAll")
	@OperateLog("查询全部学校录取批次")
	public ResultMsg batchAll() {
		ResultMsg resultMsg = new ResultMsg(200);
		resultMsg.setData(scloolParamService.batchAll());
		return resultMsg;
	}
	
	
	@ApiOperation(value = "查询全部学校层次（211、985工程）", notes = "返回全部学校层次")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = HierarchyParams.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/levelAll")
	@OperateLog("查询全部学校层次")
	public ResultMsg levelAll() {
		ResultMsg resultMsg = new ResultMsg(200);
		resultMsg.setData(scloolParamService.levelAll());
		return resultMsg;
	}
	
	
	@ApiOperation(value = "通过父级编码查询学校地方所属(0  大类、1 地方所属、2 教育部直属、3 其它中央部署)", notes = "返回学校地方所属")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = HierarchyParams.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/subjectionByPid")
	@OperateLog("通过父级编码查询学校地方所属")
	public ResultMsg subjectionByPid(@RequestBody PidParams params) {
		ResultMsg resultMsg = new ResultMsg(200);
		resultMsg.setData(scloolParamService.subjectionByPid(params.getiPid()));
		return resultMsg;
	}
	
	
	@ApiOperation(value = "通过类型查询学校地方所属 (1 大类 2 （ 地方所属、教育部直属、其它中央部署）)", notes = "返回学校地方所属")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = HierarchyParams.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/subjectionByType")
	@OperateLog("通过类型查询学校地方所属 ")
	public ResultMsg subjectionByType(@RequestBody TypeParams params) {
		ResultMsg resultMsg = new ResultMsg(200);
		resultMsg.setData(scloolParamService.subjectionByType(params.getiType()));
		return resultMsg;
	}
	
	
	@ApiOperation(value = "查询全部学校类型", notes = "返回全部学校类型")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = HierarchyParams.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/schoolTypeAll")
	@OperateLog("查询全部学校类型")
	public ResultMsg schoolTypeAll() {
		ResultMsg resultMsg = new ResultMsg(200);
		resultMsg.setData(scloolParamService.schoolTypeAll());
		return resultMsg;
	}
	
	
	@ApiOperation(value = "查询全部学科", notes = "返回全部学科")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = HierarchyParams.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/subjectAll")
	@OperateLog("查询全部学科")
	public ResultMsg subjectAll() {
		ResultMsg resultMsg = new ResultMsg(200);
		resultMsg.setData(scloolParamService.subjectAll());
		return resultMsg;
	}
}
