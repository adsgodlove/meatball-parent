package com.meatball.exuanbao.school.dao;

import java.util.List;
import com.meatball.exuanbao.school.model.School;

public interface SchoolMapper {
    int deleteByPrimaryKey(Long bId);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(Long bId);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKeyWithBLOBs(School record);

    int updateByPrimaryKey(School record);
    
    //查询集合数据
    List<School> listParams(School record);
}