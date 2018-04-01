/**
 * Project Name:meatball-admin
 * File Name:DictionarieService.java
 * Package Name:com.meatball.exuanbao.dictionarie.service
 * Date:2018年3月29日上午9:39:44
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.dictionarie.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.pay.model.SysParamer;

/**   
 * @Title: DictionarieService.java 
 * @Package com.meatball.exuanbao.dictionarie.service 
 * @Description: TODO(数据字典接口) 
 * @author jw  
 * @date 2018年3月29日 上午9:39:44 
 * @version V1.0   
 */
public interface DictionarieService {

	PageInfo<SysParamer> sysParamerList(SysParamer entity);

	SysParamer sysParamerInfo(Long bId);

	int sysParamerAdd(SysParamer entity);

	int sysParamerEdit(SysParamer entity);

	int sysParamerDelete(SysParamer entity);

	/**
	 * @Title: selectPayServiceInfo 
	 * @Description: TODO(查询支付服务参数内容) 
	 * @param string 参数编号
	 * @param otype 订单类型
	 * @return
	 * @return List<SysParamer>    返回类型
	 */
	List<SysParamer> selectPayServiceInfo(String string, int otype);

}
