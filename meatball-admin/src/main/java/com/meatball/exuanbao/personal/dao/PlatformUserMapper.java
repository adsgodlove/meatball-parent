package com.meatball.exuanbao.personal.dao;

import com.meatball.exuanbao.personal.model.PlatformUser;

public interface PlatformUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(PlatformUser record);

    int insertSelective(PlatformUser record);

    PlatformUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PlatformUser record);

    int updateByPrimaryKey(PlatformUser record);
}