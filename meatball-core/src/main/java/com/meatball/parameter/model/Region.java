package com.meatball.parameter.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Title: Region.java 
 * @Package com.meatball.parameter.model 
 * @Description: TODO(行政区域) 
 * @author zk  
 * @date 2018年3月15日 下午4:40:04 
 * @version V1.0
 */
public class Region implements Serializable{
	private static final long serialVersionUID = 1L;
	//id
	private Integer iId;
	//编码
    private Integer iCode;
	//名称
    private String vName;
	//父编码
    private Integer iPcode;
	//父名称
    private String vPname;
	//父级编码
    private String vFcode;
	//父级名称
    private String vFname;
	//类型(1省2市3县)
    private Integer iType;
	//区号
    private Integer iArea;
	//邮编
    private Integer iZip;
    //子节点
    private List<Region> children;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Integer getiCode() {
        return iCode;
    }

    public void setiCode(Integer iCode) {
        this.iCode = iCode;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName == null ? null : vName.trim();
    }

    public Integer getiPcode() {
        return iPcode;
    }

    public void setiPcode(Integer iPcode) {
        this.iPcode = iPcode;
    }

    public String getvPname() {
        return vPname;
    }

    public void setvPname(String vPname) {
        this.vPname = vPname == null ? null : vPname.trim();
    }

    public String getvFcode() {
        return vFcode;
    }

    public void setvFcode(String vFcode) {
        this.vFcode = vFcode == null ? null : vFcode.trim();
    }

    public String getvFname() {
        return vFname;
    }

    public void setvFname(String vFname) {
        this.vFname = vFname == null ? null : vFname.trim();
    }

    public Integer getiType() {
        return iType;
    }

    public void setiType(Integer iType) {
        this.iType = iType;
    }

    public Integer getiArea() {
        return iArea;
    }

    public void setiArea(Integer iArea) {
        this.iArea = iArea;
    }

    public Integer getiZip() {
        return iZip;
    }

    public void setiZip(Integer iZip) {
        this.iZip = iZip;
    }

	public List<Region> getChildren() {
		return children;
	}

	public void setChildren(List<Region> children) {
		this.children = children;
	}
    
}