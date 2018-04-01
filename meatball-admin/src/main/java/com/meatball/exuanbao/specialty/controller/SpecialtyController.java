package com.meatball.exuanbao.specialty.controller;

import java.util.List;
import javax.annotation.Resource;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.specialty.model.SpecialtyTree;
import com.meatball.exuanbao.school.model.School;
import com.meatball.exuanbao.specialty.model.Specialty;
import com.meatball.exuanbao.specialty.service.SpecialtyService;
import com.meatball.vo.ResultMsg;
/** 
 * @Title: SpecialtyController.java 
 * @Package com.meatball.exuanbao.specialty.controller 
 * @Description: TODO(专业类控制器) 
 * @author jw  
 * @date 2018年3月18日 下午3:15:24 
 * @version V1.0
 */
@Controller
@RequestMapping("/exuanbao/specialty")
public class SpecialtyController {
	
	@Resource
	private SpecialtyService specialtyService;

	@GetMapping("/index")
	@RequiresPermissions("exuanbao:specialty:index")
	public String index(ModelMap map) {
		
		return "exuanbao/specialty/specialty";
	}
	
	/**
	 * @Title: selectSpecialtyTree 
	 * @Description: TODO(返回专业树) 
	 * @return List<Specialty>    返回类型 
	 */
	@PostMapping("/specialtyTree")
	@ResponseBody
	@RequiresPermissions("exuanbao:specialty:index")
	public List<SpecialtyTree> selectSpecialtyTree() {
		return specialtyService.selectSpecialtyTree();
	}
	
	
	/**
	 * @Title: listParams 
	 * @Description: TODO(返回专业分页列表) 
	 * @param entity
	 * @return
	 * @return PageInfo<Specialty>    返回类型
	 */
	@GetMapping("/listParams")
	@ResponseBody
	@RequiresPermissions("exuanbao:specialty:index")
	public PageInfo<Specialty> listParams(Specialty entity) {
		
		return specialtyService.getSpecialtyList(entity);
	}
	
	@PostMapping("/add")
	@ResponseBody
	@RequiresPermissions("exuanbao:specialty:add")
	public ResultMsg add(Specialty entity) {
		int count = specialtyService.specialtyAdd(entity);
		if(count == 0){
			return new ResultMsg(1, "新增失败！");	
		}else{
			return new ResultMsg(0, "新增成功！");
		}
	}
	
	
	@PostMapping("/edit")
	@ResponseBody
	@RequiresPermissions("exuanbao:specialty:edit")
	public ResultMsg edit(Specialty entity) {
		int count = specialtyService.specialtyEdit(entity);
		if(count == 0){
			return new ResultMsg(1, "编辑失败！");	
		}else{
			return new ResultMsg(0, "编辑成功！");
		}
	}
	
	
	@PostMapping("/delete")
	@ResponseBody
	@RequiresPermissions("exuanbao:specialty:delete")
	public ResultMsg delete(Specialty entity) {
		int count = specialtyService.specialtyDelete(entity);
		if(count == 0){
			return new ResultMsg(1, "删除失败！");	
		}else{
			return new ResultMsg(0, "删除成功！");
		}
	}
	
	
	@GetMapping("/info")
	@ResponseBody
	@RequiresPermissions("exuanbao:specialty:info")
	public Specialty info(Long bId) {
		Specialty entity = specialtyService.specialtyInfo(bId);
		return entity;
	}
}
