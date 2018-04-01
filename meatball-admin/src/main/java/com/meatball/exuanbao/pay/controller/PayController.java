/**
 * Project Name:meatball-admin
 * File Name:PayController.java
 * Package Name:com.meatball.exuanbao.pay.controller
 * Date:2018年3月25日上午11:26:01
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.pay.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.pay.model.Payment;
import com.meatball.exuanbao.pay.model.PaymentVO;
import com.meatball.exuanbao.pay.service.PayService;

/**   
 * @Title: PayController.java 
 * @Package com.meatball.exuanbao.pay.controller 
 * @Description: TODO(支付类) 
 * @author jw  
 * @date 2018年3月25日 上午11:26:01 
 * @version V1.0   
 */
@Controller
@RequestMapping("/exuanbao/pay")
public class PayController {
	
	@Resource
	private PayService payService;
	
	@GetMapping("/index")
	@RequiresPermissions("exuanbao:pay:index")
	public String index(ModelMap map) {
		
		return "exuanbao/pay/order";
	}
	
	@GetMapping("/listParams")
	@ResponseBody
	@RequiresPermissions("exuanbao:pay:index")
	public PageInfo<Payment> listParams(PaymentVO entity) {
		
		return payService.paymentList(entity);
	}
	
	
	@GetMapping("/info")
	@ResponseBody
	@RequiresPermissions("exuanbao:pay:info")
	public Payment info(Long bId) {
		return payService.paymentInfo(bId);
	}
	
	@InitBinder   
    public void initBinder(WebDataBinder binder) {   
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");   
        dateFormat.setLenient(true);   
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));   
    } 
}
