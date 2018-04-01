package com.meatball.exuanbao.pay.dao;

import org.apache.ibatis.annotations.Param;

import com.meatball.exuanbao.pay.model.MobileMessage;

public interface MobileMessageMapper {
    int deleteByPrimaryKey(Long bId);

    int insert(MobileMessage record);

    int insertSelective(MobileMessage record);

    MobileMessage selectByPrimaryKey(Long bId);

    int updateByPrimaryKeySelective(MobileMessage record);

    int updateByPrimaryKey(MobileMessage record);
    
    MobileMessage selectInfoByMobileCode(@Param("mobile")String mobile,@Param("code")String code);
    
}