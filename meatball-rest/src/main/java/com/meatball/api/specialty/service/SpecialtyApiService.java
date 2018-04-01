/**
 * Project Name:meatball-rest
 * File Name:SpecialtyApiService.java
 * Package Name:com.meatball.api.specialty.service
 * Date:2018年3月25日下午3:43:46
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.specialty.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.meatball.api.specialty.parems.SuperiorityInfoParems;
import com.meatball.api.specialty.parems.SuperioritySpecialtyParems;
import com.meatball.api.specialty.parems.SuperiorityTypeParams;
import com.meatball.exuanbao.specialty.model.Specialty;
import com.meatball.exuanbao.specialty.model.SpecialtyTree;
import com.meatball.exuanbao.specialty.service.SpecialtyService;

/**   
 * @Title: SpecialtyApiService.java 
 * @Package com.meatball.api.specialty.service 
 * @Description: TODO(专业) 
 * @author zk  
 * @date 2018年3月25日 下午3:43:46 
 * @version V1.0   
 */
@Service
public class SpecialtyApiService {
	@Resource
	SpecialtyService specialtyService;
	

	/**
	 * @Title: spectaltyInfo 
	 * @Description: TODO(专业详情) 
	 * @param id 专业id
	 * @return
	 * @return Specialty    返回类型
	 */
	public Specialty spectaltyInfo(SuperiorityInfoParems entity){
		Specialty specialty = specialtyService.specialtyInfo(entity.getbId());
		if(specialty == null){
			specialty = new Specialty();
		}
		return specialty;
	}
	
	
	/**
	 * @Title: selectSpectaltys 
	 * @Description: TODO(按照类型查询专业) 
	 * @param entity
	 * @return
	 * @return List<SpecialtyTree>    返回类型
	 */
	public List<SpecialtyTree> selectSpectaltys(SuperiorityTypeParams entity){
		//查询类型（全部专业 10、热门专业 11、女生适合专业 12、男生适合专业 13、文科热门专业 14、理科热门专业 15）
		Integer type = entity.getiType();
		//专业
		Specialty specialty = new Specialty();
		//全部专业 10
		if(type == 10){}
		//热门专业 11
		if(type == 11){
			//是否热门  1是 2否
			specialty.setiHot(1);
		}
		//女生适合专业 12
		if(type == 12){
			//男 女
			specialty.setvGender("女");
		}
		//男生适合专业 13
		if(type == 13){
			//男 女
			specialty.setvGender("男");
		}
		//文科热门专业 14
		if(type == 14){
			//1 文科 2 理科
			specialty.setiType(1);
			specialty.setiHot(1);
		}
		//理科热门专业 15
		if(type == 15){
			//1 文科 2 理科
			specialty.setiType(2);
			specialty.setiHot(1);
		}
		
	    return specialtyService.selectSpectaltys(specialty);
	}
	
	
	/**
	 * @Title: superioritySpecialtyList 
	 * @Description: TODO(院校下优势专业) 
	 * @param entity 优势专业查询信息
	 * @return
	 * @return List<SpecialtyTree>    返回类型
	 */
	public List<SpecialtyTree> superioritySpecialtyList(SuperioritySpecialtyParems entity){
		//专业
		Specialty specialty = new Specialty();
		specialty.setSchoolid(entity.getSchoolid());
		specialty.setOffset(entity.getOffset());
		specialty.setLimit(entity.getLimit());
		specialty.setOrder(entity.getOrder());
		specialty.setiCategory(3);//最底层专业
		return specialtyService.selectSpectaltys(specialty);
	}
	
}

