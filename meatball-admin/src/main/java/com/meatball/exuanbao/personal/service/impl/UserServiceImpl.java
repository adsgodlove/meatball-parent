/**
 * Project Name:meatball-admin
 * File Name:UserServiceImpl.java
 * Package Name:com.meatball.exuanbao.personal.service.impl
 * Date:2018年3月28日下午4:40:58
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.personal.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.personal.dao.AccountMapper;
import com.meatball.exuanbao.personal.model.Account;
import com.meatball.exuanbao.personal.service.UserService;

/**   
 * @Title: UserServiceImpl.java 
 * @Package com.meatball.exuanbao.personal.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author jw  
 * @date 2018年3月28日 下午4:40:58 
 * @version V1.0   
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private AccountMapper accountMapper;
	
	@Override
	public PageInfo<Account> userList(Account entity) {
		PageInfo<Account> listParams = PageHelper.startPage(entity.getOffset(), entity.getLimit()).doSelectPageInfo(() 
				-> accountMapper.listParams(entity));
		return listParams;
	}

	@Override
	public Account userInfo(Long bId) {
		 
		return accountMapper.selectByPrimaryKey(bId);
	}

}
