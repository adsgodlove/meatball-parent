/**
 * Project Name:meatball-admin
 * File Name:UserService.java
 * Package Name:com.meatball.exuanbao.personal.service
 * Date:2018年3月28日下午4:40:33
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.personal.service;

import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.personal.model.Account;

/**   
 * @Title: UserService.java 
 * @Package com.meatball.exuanbao.personal.service 
 * @Description: TODO(用户接口) 
 * @author jw  
 * @date 2018年3月28日 下午4:40:33 
 * @version V1.0   
 */
public interface UserService {

	PageInfo<Account> userList(Account entity);

	
	Account userInfo(Long bId);

}
