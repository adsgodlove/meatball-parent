/**
 * Project Name:meatball-admin
 * File Name:PayService.java
 * Package Name:com.meatball.exuanbao.pay.service
 * Date:2018年3月28日上午10:14:01
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.pay.service;

import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.pay.model.Payment;
import com.meatball.exuanbao.pay.model.PaymentVO;

/**   
 * @Title: PayService.java 
 * @Package com.meatball.exuanbao.pay.service 
 * @Description: TODO(支付接口) 
 * @author jw  
 * @date 2018年3月28日 上午10:14:01 
 * @version V1.0   
 */
public interface PayService {

	PageInfo<Payment> paymentList(PaymentVO entity);

	Payment paymentInfo(Long bId);

}
