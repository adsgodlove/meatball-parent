package com.meatball.api.school.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.meatball.api.school.parems.SchoolQueryParams;
import com.meatball.api.school.parems.SpecialtyScoreParems;
import com.meatball.api.school.parems.SuperioritySchoolParems;
import com.meatball.exuanbao.school.dao.SchoolMapper;
import com.meatball.exuanbao.school.model.School;
import com.meatball.exuanbao.school.model.SpecialtyScore;
import com.meatball.exuanbao.school.service.SchoolService;

/**
 * @Title: SchoolApiService.java 
 * @Package com.meatball.api.school.service 
 * @Description: TODO(学校相关业务接口) 
 * @author zk  
 * @date 2018年3月19日 上午10:01:09 
 * @version V1.0
 */
@Service
public class SchoolApiService {
	@Resource
	private SchoolService schoolService;
	@Resource
	private SchoolMapper schoolMapper;
	
	/**
	 * @Title: schoolInfo 
	 * @Description: TODO(学校详情) 
	 * @param bId 学校id
	 * @return
	 * @return School    返回类型
	 */
	public School schoolInfo(Long id){
		School school = schoolService.schoolInfo(id);
		List<String> appTitle = new ArrayList<String>();
		//层次
		String levelName = school.getvLevelname();
		appTitle.addAll(StringUtil.isNotEmpty(levelName) ? Arrays.asList(levelName.split(",")) : new ArrayList<String>());
		//院校类型名称
		appTitle.add(school.getvTypename());
		//app标题
		school.setAppTitle(appTitle);
		return school;
	}
	
	/**
	 * @Title: schoolList 
	 * @Description: TODO(学校查询) 
	 * @param entity 学校信息
	 * @return
	 * @return PageInfo<School>    返回类型
	 */
	public PageInfo<School> schoolList(SchoolQueryParams entity){
		//院校信息
		School school = new School();
		BeanUtils.copyProperties(entity, school);
		PageInfo<School> listParams = PageHelper.startPage(school.getOffset(), school.getLimit()).doSelectPageInfo(() 
				-> schoolService.schoolList(school) );
		//数据集
		List<School> schools = listParams.getList();
		for(School sch : schools){
			List<String> appTitle = new ArrayList<String>();
			//层次
			String levelName = sch.getvLevelname();
			appTitle.addAll(StringUtil.isNotEmpty(levelName) ? Arrays.asList(levelName.split(",")) : new ArrayList<String>());
			//院校类型名称
			appTitle.add(sch.getvTypename());
			//app标题
			sch.setAppTitle(appTitle);
		}
		listParams.setList(schools);
		
		return listParams;
	}
	
	/**
	 * @Title: schoolList 
	 * @Description: TODO(分页查询专业优势院校数据集) 
	 * @param entity 优势院校查询信息
	 * @return
	 * @return PageInfo<School>    返回类型
	 */
	public PageInfo<School> schoolList(SuperioritySchoolParems entity){
		//院校信息
		School school = new School();
		/*school.setSpecialtyid(entity.getSpecialtyid());
		school.setLimit(entity.getLimit());
		school.setOffset(entity.getOffset());
		school.setOrder(entity.getOrder());*/
		BeanUtils.copyProperties(entity, school);
		PageInfo<School> listParams = PageHelper.startPage(school.getOffset(), school.getLimit()).doSelectPageInfo(() 
				-> schoolService.schoolList(school) );
		//数据集
		List<School> schools = listParams.getList();
		for(School sch : schools){
			List<String> appTitle = new ArrayList<String>();
			//层次
			String levelName = sch.getvLevelname();
			appTitle.addAll(StringUtil.isNotEmpty(levelName) ? Arrays.asList(levelName.split(",")) : new ArrayList<String>());
			//院校类型名称
			appTitle.add(sch.getvTypename());
			//app标题
			sch.setAppTitle(appTitle);
		}
		listParams.setList(schools);
		return listParams;
	}
	
	
	/**
	 * @Title: specialtyScores 
	 * @Description: TODO(查询学校专业分数线) 
	 * @param record
	 * @return
	 * @return PageInfo<SpecialtyScore>    返回类型
	 */
	public PageInfo<SpecialtyScore> specialtyScores(SpecialtyScoreParems entity){
		//院校专业分数线
		SpecialtyScore record = new SpecialtyScore();
		BeanUtils.copyProperties(entity, record);
		PageInfo<SpecialtyScore> listParams = PageHelper.startPage(entity.getOffset(), entity.getLimit()).doSelectPageInfo(() 
				-> schoolService.specialtyScores(record) );
    	return listParams;
    }
    
    /**
     * @Title: groupByYear 
     * @Description: TODO(查询学校专业分数线年份) 
     * @return
     * @return List<Integer>    返回类型
     */
	public List<Integer> groupByYear(){
    	
    	return schoolService.groupByYear();
    }
}
