package com.meatball.parameter.dao;

import java.util.List;
import com.meatball.parameter.model.SchoolType;

public interface SchoolTypeMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(SchoolType record);

    int insertSelective(SchoolType record);

    SchoolType selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(SchoolType record);

    int updateByPrimaryKey(SchoolType record);
    
    //查询全部
    List<SchoolType> selectAll();
}