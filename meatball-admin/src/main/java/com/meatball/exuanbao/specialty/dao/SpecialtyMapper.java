package com.meatball.exuanbao.specialty.dao;

import java.util.List;
import com.meatball.exuanbao.specialty.model.Specialty;
import com.meatball.exuanbao.specialty.model.SpecialtyTree;

/**
 * @Title: SpecialtyMapper.java 
 * @Package com.meatball.exuanbao.specialty.dao 
 * @Description: TODO(专业dao) 
 * @author jw  
 * @date 2018年3月18日 下午3:43:29 
 * @version V1.0
 */
public interface SpecialtyMapper {
    int deleteByPrimaryKey(Long bId);

    int insert(Specialty record);

    int insertSelective(Specialty record);

    Specialty selectByPrimaryKey(Long bId);

    int updateByPrimaryKeySelective(Specialty record);

    int updateByPrimaryKey(Specialty record);

    /**
     * @Title: selectSpecialtyTree 
     * @Description: TODO(查询专业树) 
     * @return
     * @return List<Specialty>    返回类型
     */
	List<Specialty> selectByPids(List<Specialty> list);
	
	List<Specialty> selectSpecialtyTree();
	
	//查询集合数据
	List<Specialty> listParams(Specialty record);
	
	//查询集合数据
	List<SpecialtyTree> listParamTreeBySchool(SpecialtyTree record);
		
	//查询集合数据
	List<SpecialtyTree> listParamTree(SpecialtyTree record);
	
	//查询专业
	List<SpecialtyTree> selectSpectaltys(Specialty record);
	
	
}