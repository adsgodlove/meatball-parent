package com.meatball.exuanbao.pay.model;

import java.io.Serializable;

import com.meatball.vo.Page;
/**
 * @Title: SysParamer.java 
 * @Package com.meatball.exuanbao.pay.model 
 * @Description: TODO(码表) 
 * @author jw  
 * @date 2018年3月25日 上午11:52:58 
 * @version V1.0
 */
public class SysParamer extends Page implements Serializable{
	private static final long serialVersionUID = 1L;
    private Long bId;

    private String vCode;//编号

    private String vType;//类型

    private String vName;//名称

    private String vValue;//值

    private Integer iSort;//排序号

    private Long vPid;//父级id

    private Integer iStatus;//状态 1 有效 0无效

    public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }

    public String getvCode() {
        return vCode;
    }

    public void setvCode(String vCode) {
        this.vCode = vCode == null ? null : vCode.trim();
    }

    public String getvType() {
        return vType;
    }

    public void setvType(String vType) {
        this.vType = vType == null ? null : vType.trim();
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName == null ? null : vName.trim();
    }

    public String getvValue() {
        return vValue;
    }

    public void setvValue(String vValue) {
        this.vValue = vValue == null ? null : vValue.trim();
    }

    public Integer getiSort() {
        return iSort;
    }

    public void setiSort(Integer iSort) {
        this.iSort = iSort;
    }

    public Long getvPid() {
        return vPid;
    }

    public void setvPid(Long vPid) {
        this.vPid = vPid;
    }

    public Integer getiStatus() {
        return iStatus;
    }

    public void setiStatus(Integer iStatus) {
        this.iStatus = iStatus;
    }
}