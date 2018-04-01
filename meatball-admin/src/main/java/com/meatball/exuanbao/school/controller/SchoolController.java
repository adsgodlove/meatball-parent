/**
 * Project Name:meatball-admin
 * File Name:SchoolController.java
 * Package Name:com.meatball.exuanbao.school.controller
 * Date:2018年3月16日上午10:17:06
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.school.controller;

import java.util.List;
import javax.annotation.Resource;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meatball.parameter.model.*;
import com.meatball.parameter.service.ScloolParamService;
import com.meatball.exuanbao.school.model.School;
import com.meatball.exuanbao.school.model.SpecialtyScore;
import com.meatball.exuanbao.school.service.SchoolService;
import com.meatball.exuanbao.specialty.model.SpecialtyTree;
import com.meatball.exuanbao.specialty.service.SpecialtyService;
import com.meatball.vo.ResultMsg;

/**   
 * @Title: SchoolController.java 
 * @Package com.meatball.exuanbao.school.controller 
 * @Description: TODO(学校/专业相关) 
 * @author zk  
 * @date 2018年3月16日 上午10:17:06 
 * @version V1.0   
 */
@Controller
@RequestMapping("/exuanbao/school")
public class SchoolController {
	@Resource
	private SchoolService schoolService;
	@Resource
	private ScloolParamService scloolParamService;
	@Resource
	private SpecialtyService specialtyService;
	
	@GetMapping("/index")
	@RequiresPermissions("exuanbao:school:index")
	public String index(ModelMap map) {
		//通过父级编码查询行政单位
		List<Region> regionArray = scloolParamService.regionByType(1);
		map.addAttribute("regionArray", regionArray);
		//查询全部学校录取批次
		List<SchoolBatch> batchArray = scloolParamService.batchAll();
		map.addAttribute("batchArray", batchArray);
		//查询全部学校层次
		List<SchoolLevel> levelArray = scloolParamService.levelAll();
		map.addAttribute("levelArray", levelArray);
		//通过类型查询学校地方所属(1 大类 2 （ 地方所属、教育部直属、其它中央部署）)
		List<SchoolSubjection> subjectionArray = scloolParamService.subjectionByType(2);
		map.addAttribute("subjectionArray", subjectionArray);
		//查询全部学校类型
		List<SchoolType> schoolTypeArray = scloolParamService.schoolTypeAll();
		map.addAttribute("schoolTypeArray", schoolTypeArray);
		//查询全部专业
		List<SpecialtyTree> specialtyTreeAll = specialtyService.selectSpecialtyTreeAll(null);
		map.addAttribute("specialtyTreeAll", specialtyTreeAll);
		
		//查询学校专业分数年限
		List<Integer> groupByYear = schoolService.groupByYear();
		map.addAttribute("groupByYear", groupByYear);
		return "exuanbao/school/school";
	}
	
	
	@GetMapping("/listParams")
	@ResponseBody
	@RequiresPermissions("exuanbao:school:index")
	public PageInfo<School> listParams(School entity) {
		PageInfo<School> listParams = PageHelper.startPage(entity.getOffset(), entity.getLimit()).doSelectPageInfo(() 
				-> schoolService.schoolList(entity));
		return listParams;
	}
	
	
	@PostMapping("/add")
	@ResponseBody
	@RequiresPermissions("exuanbao:school:add")
	public ResultMsg add(School entity) {
		int count = schoolService.schoolAdd(entity);
		if(count == 0){
			return new ResultMsg(1, "新增失败！");	
		}else{
			return new ResultMsg(0, "新增成功！");
		}
	}
	
	
	@PostMapping("/edit")
	@ResponseBody
	@RequiresPermissions("exuanbao:school:edit")
	public ResultMsg edit(School entity) {
		int count = schoolService.schoolEdit(entity);
		if(count == 0){
			return new ResultMsg(1, "编辑失败！");	
		}else{
			return new ResultMsg(0, "编辑成功！");
		}
	}
	
	
	@PostMapping("/delete")
	@ResponseBody
	@RequiresPermissions("exuanbao:school:delete")
	public ResultMsg delete(School entity) {
		int count = schoolService.schoolDelete(entity);
		if(count == 0){
			return new ResultMsg(1, "删除失败！");	
		}else{
			return new ResultMsg(0, "删除成功！");
		}
	}
	
	
	@GetMapping("/info")
	@ResponseBody
	@RequiresPermissions("exuanbao:school:info")
	public School info(Long bId) {
		School entity = schoolService.schoolInfo(bId);
		return entity;
	}
	
	
	@GetMapping("/specialtyScores")
	@ResponseBody
	@RequiresPermissions("exuanbao:school:info")
	public PageInfo<SpecialtyScore> specialtyScores(SpecialtyScore record) {
		PageInfo<SpecialtyScore> listParams = PageHelper.startPage(record.getOffset(), record.getLimit()).doSelectPageInfo(() 
				-> schoolService.specialtyScores(record));
		//List<SpecialtyScore> specialtyScores = schoolService.specialtyScores(record);
		return listParams;
	}
	
	
	/**
	 * @Title: regionByPcode 
	 * @Description: TODO(通过父级编码查询行政单位) 
	 * @param pcode 父编码
	 * @return
	 * @return ResultMsg    返回类型
	 */
	@PostMapping("/regionByPcode")
	@ResponseBody
	@RequiresPermissions("exuanbao:school:info")
	public ResultMsg regionByPcode(Integer pcode) {
		List<Region> regionByPcode = scloolParamService.regionByPcode(pcode);
		return new ResultMsg(200, regionByPcode);
	}
	

	@PostMapping("/specialtyTree")
	@ResponseBody
	@RequiresPermissions("exuanbao:specialty:index")
	public List<SpecialtyTree> selectSpecialtyTree( Long schoolId) {
		
		return specialtyService.selectSpecialtyTreeAll(schoolId);
	}
}
