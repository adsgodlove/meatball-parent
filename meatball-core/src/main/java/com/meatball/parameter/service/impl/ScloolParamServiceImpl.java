/**
 * Project Name:meatball-core
 * File Name:ScloolParamServiceImpl.java
 * Package Name:com.meatball.parameter.service.impl
 * Date:2018年3月15日下午4:59:46
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.parameter.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.meatball.parameter.dao.*;
import com.meatball.parameter.model.*;
import com.meatball.parameter.service.ScloolParamService;

/**   
 * @Title: ScloolParamServiceImpl.java 
 * @Package com.meatball.parameter.service.impl 
 * @Description: TODO(系统业务参数接口实现) 
 * @author zk  
 * @date 2018年3月15日 下午4:59:46 
 * @version V1.0   
 */
@Service
public class ScloolParamServiceImpl implements ScloolParamService {
	@Resource
	private RegionMapper regionMapper;
	@Resource
	private SchoolBatchMapper schoolBatchMapper;
	@Resource
	private SchoolLevelMapper schoolLevelMapper;
	@Resource
	private SchoolSubjectionMapper schoolSubjectionMapper;
	@Resource
	private SchoolTypeMapper schoolTypeMapper;
	@Resource
	private SubjectMapper subjectMapper;
	
	
	/**
	 * @Title: regionByPcode 
	 * @Description: TODO(通过父级编码查询行政单位) 
	 * @param iPcode
	 * @return
	 * @return List<Region>    返回类型
	 */
	@Override
	public List<Region> regionByPcode(Integer iPcode){
		List<Region> regionByPcode = regionMapper.selectByPcode(iPcode);
    	return regionByPcode;
    }
    
    /**
     * @Title: regionByType 
     * @Description: TODO(通过类型查询行政单位) 
     * @param iType 
     * @return
     * @return List<Region>    返回类型
     */
	@Override
	public List<Region> regionByType(Integer iType){
		List<Region> regionByType = regionMapper.selectByType(iType);
    	return regionByType;
    }
	
	/**
     * @Title: selectRegions 
     * @Description: TODO(查询几个行政区域) 
     * @param enity
     * @return
     * @return List<Region>    返回类型
     */
	@Override
	public List<Region> selectRegions(Region enity){
    	List<Region> regionByType = regionMapper.listParams(enity);
    	return regionByType;
    }
	
	/**
     * @Title: selectAreas 
     * @Description: TODO(查询几个行政区域) 
     * @param enity
     * @return
     * @return List<Area>    返回类型
     */
	@Override
	public List<Area> selectAreas(Area enity){
    	return regionMapper.listParamsArea(enity);
    }
    
    /**
     * @Title: batchAll 
     * @Description: TODO(查询全部学校录取批次) 
     * @return
     * @return List<SchoolBatch>    返回类型
     */
	@Override
	public List<SchoolBatch> batchAll(){
		List<SchoolBatch> batchAll = schoolBatchMapper.selectAll();
    	return batchAll;
    }
    
    /**
     * @Title: levelAll 
     * @Description: TODO(查询全部学校层次) 
     * @return
     * @return List<SchoolLevel>    返回类型
     */
	@Override
	public List<SchoolLevel> levelAll(){
		List<SchoolLevel> levelAll = schoolLevelMapper.selectAll();
    	return levelAll;
    }
	
	 /**
     * @Title: selectIn 
     * @Description: TODO(查询全部学校层次) 
     * @param list 层次id集
     * @return
     * @return List<SchoolLevel>    返回类型
     */
	@Override
	public List<SchoolLevel> selectIn(List<Integer> list){
		List<SchoolLevel> selectIn = schoolLevelMapper.selectIn(list);
    	return selectIn;
	}
    
    /**
     * @Title: subjectionByPid 
     * @Description: TODO(通过父级编码查询学校地方所属) 
     * @param iPid 父级id 0  大类、1 地方所属、2 教育部直属、3 其它中央部署'
     * @return
     * @return List<SchoolSubjection>    返回类型
     */
	@Override
	public List<SchoolSubjection> subjectionByPid(Integer iPid){
		List<SchoolSubjection> subjectionByPid = schoolSubjectionMapper.selectByPid(iPid);
    	return subjectionByPid;
    }
    
    /**
     * @Title: subjectionByType 
     * @Description: TODO(通过类型查询学校地方所属) 
     * @param iType	1 大类 2 （ 地方所属、教育部直属、其它中央部署）
     * @return
     * @return List<SchoolSubjection>    返回类型
     */
	@Override
	public List<SchoolSubjection> subjectionByType(Integer iType){
		List<SchoolSubjection> subjectionByType = schoolSubjectionMapper.selectByType(iType);
    	return subjectionByType;
    }
    
    /**
     * @Title: schoolTypeAll 
     * @Description: TODO(查询全部学校类型) 
     * @return
     * @return List<SchoolType>    返回类型
     */
	@Override
	public List<SchoolType> schoolTypeAll(){
		List<SchoolType> schoolTypeAll = schoolTypeMapper.selectAll();
    	return schoolTypeAll;
    }
    
    /**
     * @Title: subjectAll 
     * @Description: TODO(查询全部学科) 
     * @return
     * @return List<Subject>    返回类型
     */
	@Override
	public List<Subject> subjectAll(){
		List<Subject> subjectAll = subjectMapper.selectAll();
    	return subjectAll;
    }
}
