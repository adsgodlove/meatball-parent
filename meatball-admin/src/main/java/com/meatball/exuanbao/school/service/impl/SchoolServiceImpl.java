/**
 * Project Name:meatball-admin
 * File Name:SchoolServiceImpl.java
 * Package Name:com.meatball.exuanbao.school.service.impl
 * Date:2018年3月15日下午5:19:02
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.school.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.meatball.exuanbao.school.service.SchoolService;
import com.meatball.exuanbao.specialty.model.SpecialtyTree;
import com.meatball.exuanbao.specialty.service.SpecialtyService;
import com.meatball.parameter.model.SchoolLevel;
import com.meatball.parameter.service.ScloolParamService;
import com.meatball.exuanbao.school.dao.*;
import com.meatball.exuanbao.school.model.School;
import com.meatball.exuanbao.school.model.SchoolLevelLinks;
import com.meatball.exuanbao.school.model.SchoolSpecialtyLinks;
import com.meatball.exuanbao.school.model.SpecialtyScore;

/**   
 * @Title: SchoolServiceImpl.java 
 * @Package com.meatball.exuanbao.school.service.impl 
 * @Description: TODO(学校) 
 * @author zk  
 * @date 2018年3月15日 下午5:19:02 
 * @version V1.0   
 */
@Service
public class SchoolServiceImpl implements SchoolService {
	@Resource
	private SchoolBatchLinksMapper schoolBatchLinksMapper;
	@Resource
	private SchoolLevelLinksMapper schoolLevelLinksMapper;
	@Resource
	private SchoolMapper schoolMapper;
	@Resource
	private SchoolSpecialtyLinksMapper schoolSpecialtyLinksMapper;
	@Resource
	private SpecialtyScoreMapper specialtyScoreMapper;
	@Resource
	private ScloolParamService scloolParamService;
	@Resource
	private SpecialtyService specialtyService;
	
	/**
	 * @Title: schoolInfo 
	 * @Description: TODO(学校详情) 
	 * @param bId 学校id
	 * @return
	 * @return School    返回类型
	 */
	public School schoolInfo(Long bId){
		//院校
		School entity = schoolMapper.selectByPrimaryKey(bId);
		if(bId == null || entity == null){
			entity = new School();
		}
		//专业树
		List<SpecialtyTree> specialtyTreeAll = specialtyService.selectSpecialtyTreeAll(entity.getbId());
		entity.setSpecialtysTrees(specialtyTreeAll);
		//学院专业
	    List<SchoolLevel> schoolLevels = schoolLevelLinksMapper.selectBySchoolid(entity.getbId());
	    entity.setSchoolLevels(schoolLevels);
	    
		return entity;
	}

	/**
	 * @Title: schoolAdd 
	 * @Description: TODO(学校添加) 
	 * @param entity 学校
	 * @return
	 * @return int    返回类型
	 */
	public int schoolAdd(School entity){
		//院校层次vLevelname
		String vlevelName = "";
		List<Integer> iLevelids = new ArrayList<Integer>();
		String [] vLevelnameStr = entity.getvLevelname().isEmpty() ? new String[0] : entity.getvLevelname().split(",");
		for(String str : vLevelnameStr){
			if(!str.isEmpty()){
				iLevelids.add(Integer.parseInt(str));
			}
		}
		List<SchoolLevel> selectIns = scloolParamService.selectIn(iLevelids);
		for(SchoolLevel level : selectIns){
			if(level.getvName().indexOf("211") == 0 
					|| level.getvName().indexOf("985") == 0 
					|| level.getvName().indexOf("双一流") == 0){
				vlevelName += level.getvName()+",";
			}
		}
		
		entity.setvLevelname(vlevelName);
		entity.settCreatetime(entity.gettModifytime());
		int count = schoolMapper.insertSelective(entity);
		if(count == 1){
			//院校专业specialtyStr
			String [] specialtyStr = entity.getSpecialtyStr().isEmpty() ? new String[0] : entity.getSpecialtyStr().split(",");
			for(String str : specialtyStr){
				if(!str.isEmpty()){
					schoolSpecialtyLinksMapper.insertSelective(new SchoolSpecialtyLinks(entity.getbId(), Long.parseLong(str)));
				}
			}
			//院校层次vLevelname
			for(Integer str : iLevelids){
				schoolLevelLinksMapper.insertSelective(new SchoolLevelLinks(entity.getbId(), str));
			}
		}
		
		return count;
	}
	
	/**
	 * @Title: schoolEdit 
	 * @Description: TODO(学校编辑) 
	 * @param entity 学校
	 * @return
	 * @return int    返回类型
	 */
	public int schoolEdit(School entity){
		//院校层次vLevelname
		String vlevelName = "";
		List<Integer> iLevelids = new ArrayList<Integer>();
		String [] vLevelnameStr = entity.getvLevelname().isEmpty() ? new String[0] : entity.getvLevelname().split(",");
		for(String str : vLevelnameStr){
			if(!str.isEmpty()){
				iLevelids.add(Integer.parseInt(str));
			}
		}
		List<SchoolLevel> selectIns = scloolParamService.selectIn(iLevelids);
		for(SchoolLevel level : selectIns){
			if(level.getvName().indexOf("211") == 0 
					|| level.getvName().indexOf("985") == 0 
					|| level.getvName().indexOf("双一流") == 0){
				vlevelName += level.getvName()+",";
			}
		}
		
		entity.setvLevelname(vlevelName);
		entity.settCreatetime(entity.gettModifytime());
		int count = schoolMapper.updateByPrimaryKeySelective(entity);
		if(count == 1){
			//院校专业specialtyStr
			String [] specialtyStr = entity.getSpecialtyStr().isEmpty() ? new String[0] : entity.getSpecialtyStr().split(",");
			schoolSpecialtyLinksMapper.deleteBySchoolid(entity.getbId());
			for(String str : specialtyStr){
				if(!str.isEmpty()){
					schoolSpecialtyLinksMapper.insertSelective(new SchoolSpecialtyLinks(entity.getbId(), Long.parseLong(str)));
				}
			}
			//院校层次vLevelname
			schoolLevelLinksMapper.deleteBySchoolid(entity.getbId());
			for(Integer str : iLevelids){
				schoolLevelLinksMapper.insertSelective(new SchoolLevelLinks(entity.getbId(), str));
			}
		}
		return count;
	}
	
	/**
	 * @Title: schoolDelete 
	 * @Description: TODO(删除) 
	 * @param entity
	 * @return
	 * @return int    返回类型
	 */
	public int schoolDelete(School entity){
		//修改状态
		entity.setiStatus(1);
		int count = schoolMapper.updateByPrimaryKeySelective(entity);
		return count;
	}
	
	/**
	 * @Title: schoolList 
	 * @Description: TODO(学校查询) 
	 * @param entity 学校信息
	 * @return
	 * @return List<School>    返回类型
	 */
	public List<School> schoolList(School entity){
		
		return schoolMapper.listParams(entity);
	}

	public static void main(String[] args) {
		String str = "211ssss";
		System.out.println(str.indexOf("2111"));
	}
	
	
	/**
	 * @Title: specialtyScores 
	 * @Description: TODO(查询学校专业分数线) 
	 * @param record
	 * @return
	 * @return List<SpecialtyScore>    返回类型
	 */
	public List<SpecialtyScore> specialtyScores(SpecialtyScore record){
    	
    	return specialtyScoreMapper.listParams(record);
    }
    
    /**
     * @Title: groupByYear 
     * @Description: TODO(查询学校专业分数线年份) 
     * @return
     * @return List<Integer>    返回类型
     */
	public List<Integer> groupByYear(){
    	
    	return specialtyScoreMapper.groupByYear();
    }

}
