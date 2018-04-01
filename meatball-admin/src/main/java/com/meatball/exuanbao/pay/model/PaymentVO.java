/**
 * Project Name:meatball-admin
 * File Name:PaymentVO.java
 * Package Name:com.meatball.exuanbao.pay.model
 * Date:2018年3月28日上午11:01:23
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.pay.model;

import java.math.BigDecimal;
import java.util.Date;

import com.meatball.vo.Page;

/**   
 * @Title: PaymentVO.java 
 * @Package com.meatball.exuanbao.pay.model 
 * @Description: TODO(订单查询vo) 
 * @author jw  
 * @date 2018年3月28日 上午11:01:23 
 * @version V1.0   
 */
public class PaymentVO extends Page {
	
	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = 1L;

	private Long bId;

    private Long bUserid;//用户id

    private Integer iType;//支付类型  1 规划师 2 高级规划师 3 教育专家

    private String vUsername;//用户姓名

    private String vPaytype;//支付平台  wx微信 zfb支付宝

    private String vDealid;//支付平台交易流水号

    private BigDecimal dMoney; //支付金额

    private String vTel;//用户电话

    private Date sTime;//开始时间
    
    private Date eTime;//结束时间

    private Integer iStatus;//支付状态 0失败 1成功 9未支付

    private String remark;//备注

    public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }

    public Long getbUserid() {
        return bUserid;
    }

    public void setbUserid(Long bUserid) {
        this.bUserid = bUserid;
    }

    public Integer getiType() {
        return iType;
    }

    public void setiType(Integer iType) {
        this.iType = iType;
    }

    public String getvUsername() {
        return vUsername;
    }

    public void setvUsername(String vUsername) {
        this.vUsername = vUsername == null ? null : vUsername.trim();
    }

    public String getvPaytype() {
        return vPaytype;
    }

    public void setvPaytype(String vPaytype) {
        this.vPaytype = vPaytype == null ? null : vPaytype.trim();
    }

    public String getvDealid() {
        return vDealid;
    }

    public void setvDealid(String vDealid) {
        this.vDealid = vDealid == null ? null : vDealid.trim();
    }

    public BigDecimal getdMoney() {
        return dMoney;
    }

    public void setdMoney(BigDecimal dMoney) {
        this.dMoney = dMoney;
    }

    public String getvTel() {
        return vTel;
    }

    public void setvTel(String vTel) {
        this.vTel = vTel == null ? null : vTel.trim();
    }


    public Date getsTime() {
		return sTime;
	}

	public void setsTime(Date sTime) {
		this.sTime = sTime;
	}

	public Date geteTime() {
		return eTime;
	}

	public void seteTime(Date eTime) {
		this.eTime = eTime;
	}

	public Integer getiStatus() {
        return iStatus;
    }

    public void setiStatus(Integer iStatus) {
        this.iStatus = iStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
	

}
