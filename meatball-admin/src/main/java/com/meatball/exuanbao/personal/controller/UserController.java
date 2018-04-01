/**
 * Project Name:meatball-admin
 * File Name:UserController.java
 * Package Name:com.meatball.exuanbao.personal.controller
 * Date:2018年3月28日下午4:40:16
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.personal.controller;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.personal.model.Account;
import com.meatball.exuanbao.personal.service.UserService;

/**   
 * @Title: UserController.java 
 * @Package com.meatball.exuanbao.personal.controller 
 * @Description: TODO(用户控制器) 
 * @author jw  
 * @date 2018年3月28日 下午4:40:16 
 * @version V1.0   
 */
@Controller
@RequestMapping("/exuanbao/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@GetMapping("/index")
	@RequiresPermissions("exuanbao:user:index")
	public String index(ModelMap map) {
		
		return "exuanbao/user/user";
	}
	
	@GetMapping("/listParams")
	@ResponseBody
	@RequiresPermissions("exuanbao:user:index")
	public PageInfo<Account> listParams(Account entity) {
		
		return userService.userList(entity);
	}
	
	
	@GetMapping("/info")
	@ResponseBody
	@RequiresPermissions("exuanbao:user:info")
	public Account info(Long bId) {
		return userService.userInfo(bId);
	}
}
