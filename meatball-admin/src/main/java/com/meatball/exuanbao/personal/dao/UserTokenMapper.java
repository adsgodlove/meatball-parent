package com.meatball.exuanbao.personal.dao;

import com.meatball.exuanbao.personal.model.UserToken;

public interface UserTokenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserToken record);

    int insertSelective(UserToken record);

    UserToken selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserToken record);

    int updateByPrimaryKey(UserToken record);
    /**
     * @Title: getUserTokenByUserId 
     * @Description: TODO(根据用户id获取对应的usertoken) 
     * @param @param id
     * @param @return    设定文件 
     * @return UserToken    返回类型 
     * @throws
      */
 	UserToken getUserTokenByUserId(String id);
}