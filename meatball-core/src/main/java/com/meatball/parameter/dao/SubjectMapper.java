package com.meatball.parameter.dao;

import java.util.List;
import com.meatball.parameter.model.Subject;

public interface SubjectMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
    
    //查询全部
    List<Subject> selectAll();
}