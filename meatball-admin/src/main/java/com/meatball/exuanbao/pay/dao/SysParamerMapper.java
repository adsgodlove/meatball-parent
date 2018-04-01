package com.meatball.exuanbao.pay.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.meatball.exuanbao.pay.model.SysParamer;

public interface SysParamerMapper {
    int deleteByPrimaryKey(Long bId);

    int insert(SysParamer record);

    int insertSelective(SysParamer record);

    SysParamer selectByPrimaryKey(Long bId);

    int updateByPrimaryKeySelective(SysParamer record);

    int updateByPrimaryKey(SysParamer record);

	List<SysParamer> listParams(SysParamer entity);

	/**
	 * @Title: selectInfoBy 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param vCode
	 * @param vType
	 * @return
	 * @return List<SysParamer>    返回类型
	 */
	List<SysParamer> selectInfoBy(@Param("vCode")String vCode, @Param("vType")String vType);

}