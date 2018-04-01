package com.meatball.file.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: Papers.java 
 * @Package com.meatball.api.file.model 
 * @Description: TODO(附件) 
 * @author zk  
 * @date 2018年3月22日 上午11:16:58 
 * @version V1.0
 */
public class File implements Serializable{
	private static final long serialVersionUID = 1L;
	//id
	private Long bId;
	//关联id
    private Long bFid;
	//文件名称
    private String vFilename;
	//文件url地址
    private String vFileurl;
	//文件格式
    private String vFileformat;
	//文件类型
    private Integer vFiletype;
	//文件描述
    private String title;
	//顺序
    private Integer serial;
	//状态
    private Integer iStatus;
	//更新时间
    private Date tCreatetime = new Date();
	//备注
    private String remark;

    public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }

    public Long getbFid() {
        return bFid;
    }

    public void setbFid(Long bFid) {
        this.bFid = bFid;
    }

    public String getvFilename() {
        return vFilename;
    }

    public void setvFilename(String vFilename) {
        this.vFilename = vFilename == null ? null : vFilename.trim();
    }

    public String getvFileurl() {
        return vFileurl;
    }

    public void setvFileurl(String vFileurl) {
        this.vFileurl = vFileurl == null ? null : vFileurl.trim();
    }

    public String getvFileformat() {
        return vFileformat;
    }

    public void setvFileformat(String vFileformat) {
        this.vFileformat = vFileformat == null ? null : vFileformat.trim();
    }

    public Integer getvFiletype() {
        return vFiletype;
    }

    public void setvFiletype(Integer vFiletype) {
        this.vFiletype = vFiletype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public Integer getiStatus() {
        return iStatus;
    }

    public void setiStatus(Integer iStatus) {
        this.iStatus = iStatus;
    }

    public Date gettCreatetime() {
        return tCreatetime;
    }

    public void settCreatetime(Date tCreatetime) {
        this.tCreatetime = tCreatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}