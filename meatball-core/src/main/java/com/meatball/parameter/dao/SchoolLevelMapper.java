package com.meatball.parameter.dao;

import java.util.List;
import com.meatball.parameter.model.SchoolLevel;

public interface SchoolLevelMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(SchoolLevel record);

    int insertSelective(SchoolLevel record);

    SchoolLevel selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(SchoolLevel record);

    int updateByPrimaryKey(SchoolLevel record);
    
    //查询全部
    List<SchoolLevel> selectAll();
    
    //查询全部
    List<SchoolLevel> selectIn(List<Integer> list);
}