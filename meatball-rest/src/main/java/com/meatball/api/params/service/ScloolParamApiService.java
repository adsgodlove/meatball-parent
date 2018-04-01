/**
 * Project Name:meatball-core
 * File Name:ScloolParamApiService.java
 * Package Name:com.meatball.parameter.service.impl
 * Date:2018年3月15日下午4:59:46
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.params.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.meatball.api.params.parems.AreaParams;
import com.meatball.exuanbao.specialty.model.SpecialtyTree;
import com.meatball.parameter.model.*;
import com.meatball.parameter.service.ScloolParamService;

/**   
 * @Title: ScloolParamApiService.java 
 * @Package com.meatball.parameter.service.impl 
 * @Description: TODO(系统业务参数接口实现) 
 * @author zk  
 * @date 2018年3月15日 下午4:59:46 
 * @version V1.0   
 */
@Service
public class ScloolParamApiService {
	@Resource
	private ScloolParamService parameterService;
	
	/**
	 * @Title: regionByPcode 
	 * @Description: TODO(通过父级编码查询行政单位) 
	 * @param iPcode
	 * @return
	 * @return List<Region>    返回类型
	 */
	public List<Region> regionByPcode(Integer iPcode){

    	return parameterService.regionByPcode(iPcode);
    }
    
    /**
     * @Title: regionByType 
     * @Description: TODO(通过类型查询行政单位) 
     * @param iType 
     * @return
     * @return List<Region>    返回类型
     */
	public List<Region> regionByType(Integer iType){

    	return parameterService.regionByType(iType);
    }
	
	
	
	
	
	/**
     * @Title: selectRegions 
     * @Description: TODO(查询几个行政区域) 
     * @param enity
     * @return
     * @return List<AreaParams>    返回类型
     */
	public List<Area> selectRegions(Region enity){
		/*//查询全部行政区域代码
    	List<Region> selectRegions = parameterService.selectRegions(enity);
    	//处理数据集
    	List<AreaParams> areas = new ArrayList<AreaParams>();
    	//返回结果集
    	List<AreaParams> areaParams = new ArrayList<AreaParams>();
    	for(Region region : selectRegions){
			if(region.getiPcode() == 0){
				areaParams.add(new AreaParams(region.getiCode(), region.getvName(), region.getiPcode(), region.getiType()));
			}
			areas.add(new AreaParams(region.getiCode(), region.getvName(), region.getiPcode(), region.getiType()));
		}
    	
    	for (AreaParams area : areaParams) {
    		List<AreaParams> child = getChild(area.getV(), areas);
    		area.setC(child);
	    }
    	
    	return areaParams;*/
		//返回结果集
    	List<Area> areaParams = new ArrayList<Area>();
    	//第一层
		List<Area> areas1 = parameterService.selectAreas(new Area(1));
    	for(Area area1 : areas1){
    		Area area11 = new Area();
    		area11.setP(area1.getV());
    		List<Area> areas2 = parameterService.selectAreas(area11);
    		area1.setC(areas2);
    		for(Area area2 : areas2){
    			Area area22 = new Area();
    			area22.setP(area2.getV());
    			area22.setC(parameterService.selectAreas(area22));
    		}
		}
    	return areas1;
    }
	
	
	/**
	 * @Title: getChild 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param id 当前区域id
	 * @param specialtys 一级区域
	 * @return
	 * @return List<SpecialtyTree> 要查找的列表
	 */
	private List<AreaParams> getChild(Integer v, List<AreaParams> areas) {
	    //子区域
	    List<AreaParams> childList = new ArrayList<AreaParams>();
	    for (AreaParams area : areas) {
	        // 遍历所有节点，将父区域id与传过来的id比较
	    	if (area.getP().intValue() == v.intValue()) {
                childList.add(area);
            }
	    }
	    
	    // 把子区域的子区域再循环一遍
	    for (AreaParams area : childList) {// 没有url子区域还有子区域
	    	 // 递归
	    	area.setC(this.getChild(area.getV(), areas));
	    } // 递归退出条件
	    if (childList.size() == 0) {
	        return null;
	    }
	    return childList;
	}
	
    
    /**
     * @Title: batchAll 
     * @Description: TODO(查询全部学校录取批次) 
     * @return
     * @return List<SchoolBatch>    返回类型
     */
	public List<SchoolBatch> batchAll(){
		
    	return parameterService.batchAll();
    }
    
    /**
     * @Title: levelAll 
     * @Description: TODO(查询全部学校层次) 
     * @return
     * @return List<SchoolLevel>    返回类型
     */
	public List<SchoolLevel> levelAll(){

    	return parameterService.levelAll();
    }
    
    /**
     * @Title: subjectionByPid 
     * @Description: TODO(通过父级编码查询学校地方所属) 
     * @param iPid  0  大类、1 地方所属、2 教育部直属、3 其它中央部署'
     * @return
     * @return List<SchoolSubjection>    返回类型
     */
	public List<SchoolSubjection> subjectionByPid(Integer iPid){

    	return parameterService.subjectionByPid(iPid);
    }
    
    /**
     * @Title: subjectionByType 
     * @Description: TODO(通过类型查询学校地方所属) 
     * @param iType	1 大类 2 （ 地方所属、教育部直属、其它中央部署）
     * @return
     * @return List<SchoolSubjection>    返回类型
     */
	public List<SchoolSubjection> subjectionByType(Integer iType){

    	return parameterService.subjectionByType(iType);
    }
    
    /**
     * @Title: schoolTypeAll 
     * @Description: TODO(查询全部学校类型) 
     * @return
     * @return List<SchoolType>    返回类型
     */
	public List<SchoolType> schoolTypeAll(){

    	return parameterService.schoolTypeAll();
    }
    
    /**
     * @Title: subjectAll 
     * @Description: TODO(查询全部学科) 
     * @return
     * @return List<Subject>    返回类型
     */
	public List<Subject> subjectAll(){

    	return parameterService.subjectAll();
    }
}
