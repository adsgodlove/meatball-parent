package com.meatball.exuanbao.pay.model;

import java.io.Serializable;
import java.util.Date;

import com.meatball.vo.Page;
/**
 * @Title: MobileMessage.java 
 * @Package com.meatball.exuanbao.pay.model 
 * @Description: TODO(短信) 
 * @author jw  
 * @date 2018年3月25日 上午11:48:51 
 * @version V1.0
 */
public class MobileMessage extends Page implements Serializable{
	private static final long serialVersionUID = 1L;
    private Long bId;

    private String vMobile;//手机号

    private Integer iVerifycode;//验证码

    private Date tCreatetime;//发送时间

    private String vContent;//短信内容

    private Integer iCount;//发送次数

    private Integer iStatus;//状态1成功 0失败

    public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }

    public String getvMobile() {
        return vMobile;
    }

    public void setvMobile(String vMobile) {
        this.vMobile = vMobile == null ? null : vMobile.trim();
    }

    public Integer getiVerifycode() {
        return iVerifycode;
    }

    public void setiVerifycode(Integer iVerifycode) {
        this.iVerifycode = iVerifycode;
    }

    public Date gettCreatetime() {
        return tCreatetime;
    }

    public void settCreatetime(Date tCreatetime) {
        this.tCreatetime = tCreatetime;
    }

    public String getvContent() {
        return vContent;
    }

    public void setvContent(String vContent) {
        this.vContent = vContent == null ? null : vContent.trim();
    }

    public Integer getiCount() {
        return iCount;
    }

    public void setiCount(Integer iCount) {
        this.iCount = iCount;
    }

    public Integer getiStatus() {
        return iStatus;
    }

    public void setiStatus(Integer iStatus) {
        this.iStatus = iStatus;
    }
}