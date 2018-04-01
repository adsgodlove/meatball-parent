package com.meatball.exuanbao.pay.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.meatball.vo.Page;
/**
 * @Title: Payment.java 
 * @Package com.meatball.exuanbao.pay.model 
 * @Description: TODO(支付记录) 
 * @author jw  
 * @date 2018年3月25日 上午11:45:01 
 * @version V1.0
 */
public class Payment extends Page implements Serializable{
	private static final long serialVersionUID = 1L;
    private Long bId;

    private Long bUserid;//用户id

    private Integer iType;//支付类型  11 智能填报(规划师) 12 智能填报(高级规划师) 13 智能填报(教育专家)

    private String vUsername;//用户姓名

    private String vPaytype;//支付平台  wx微信 zfb支付宝

    private String vDealid;//支付平台交易流水号

    private BigDecimal dMoney; //支付金额

    private String vTel;//用户电话

    private Date tTime;//订单时间

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

    public Date gettTime() {
        return tTime;
    }

    public void settTime(Date tTime) {
        this.tTime = tTime;
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