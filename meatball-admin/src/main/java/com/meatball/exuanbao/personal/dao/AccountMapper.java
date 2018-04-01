package com.meatball.exuanbao.personal.dao;

import java.util.List;

import com.meatball.exuanbao.personal.model.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(Long bId);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Long bId);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    /**
     * @Title: selectInfoByPlatformId 
     * @Description: TODO(根据平台id查询用户) 
     * @param platformId
     * @return
     * @return Account    返回类型
     */
	Account selectInfoByPlatformId(String platformId);
	
	/**
	 * @Title: selectCountByMobile 
	 * @Description: TODO(根据手机号查询用户个数) 
	 * @param mobile
	 * @return
	 * @return int    返回类型
	 */
	int selectCountByMobile(String mobile);

	List<Account> listParams(Account entity);
}