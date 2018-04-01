package com.meatball.exuanbao.pay.dao;

import java.util.List;

import com.meatball.exuanbao.pay.model.Payment;
import com.meatball.exuanbao.pay.model.PaymentVO;

public interface PaymentMapper {
    int deleteByPrimaryKey(Long bId);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Long bId);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);

    /**
     * @Title: selectOrderList 
     * @Description: TODO(查询用户订单列表) 
     * @param userid
     * @return
     * @return List<Payment>    返回类型
     */
	List<Payment> selectOrderList(String userid);
	/**
	 * @Title: listParams 
	 * @Description: TODO(查询订单列表) 
	 * @param entity
	 * @return
	 * @return List<Payment>    返回类型
	 */
	List<Payment> listParams(PaymentVO entity);
	
	/**
	 * @Title: selectOrderOKList 
	 * @Description: TODO(查询已支付的订单列表) 
	 * @param userid
	 * @return
	 * @return List<Payment>    返回类型
	 */
	List<Payment> selectOrderOKList(String userid);

}