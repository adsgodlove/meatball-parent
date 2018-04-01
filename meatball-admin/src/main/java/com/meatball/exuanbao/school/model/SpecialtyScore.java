package com.meatball.exuanbao.school.model;

import java.io.Serializable;

import com.meatball.vo.Page;

/**
 * @Title: SpecialtyScore.java 
 * @Package com.meatball.school.model 
 * @Description: TODO(专业分数表) 
 * @author zk  
 * @date 2018年3月15日 下午4:18:37 
 * @version V1.0
 */
public class SpecialtyScore extends Page implements Serializable{
	private static final long serialVersionUID = 1L;
	//id
	private Long bId;
	//学校id
    private Long bSchoolid;
	//学校名称
    private String vSchoolname;
	//专业id
    private Long bSpecialtyid;
	//专业名称
    private String vSpecialtyname;
	//年份
    private Integer dYear;
	//录取批次id
    private Integer iBatchid;
	//录取批次名称
    private String vBatchname;
	//高校地区id
    private Integer iRegionid;
	//高校地区名称
    private String vPlacename;
	//最高分
    private Integer iHigh;
	//平均分
    private Integer iAvg;
	//最低分
    private Integer iMinimum;
	//最低位此
    private Integer iLsd;
	//最高位
    private Integer iTopdigit;
	//招生人数
    private Double iPeople;
    //分数线类型(1 院校分数线、2专业分数线)
    private Integer iType;
    //文理科（1文科，理科）
    private String iSubject;

    public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }

    public Long getbSchoolid() {
        return bSchoolid;
    }

    public void setbSchoolid(Long bSchoolid) {
        this.bSchoolid = bSchoolid;
    }

    public String getvSchoolname() {
        return vSchoolname;
    }

    public void setvSchoolname(String vSchoolname) {
        this.vSchoolname = vSchoolname == null ? null : vSchoolname.trim();
    }

    public Long getbSpecialtyid() {
        return bSpecialtyid;
    }

    public void setbSpecialtyid(Long bSpecialtyid) {
        this.bSpecialtyid = bSpecialtyid;
    }

    public String getvSpecialtyname() {
        return vSpecialtyname;
    }

    public void setvSpecialtyname(String vSpecialtyname) {
        this.vSpecialtyname = vSpecialtyname == null ? null : vSpecialtyname.trim();
    }

    public Integer getdYear() {
        return dYear;
    }

    public void setdYear(Integer dYear) {
        this.dYear = dYear;
    }

    public Integer getiBatchid() {
        return iBatchid;
    }

    public void setiBatchid(Integer iBatchid) {
        this.iBatchid = iBatchid;
    }

    public String getvBatchname() {
        return vBatchname;
    }

    public void setvBatchname(String vBatchname) {
        this.vBatchname = vBatchname == null ? null : vBatchname.trim();
    }

    public Integer getiRegionid() {
        return iRegionid;
    }

    public void setiRegionid(Integer iRegionid) {
        this.iRegionid = iRegionid;
    }

    public String getvPlacename() {
        return vPlacename;
    }

    public void setvPlacename(String vPlacename) {
        this.vPlacename = vPlacename == null ? null : vPlacename.trim();
    }

    public Integer getiHigh() {
        return iHigh;
    }

    public void setiHigh(Integer iHigh) {
        this.iHigh = iHigh;
    }

    public Integer getiAvg() {
        return iAvg;
    }

    public void setiAvg(Integer iAvg) {
        this.iAvg = iAvg;
    }

    public Integer getiMinimum() {
        return iMinimum;
    }

    public void setiMinimum(Integer iMinimum) {
        this.iMinimum = iMinimum;
    }

    public Integer getiLsd() {
        return iLsd;
    }

    public void setiLsd(Integer iLsd) {
        this.iLsd = iLsd;
    }

    public Integer getiTopdigit() {
        return iTopdigit;
    }

    public void setiTopdigit(Integer iTopdigit) {
        this.iTopdigit = iTopdigit;
    }

    public Double getiPeople() {
        return iPeople;
    }

    public void setiPeople(Double iPeople) {
        this.iPeople = iPeople;
    }

	public Integer getiType() {
		return iType;
	}

	public void setiType(Integer iType) {
		this.iType = iType;
	}

	public String getiSubject() {
		return iSubject;
	}

	public void setiSubject(String iSubject) {
		this.iSubject = iSubject;
	}
    
}