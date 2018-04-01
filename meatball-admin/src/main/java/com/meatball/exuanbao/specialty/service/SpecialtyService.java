/**
 * Project Name:meatball-admin
 * File Name:SpecialtyService.java
 * Package Name:com.meatball.exuanbao.specialty.service
 * Date:2018年3月18日下午3:35:30
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.specialty.service;

import java.util.List;
import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.specialty.model.SpecialtyTree;
import com.meatball.exuanbao.specialty.model.Specialty;

/**   
 * @Title: SpecialtyService.java 
 * @Package com.meatball.exuanbao.specialty.service 
 * @Description: TODO(专业接口) 
 * @author jw  
 * @date 2018年3月18日 下午3:35:30 
 * @version V1.0   
 */
public interface SpecialtyService {
	
	/**
	 * @Title: getSpecialtyList 
	 * @Description: TODO(获取专业集合) 
	 * @param specialty
	 * @return
	 * @return PageInfo<Specialty>    返回类型
	 */
	PageInfo<Specialty> getSpecialtyList(Specialty specialty);

	/**
	 * @Title: specialtyInfo 
	 * @Description: TODO(专业详情) 
	 * @param bId 专业id
	 * @return
	 * @return Specialty    返回类型
	 */
	public Specialty specialtyInfo(Long bId);

	/**
	 * @Title: specialtyAdd 
	 * @Description: TODO(专业添加) 
	 * @param entity 专业
	 * @return
	 * @return int    返回类型
	 */
	public int specialtyAdd(Specialty entity);
	
	/**
	 * @Title: specialtyEdit 
	 * @Description: TODO(专业编辑) 
	 * @param entity 专业
	 * @return
	 * @return int    返回类型
	 */
	public int specialtyEdit(Specialty entity);
	
	/**
	 * @Title: specialtyDelete 
	 * @Description: TODO(删除) 
	 * @param entity
	 * @return
	 * @return int    返回类型
	 */
	public int specialtyDelete(Specialty entity);
	
	/**
	 * @Title: selectSpecialtyTree 
	 * @Description: TODO(查询专业树) 
	 * @return
	 * @return List<SpecialtyTree>    返回类型
	 */
	public List<SpecialtyTree> selectSpecialtyTree();
	
	/**
	 * @Title: selectSpecialtyTreeAll 
	 * @Description: TODO(查询全部专业树) 
	 * @param schoolId 学校id(查询所有专业树)
	 * @return
	 * @return List<SpecialtyTree>    返回类型
	 */
	public List<SpecialtyTree> selectSpecialtyTreeAll(Long schoolId);
	
	
	
	/**
	 * @Title: selectSpectaltys 
	 * @Description: TODO(查询专业集) 
	 * @param specialty
	 * @return
	 * @return List<SpecialtyTree>    返回类型
	 */
	List<SpecialtyTree> selectSpectaltys(Specialty specialty);
}
