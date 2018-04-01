package com.meatball.parameter.dao;

import java.util.List;

import com.meatball.parameter.model.Area;
import com.meatball.parameter.model.Region;

public interface RegionMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(Region record);

    int insertSelective(Region record);

    Region selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKey(Region record);
    
    //通过父级编码查询行政单位
    List<Region> selectByPcode(Integer iPcode);
    
    //通过父级编码查询行政单位
    List<Region> selectByType(Integer iType);
    
    //查询行政区域
    List<Region> listParams(Region record);
    
    //查询行政区域
    List<Area> listParamsArea(Area record);
}