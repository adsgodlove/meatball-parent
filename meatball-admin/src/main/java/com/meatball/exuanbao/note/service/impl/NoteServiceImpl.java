/**
 * Project Name:meatball-admin
 * File Name:NoteServiceImpl.java
 * Package Name:com.meatball.exuanbao.note.service.impl
 * Date:2018年3月30日上午9:39:03
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.note.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.note.dao.NoteMapper;
import com.meatball.exuanbao.note.model.Note;
import com.meatball.exuanbao.note.service.NoteService;
/**   
 * @Title: NoteServiceImpl.java 
 * @Package com.meatball.exuanbao.note.service.impl 
 * @Description: TODO(通知接口实现类) 
 * @author jw  
 * @date 2018年3月30日 上午9:39:03 
 * @version V1.0   
 */
@Service
public class NoteServiceImpl implements NoteService {

	@Resource
	private NoteMapper noteMapper;
	
	@Override
	public PageInfo<Note> noteList(Note entity) {
		PageInfo<Note> listParams = PageHelper.startPage(entity.getOffset(), entity.getLimit()).doSelectPageInfo(() 
				-> noteMapper.listParams(entity));
		return listParams;
	}

	@Override
	public Note noteInfo(Long bId) {
		 
		return noteMapper.selectByPrimaryKey(bId);
	}

	@Override
	public int noteAdd(Note entity) {
		entity.settCreatetime(new Date());
		entity.setiStatus(1);
		return noteMapper.insertSelective(entity);
	}

	@Override
	public int noteEdit(Note entity) {
		 
		return noteMapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public int noteDelete(Note entity) {
		entity.setiStatus(0); 
		return noteMapper.updateByPrimaryKeySelective(entity);
	}

	
}
