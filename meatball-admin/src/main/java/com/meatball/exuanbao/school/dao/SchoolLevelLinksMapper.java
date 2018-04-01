package com.meatball.exuanbao.school.dao;

import java.util.List;

import com.meatball.exuanbao.school.model.SchoolLevelLinks;
import com.meatball.parameter.model.SchoolLevel;

public interface SchoolLevelLinksMapper {
    int insert(SchoolLevelLinks record);

    int insertSelective(SchoolLevelLinks record);
    
    int deleteBySchoolid(Long bSchoolid);
    
    int deleteByiLevelid(Integer iLevelid);
    
    //查询全部
    List<SchoolLevel> selectBySchoolid(Long bSchoolid);
}