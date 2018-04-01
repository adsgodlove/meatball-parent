/**
 * Project Name:meatball-admin
 * File Name:DictionarieServiceImpl.java
 * Package Name:com.meatball.exuanbao.dictionarie.service.impl
 * Date:2018年3月29日上午9:41:20
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.dictionarie.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.dictionarie.service.DictionarieService;
import com.meatball.exuanbao.pay.dao.SysParamerMapper;
import com.meatball.exuanbao.pay.model.SysParamer;

/**   
 * @Title: DictionarieServiceImpl.java 
 * @Package com.meatball.exuanbao.dictionarie.service.impl 
 * @Description: TODO(数据字典接口实现类) 
 * @author jw  
 * @date 2018年3月29日 上午9:41:20 
 * @version V1.0   
 */
@Service
public class DictionarieServiceImpl implements DictionarieService {

	@Resource
	private SysParamerMapper sysParamerMapper;
	
	@Override
	public PageInfo<SysParamer> sysParamerList(SysParamer entity) {
		PageInfo<SysParamer> listParams = PageHelper.startPage(entity.getOffset(), entity.getLimit()).doSelectPageInfo(() 
				-> sysParamerMapper.listParams(entity));
		return listParams;
	}

	@Override
	public SysParamer sysParamerInfo(Long bId) {
		 
		return sysParamerMapper.selectByPrimaryKey(bId);
	}

	@Override
	public int sysParamerAdd(SysParamer entity) {
		 
		return sysParamerMapper.insertSelective(entity);
	}

	@Override
	public int sysParamerEdit(SysParamer entity) {
		 
		return sysParamerMapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public int sysParamerDelete(SysParamer entity) {
		entity.setiStatus(0);
		return sysParamerMapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public List<SysParamer> selectPayServiceInfo(String string, int otype) {
		List<SysParamer> list = null; 
		switch (otype) {
		case 11:
			list = sysParamerMapper.selectInfoBy(string,"规划师");
			break;
		case 12:
			list = sysParamerMapper.selectInfoBy(string,"高级规划师");
			break;
		case 13:
			list = sysParamerMapper.selectInfoBy(string,"教育专家");
			break;
		default:
			break;
		}
		return list;
	}

	
}
