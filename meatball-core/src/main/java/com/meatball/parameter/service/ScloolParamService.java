/**
 * Project Name:meatball-core
 * File Name:ScloolParamService.java
 * Package Name:com.meatball.parameter.service
 * Date:2018年3月15日下午4:59:21
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.parameter.service;

import java.util.List;
import com.meatball.parameter.model.*;

/**   
 * @Title: ScloolParamService.java 
 * @Package com.meatball.parameter.service 
 * @Description: TODO(系统业务参数接口) 
 * @author zk  
 * @date 2018年3月15日 下午4:59:21 
 * @version V1.0   
 */
public interface ScloolParamService {

	/**
	 * @Title: regionByPcode 
	 * @Description: TODO(通过父级编码查询行政单位) 
	 * @param iPcode 
	 * @return
	 * @return List<Region>    返回类型
	 */
    List<Region> regionByPcode(Integer iPcode);
    
    /**
     * @Title: regionByType 
     * @Description: TODO(通过类型查询行政单位) 
     * @param iType 
     * @return
     * @return List<Region>    返回类型
     */
    List<Region> regionByType(Integer iType);
    
    /**
     * @Title: selectRegions 
     * @Description: TODO(查询几个行政区域) 
     * @param enity
     * @return
     * @return List<Region>    返回类型
     */
    List<Region> selectRegions(Region enity);
    
    /**
     * @Title: selectAreas 
     * @Description: TODO(查询几个行政区域) 
     * @param enity
     * @return
     * @return List<Area>    返回类型
     */
    List<Area> selectAreas(Area enity);
    
    /**
     * @Title: batchAll 
     * @Description: TODO(查询全部学校录取批次) 
     * @return
     * @return List<SchoolBatch>    返回类型
     */
    List<SchoolBatch> batchAll();
    
    /**
     * @Title: levelAll 
     * @Description: TODO(查询全部学校层次) 
     * @return
     * @return List<SchoolLevel>    返回类型
     */
    List<SchoolLevel> levelAll();
    
    /**
     * @Title: selectIn 
     * @Description: TODO(查询全部学校层次) 
     * @param list 层次id集
     * @return
     * @return List<SchoolLevel>    返回类型
     */
    List<SchoolLevel> selectIn(List<Integer> list);
    
    /**
     * @Title: subjectionByPid 
     * @Description: TODO(通过父级编码查询学校地方所属) 
     * @param iPid	0  大类、1 地方所属、2 教育部直属、3 其它中央部署'
     * @return
     * @return List<SchoolSubjection>    返回类型
     */
    List<SchoolSubjection> subjectionByPid(Integer iPid);
    
    /**
     * @Title: subjectionByType 
     * @Description: TODO(通过类型查询学校地方所属) 
     * @param iType	1 大类 2 （ 地方所属、教育部直属、其它中央部署）
     * @return
     * @return List<SchoolSubjection>    返回类型
     */
    List<SchoolSubjection> subjectionByType(Integer iType);
    
    /**
     * @Title: schoolTypeAll 
     * @Description: TODO(查询全部学校类型) 
     * @return
     * @return List<SchoolType>    返回类型
     */
    List<SchoolType> schoolTypeAll();
    
    /**
     * @Title: subjectAll 
     * @Description: TODO(查询全部学科) 
     * @return
     * @return List<Subject>    返回类型
     */
    List<Subject> subjectAll();
}
