/**
 * Project Name:meatball-admin
 * File Name:NoteController.java
 * Package Name:com.meatball.exuanbao.note.controller
 * Date:2018年3月30日上午9:37:31
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.note.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.note.model.Note;
import com.meatball.exuanbao.note.service.NoteService;
import com.meatball.vo.ResultMsg;

/**   
 * @Title: NoteController.java 
 * @Package com.meatball.exuanbao.note.controller 
 * @Description: TODO(通知控制器) 
 * @author jw  
 * @date 2018年3月30日 上午9:37:31 
 * @version V1.0   
 */
@Controller
@RequestMapping("/exuanbao/note")
public class NoteController {
	
	@Resource
	private NoteService noteService;
	
	
	@GetMapping("/index")
	@RequiresPermissions("exuanbao:note:index")
	public String index(ModelMap map) {
		
		return "exuanbao/note/main";
	}
	
	@GetMapping("/listParams")
	@ResponseBody
	@RequiresPermissions("exuanbao:note:index")
	public PageInfo<Note> listParams(Note entity) {
		return noteService.noteList(entity);
	}
	
	
	@GetMapping("/info")
	@ResponseBody
	@RequiresPermissions("exuanbao:note:info")
	public Note info(Long bId) {
		return noteService.noteInfo(bId);
	}
	
	@PostMapping("/add")
	@ResponseBody
	@RequiresPermissions("exuanbao:note:add")
	public ResultMsg add(Note entity) {
		int count = noteService.noteAdd(entity);
		if(count == 0){
			return new ResultMsg(1, "新增失败！");	
		}
		return new ResultMsg(0, "新增成功！");
		
	}
	
	
	@PostMapping("/edit")
	@ResponseBody
	@RequiresPermissions("exuanbao:note:edit")
	public ResultMsg edit(Note entity) {
		int count = noteService.noteEdit(entity);
		if(count == 0){
			return new ResultMsg(1, "编辑失败！");	
		}
		return new ResultMsg(0, "编辑成功！");
		
	}
	
	
	@PostMapping("/delete")
	@ResponseBody
	@RequiresPermissions("exuanbao:note:delete")
	public ResultMsg delete(Note entity) {
		int count = noteService.noteDelete(entity);
		if(count == 0){
			return new ResultMsg(1, "删除失败！");	
		}
		return new ResultMsg(0, "删除成功！");
	}
	
	@InitBinder   
    public void initBinder(WebDataBinder binder) {   
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
        dateFormat.setLenient(true);   
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));   
    } 
}
