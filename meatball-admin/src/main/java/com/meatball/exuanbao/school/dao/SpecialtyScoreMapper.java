package com.meatball.exuanbao.school.dao;

import java.util.List;
import java.util.Map;

import com.meatball.exuanbao.school.model.SpecialtyScore;

public interface SpecialtyScoreMapper {
    int deleteByPrimaryKey(Long bId);

    int insert(SpecialtyScore record);

    int insertSelective(SpecialtyScore record);

    SpecialtyScore selectByPrimaryKey(Long bId);

    int updateByPrimaryKeySelective(SpecialtyScore record);

    int updateByPrimaryKey(SpecialtyScore record);
    
    //查询集合数据
    List<SpecialtyScore> listParams(SpecialtyScore record);
    
    //查询年份
    List<Integer> groupByYear();
    
    /**
     * @Title: selectByVoluntary 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @return List<SpecialtyScore>    返回类型
     */
    List<SpecialtyScore> selectByVoluntary(Map<String, Object> record);
}