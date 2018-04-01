/**
 * Project Name:meatball-admin
 * File Name:NoteService.java
 * Package Name:com.meatball.exuanbao.note.service
 * Date:2018年3月30日上午9:38:45
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.note.service;

import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.note.model.Note;

/**   
 * @Title: NoteService.java 
 * @Package com.meatball.exuanbao.note.service 
 * @Description: TODO(通知接口) 
 * @author jw  
 * @date 2018年3月30日 上午9:38:45 
 * @version V1.0   
 */
public interface NoteService {

	PageInfo<Note> noteList(Note entity);

	Note noteInfo(Long bId);

	int noteAdd(Note entity);

	int noteEdit(Note entity);

	int noteDelete(Note entity);

}
