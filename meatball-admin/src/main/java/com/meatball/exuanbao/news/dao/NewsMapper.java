package com.meatball.exuanbao.news.dao;

import java.util.List;
import com.meatball.exuanbao.news.model.News;

public interface NewsMapper {
    int deleteByPrimaryKey(Long bId);

    int insert(News record);
    
    int insertSelective(News record);

    News selectByPrimaryKey(Long bId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
    
    List<News> listParams(News record);
}