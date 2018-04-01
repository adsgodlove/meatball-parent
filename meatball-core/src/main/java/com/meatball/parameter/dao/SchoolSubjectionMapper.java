package com.meatball.parameter.dao;

import java.util.List;
import com.meatball.parameter.model.SchoolSubjection;

public interface SchoolSubjectionMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(SchoolSubjection record);

    int insertSelective(SchoolSubjection record);

    SchoolSubjection selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(SchoolSubjection record);

    int updateByPrimaryKey(SchoolSubjection record);
    
    //通过父级编码查询学校地方所属
    List<SchoolSubjection> selectByPid(Integer iPid);
    
    //通过类型查询学校地方所属
    List<SchoolSubjection> selectByType(Integer iType);
}