package com.meatball.parameter.dao;

import java.util.List;
import com.meatball.parameter.model.SchoolBatch;

public interface SchoolBatchMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(SchoolBatch record);

    int insertSelective(SchoolBatch record);

    SchoolBatch selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(SchoolBatch record);

    int updateByPrimaryKey(SchoolBatch record);
    
    //查询全部
    List<SchoolBatch> selectAll();
}