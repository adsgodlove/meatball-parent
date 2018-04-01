package com.meatball.exuanbao.note.model;

import java.io.Serializable;
import java.util.Date;

import com.meatball.vo.Page;
/**
 * @Title: Note.java 
 * @Package com.meatball.exuanbao.note.model 
 * @Description: TODO(通知model) 
 * @author jw  
 * @date 2018年3月30日 上午9:34:39 
 * @version V1.0
 */
public class Note extends Page implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    private Long bId;

    private String vTitle;//标题

    private String vContent;//内容

    private Date tSendtime;//发送时间

    private Date tCreatetime;//创建时间

    private Integer iStatus;//状态 0 无效  1有效

    private Integer iType;//通知类型  1消息 2 公告

    public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }

    public String getvTitle() {
        return vTitle;
    }

    public void setvTitle(String vTitle) {
        this.vTitle = vTitle == null ? null : vTitle.trim();
    }

    public String getvContent() {
        return vContent;
    }

    public void setvContent(String vContent) {
        this.vContent = vContent == null ? null : vContent.trim();
    }

    public Date gettSendtime() {
        return tSendtime;
    }

    public void settSendtime(Date tSendtime) {
        this.tSendtime = tSendtime;
    }

    public Date gettCreatetime() {
        return tCreatetime;
    }

    public void settCreatetime(Date tCreatetime) {
        this.tCreatetime = tCreatetime;
    }

    public Integer getiStatus() {
        return iStatus;
    }

    public void setiStatus(Integer iStatus) {
        this.iStatus = iStatus;
    }

    public Integer getiType() {
        return iType;
    }

    public void setiType(Integer iType) {
        this.iType = iType;
    }
}