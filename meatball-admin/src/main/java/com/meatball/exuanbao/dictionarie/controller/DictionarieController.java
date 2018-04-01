/**
 * Project Name:meatball-admin
 * File Name:DictionarieController.java
 * Package Name:com.meatball.exuanbao.dictionarie.controller
 * Date:2018年3月29日上午9:38:49
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.dictionarie.controller;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.dictionarie.service.DictionarieService;
import com.meatball.exuanbao.pay.model.SysParamer;
import com.meatball.vo.ResultMsg;

/**   
 * @Title: DictionarieController.java 
 * @Package com.meatball.exuanbao.dictionarie.controller 
 * @Description: TODO(数据字典控制器) 
 * @author jw  
 * @date 2018年3月29日 上午9:38:49 
 * @version V1.0   
 */
@Controller
@RequestMapping("/exuanbao/datadic")
public class DictionarieController {
	@Resource
	private DictionarieService dictionarieService;
	
	@GetMapping("/index")
	@RequiresPermissions("exuanbao:datadic:index")
	public String index(ModelMap map) {
		
		return "exuanbao/dictionarie/main";
	}
	
	@GetMapping("/listParams")
	@ResponseBody
	@RequiresPermissions("exuanbao:datadic:index")
	public PageInfo<SysParamer> listParams(SysParamer entity) {
		return dictionarieService.sysParamerList(entity);
	}
	
	
	@GetMapping("/info")
	@ResponseBody
	@RequiresPermissions("exuanbao:datadic:info")
	public SysParamer info(Long bId) {
		return dictionarieService.sysParamerInfo(bId);
	}
	
	@PostMapping("/add")
	@ResponseBody
	@RequiresPermissions("exuanbao:datadic:add")
	public ResultMsg add(SysParamer entity) {
		int count = dictionarieService.sysParamerAdd(entity);
		if(count == 0){
			return new ResultMsg(1, "新增失败！");	
		}
		return new ResultMsg(0, "新增成功！");
		
	}
	
	
	@PostMapping("/edit")
	@ResponseBody
	@RequiresPermissions("exuanbao:datadic:edit")
	public ResultMsg edit(SysParamer entity) {
		int count = dictionarieService.sysParamerEdit(entity);
		if(count == 0){
			return new ResultMsg(1, "编辑失败！");	
		}
		return new ResultMsg(0, "编辑成功！");
		
	}
	
	
	@PostMapping("/delete")
	@ResponseBody
	@RequiresPermissions("exuanbao:datadic:delete")
	public ResultMsg delete(SysParamer entity) {
		int count = dictionarieService.sysParamerDelete(entity);
		if(count == 0){
			return new ResultMsg(1, "删除失败！");	
		}
		return new ResultMsg(0, "删除成功！");
	}

}
