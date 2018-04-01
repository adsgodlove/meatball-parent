package com.meatball.exuanbao.note.dao;

import com.meatball.exuanbao.note.model.Feedback;

public interface FeedbackMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    Feedback selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);
}