/**
 * Project Name:meatball-rest
 * File Name:IntelligentizeApiService.java
 * Package Name:com.meatball.api.intelligentize.service
 * Date:2018年3月28日下午4:46:35
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.intelligentize.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.meatball.api.intelligentize.params.IntelligentizeParams;
import com.meatball.exuanbao.personal.dao.AccountMapper;
import com.meatball.exuanbao.personal.model.Account;
import com.meatball.exuanbao.school.dao.SpecialtyScoreMapper;
import com.meatball.exuanbao.school.model.SpecialtyScore;
import com.meatball.vo.ResultMsg;

/**   
 * @Title: IntelligentizeApiService.java 
 * @Package com.meatball.api.intelligentize.service 
 * @Description: TODO(智能填报) 
 * @author 張翔宇  
 * @date 2018年3月28日 下午4:46:35 
 * @version V1.0   
 */
@Service
public class IntelligentizeApiService {
	@Resource
	private AccountMapper accountMapper;
	@Resource
	private SpecialtyScoreMapper specialtyScoreMapper;
	/**
	 * @Title: getVolunteerList 
	 * @Description: TODO(查询出所有大学批次排序) 
	 * @param record
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg getVolunteerList(IntelligentizeParams record) {
		Account account = accountMapper.selectByPrimaryKey(record.getUserId());
		List<SpecialtyScore> list = new ArrayList<SpecialtyScore>();
		switch (account.getProvincecode().intValue()) {
		// 四川
		case 510000:
			list = this.getSichuanVoluntary(record);
			break;
		default:
			break;
		}
		return new ResultMsg(200, list);
	}
	
	/**
	 * @Title: getSichuanVoluntary 
	 * @Description: TODO(四川志愿) 
	 * @param vType
	 * @return void    返回类型
	 */
	private List<SpecialtyScore> getSichuanVoluntary(IntelligentizeParams record) {
		// 参数
		Map<String, Object> params = new HashMap<String, Object>();
		// 专业
		params.put("specialties", record.getProfession().split(","));
		// 地区
		params.put("district", record.getDistrict().split(","));
		// 分数
		params.put("score", record.getScore());
		List<SpecialtyScore> list = specialtyScoreMapper.selectByVoluntary(params);
		return list;
	}
}
