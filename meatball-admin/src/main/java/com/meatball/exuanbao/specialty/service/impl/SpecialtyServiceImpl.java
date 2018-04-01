/**
 * Project Name:meatball-admin
 * File Name:SpecialtyServiceImpl.java
 * Package Name:com.meatball.exuanbao.specialty.service.impl
 * Date:2018年3月18日下午3:35:57
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.specialty.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.specialty.dao.SpecialtyMapper;
import com.meatball.exuanbao.specialty.model.SpecialtyTree;
import com.meatball.exuanbao.specialty.model.Specialty;
import com.meatball.exuanbao.specialty.service.SpecialtyService;

/**   
 * @Title: SpecialtyServiceImpl.java 
 * @Package com.meatball.exuanbao.specialty.service.impl 
 * @Description: TODO(专业接口实现类) 
 * @author jw  
 * @date 2018年3月18日 下午3:35:57 
 * @version V1.0   
 */
@Service
public class SpecialtyServiceImpl implements SpecialtyService {

	@Resource
	private SpecialtyMapper specialtyMapper;
	
	/**
	 * @Title: getSpecialtyList 
	 * @Description: TODO(获取专业集合) 
	 * @param specialty
	 * @return
	 * @return PageInfo<Specialty>    返回类型
	 */
	@Override
	public PageInfo<Specialty> getSpecialtyList(Specialty specialty) {
		PageInfo<Specialty> listParams = PageHelper.startPage(specialty.getOffset(), specialty.getLimit()).doSelectPageInfo(() 
				-> specialtyMapper.listParams(specialty));
		return listParams;
	}
	
	/**
	 * @Title: specialtyInfo 
	 * @Description: TODO(专业详情) 
	 * @param bId 专业id
	 * @return
	 * @return Specialty    返回类型
	 */
	public Specialty specialtyInfo(Long bId){
		Specialty entity = specialtyMapper.selectByPrimaryKey(bId);
		if(entity == null){
			entity = new Specialty();
		}
		return entity;
	}

	/**
	 * @Title: specialtyAdd 
	 * @Description: TODO(专业添加) 
	 * @param entity 专业
	 * @return
	 * @return int    返回类型
	 */
	public int specialtyAdd(Specialty entity){
		entity.setiStatus(0);
		int count = specialtyMapper.insertSelective(entity);
		return count;
	}
	
	/**
	 * @Title: specialtyEdit 
	 * @Description: TODO(专业编辑) 
	 * @param entity 专业
	 * @return
	 * @return int    返回类型
	 */
	public int specialtyEdit(Specialty entity){
		int count = specialtyMapper.updateByPrimaryKeySelective(entity);
		return count;
	}
	
	/**
	 * @Title: specialtyDelete 
	 * @Description: TODO(删除) 
	 * @param entity
	 * @return
	 * @return int    返回类型
	 */
	public int specialtyDelete(Specialty entity){
		entity.setiStatus(0);
		int count = specialtyMapper.updateByPrimaryKeySelective(entity);
		return count;
	}
	
	/**
	 * @Title: selectSpecialtyTree 
	 * @Description: TODO(查询专业树) 
	 * @return
	 * @return List<SpecialtyTree>    返回类型
	 */
	@Override
	public List<SpecialtyTree> selectSpecialtyTree() {
		List<SpecialtyTree> specialtys = new ArrayList<SpecialtyTree>();
		//文科
		SpecialtyTree wen = new SpecialtyTree(Long.valueOf("1"), "文科", 1, Long.valueOf("0"), 0);
		//1类
		List<SpecialtyTree> listParams = specialtyMapper.listParamTree(new SpecialtyTree(1, 1, null));
		//二类
		specialtyChildren(listParams);
		wen.setChildren(listParams);
		specialtys.add(wen);
		
		//理科
		SpecialtyTree li = new SpecialtyTree(Long.valueOf("2"), "理科", 2, Long.valueOf("0"), 0);
		//1类
		listParams = specialtyMapper.listParamTree(new SpecialtyTree(2, 1, null));
		//二类
		specialtyChildren(listParams);
		li.setChildren(listParams);
		specialtys.add(li);
		return specialtys;
	}
	
	/**
	 * @Title: selectSpecialtyTreeAll 
	 * @Description: TODO(查询全部专业树) 
	 * @param schoolId 学校id  schoolId 不为空则查询学校相关专业树，否则查询全部专业
	 * @return
	 * @return List<SpecialtyTree>    返回类型
	 */
	@Override
	public List<SpecialtyTree> selectSpecialtyTreeAll(Long schoolId) {
		List<SpecialtyTree> specialtys = new ArrayList<SpecialtyTree>();
		List<SpecialtyTree> listParamTree = specialtyMapper.listParamTreeBySchool(new SpecialtyTree(null, null, null, schoolId));
		//文科
		SpecialtyTree wen = new SpecialtyTree(Long.valueOf("1"), "文科", 1, Long.valueOf("0"), 0);
		List<SpecialtyTree> wenListParam = new ArrayList<SpecialtyTree>();
		wen.setChildren(wenListParam);
		specialtys.add(wen);
		//理科
		SpecialtyTree li = new SpecialtyTree(Long.valueOf("2"), "理科", 2, Long.valueOf("0"), 0);
		List<SpecialtyTree> liListParam = new ArrayList<SpecialtyTree>();
		li.setChildren(liListParam);
		specialtys.add(li);
		
		// 先找到所有的一级专业
		for(SpecialtyTree specialtyTree : listParamTree){
			if(specialtyTree.getiType() == 1 && specialtyTree.getiCategory() == 1){
				wenListParam.add(specialtyTree);
			}
			if(specialtyTree.getiType() == 2 && specialtyTree.getiCategory() == 1){
				liListParam.add(specialtyTree);
			}
			if(specialtyTree.getSchoolId() != null){
				specialtyTree.setChecked(true);
			}
		}
		
		// 为一级专业设置子专业，getChild是递归调用的
	    for (SpecialtyTree specialty : wenListParam) {
	    	specialty.setChildren(getChild(specialty.getId(), listParamTree));
	    }
	    for (SpecialtyTree specialty : liListParam) {
	    	specialty.setChildren(getChild(specialty.getId(), listParamTree));
	    }
		
		return specialtys;
	}
	
	/**
	 * @Title: getChild 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param id 当前专业id
	 * @param specialtys 一级专业
	 * @return
	 * @return List<SpecialtyTree> 要查找的列表
	 */
	private List<SpecialtyTree> getChild(Long id, List<SpecialtyTree> specialtys) {
	    //子专业
	    List<SpecialtyTree> childList = new ArrayList<SpecialtyTree>();
	    for (SpecialtyTree specialty : specialtys) {
	        // 遍历所有节点，将父专业id与传过来的id比较
	    	if (specialty.getPid().equals(id)) {
                childList.add(specialty);
            }
	    }
	    
	    // 把子专业的子专业再循环一遍
	    for (SpecialtyTree specialty : childList) {// 没有url子专业还有子专业
	    	 // 递归
	    	specialty.setChildren(this.getChild(specialty.getId(), specialtys));
	    } // 递归退出条件
	    if (childList.size() == 0) {
	        return null;
	    }
	    return childList;
	}
	
	/**
	 * @Title: specialtyChildren 
	 * @Description: TODO(查询专业子节点(到弟二层)) 
	 * @param specialtys
	 * @return void    返回类型
	 */
	public void specialtyChildren(List<SpecialtyTree> specialtys1) {
		for(SpecialtyTree entity : specialtys1){
			//专业第二层级
			List<SpecialtyTree> specialtys2 = specialtyMapper.listParamTree(new SpecialtyTree(entity.getiType(), 2, entity.getId()));
			entity.setChildren(specialtys2);
		}
	}
	
	
	
	/**
	 * @Title: selectSpectaltys 
	 * @Description: TODO(查询专业集) 
	 * @param specialty
	 * @return
	 * @return List<SpecialtyTree>    返回类型
	 */
	public List<SpecialtyTree> selectSpectaltys(Specialty specialty){
		//数据集
		List<SpecialtyTree> listParamTree = specialtyMapper.selectSpectaltys(specialty);
		// 先找到所有的一级专业
		List<SpecialtyTree> listParam = new ArrayList<SpecialtyTree>();
		for(SpecialtyTree specialtyTree : listParamTree){
			if(specialtyTree.getiType() != null && specialtyTree.getiType() == 1 
					&& specialtyTree.getiCategory() == 1){
				listParam.add(specialtyTree);
			}
		}
		// 为一级专业设置子专业，getChild是递归调用的
	    for (SpecialtyTree menu : listParam) {
	        menu.setChildren(getChild(menu.getId(), listParamTree));
	    }
	    return listParamTree;
	}
	
	
	
}
