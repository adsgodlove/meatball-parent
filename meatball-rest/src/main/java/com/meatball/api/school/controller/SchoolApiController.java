package com.meatball.api.school.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import com.github.pagehelper.PageInfo;
import com.meatball.api.school.parems.*;
import com.meatball.api.school.service.SchoolApiService;
import com.meatball.component.OperateLog;
import com.meatball.exuanbao.school.model.School;
import com.meatball.exuanbao.school.model.SpecialtyScore;
import com.meatball.vo.ResultMsg;
import io.swagger.annotations.*;

/**
 * @Title: SchoolApiController.java 
 * @Package com.meatball.api.school.controller 
 * @Description: TODO(院校api接口) 
 * @author zk  
 * @date 2018年3月19日 上午10:01:28 
 * @version V1.0
 */
@Api(tags = "院校接口")
@RestController
@RequestMapping("/api/sclool")
public class SchoolApiController {
	@Resource
	private SchoolApiService schoolApiService;
	
	
	@ApiOperation(value = "通过院校数据唯一标示查询院校信息", notes = "返回院校信息")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = SchoolParams.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/schoolInfo")
	@OperateLog("通过院校数据唯一标示查询院校信息")
	public ResultMsg schoolInfo(@RequestBody InfoParems params) {
		ResultMsg resultMsg = new ResultMsg(200);
		resultMsg.setData(schoolApiService.schoolInfo(params.getbId()));
		return resultMsg;
	}
	
	
	@ApiOperation(value = "分页查询院校数据集", notes = "返回院校数据集")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = SchoolParams.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/schoolList")
	@OperateLog("分页查询院校数据集")
	public ResultMsg listParams(@RequestBody SchoolQueryParams entity) {
		ResultMsg resultMsg = new ResultMsg(200);
		PageInfo<School> listParams = schoolApiService.schoolList(entity);
		resultMsg.setData(listParams);
		return resultMsg;
	}
	
	
	@ApiOperation(value = "分页查询专业优势院校数据集", notes = "返回院校数据集")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = SchoolParams.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/superioritySchoolList")
	@OperateLog("分页查询专业优势院校数据集")
	public ResultMsg superioritySchool(@RequestBody SuperioritySchoolParems entity) {
		ResultMsg resultMsg = new ResultMsg(200);
		PageInfo<School> listParams = schoolApiService.schoolList(entity);
		resultMsg.setData(listParams);
		return resultMsg;
	}
	
	
	@ApiOperation(value = "分页查询学校专业分数线数据集", notes = "返回学校专业分数线数据集")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = SchoolParams.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@PostMapping("/specialtyScores")
	@OperateLog("分页查询学校专业分数线数据集")
	public ResultMsg specialtyScores(@RequestBody SpecialtyScoreParems entity) {
		ResultMsg resultMsg = new ResultMsg(200);
		PageInfo<SpecialtyScore> listParams = schoolApiService.specialtyScores(entity);
		resultMsg.setData(listParams);
		return resultMsg;
	}
	
	
	@ApiOperation(value = "查询学校专业分数线年份数据集", notes = "返回学校专业分数线年份数据集")
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "权限验证成功", response = SchoolParams.class), 
		@ApiResponse(code = 201, message = "请求成功并且服务器创建了新的资源", response = Void.class), 
		@ApiResponse(code = 401, message = "用户名或密码错", response = Void.class), 
		@ApiResponse(code = 403, message = "权限认证失败", response = Void.class),
		@ApiResponse(code = 404, message = "请求的资源不存在", response = Void.class)
	})
	@GetMapping("/groupByYear")
	@OperateLog("查询学校专业分数线年份数据集")
	public ResultMsg groupByYear() {
		ResultMsg resultMsg = new ResultMsg(200);
		resultMsg.setData(schoolApiService.groupByYear());
		return resultMsg;
	}
}
