/**
 * Project Name:meatball-admin
 * File Name:PayServiceImpl.java
 * Package Name:com.meatball.exuanbao.pay.service.impl
 * Date:2018年3月28日上午10:14:21
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.pay.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.pay.dao.PaymentMapper;
import com.meatball.exuanbao.pay.model.Payment;
import com.meatball.exuanbao.pay.model.PaymentVO;
import com.meatball.exuanbao.pay.service.PayService;

/**   
 * @Title: PayServiceImpl.java 
 * @Package com.meatball.exuanbao.pay.service.impl 
 * @Description: TODO(支付) 
 * @author jw  
 * @date 2018年3月28日 上午10:14:21 
 * @version V1.0   
 */
@Service
public class PayServiceImpl implements PayService {

	@Resource
	private PaymentMapper paymentMapper;
	
	@Override
	public PageInfo<Payment> paymentList(PaymentVO entity) {
		PageInfo<Payment> listParams = PageHelper.startPage(entity.getOffset(), entity.getLimit()).doSelectPageInfo(() 
				-> paymentMapper.listParams(entity));
		return listParams;
	}

	@Override
	public Payment paymentInfo(Long bId) {
		 
		return paymentMapper.selectByPrimaryKey(bId);
	}

}
