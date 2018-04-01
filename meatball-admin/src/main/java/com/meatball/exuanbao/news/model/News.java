package com.meatball.exuanbao.news.model;

import java.io.Serializable;
import java.util.Date;
import com.meatball.vo.Page;

/**
 * @Title: News.java 
 * @Package com.meatball.exuanbao.news.model 
 * @Description: TODO(新闻) 
 * @author zk  
 * @date 2018年3月30日 下午3:52:13 
 * @version V1.0
 */
public class News extends Page implements Serializable{
	private static final long serialVersionUID = 1L;
	//id
    private Long bId;
    //标题
    private String vTitle;
    //类型
    private Integer iType;
    //级别
    private Integer iLeve;
    //使用地方（0 全部,1 pc, 2 app, 3 公众号，4 小程序）
    private Integer iLocal;
    //展示图片
    private String pUrl;
    //浏览量
    private Integer iScan;
    //展示时间
    private Date tShowTime;
    //更新时间
    private Date tUpdateTime;
    //更新人
    private Long iUserId;
    //状态 0 无效  1有效
    private Integer iStatus;
    //摘要
    private String vSummary;
    //内容
    private String vContent;

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

    public Integer getiType() {
        return iType;
    }

    public void setiType(Integer iType) {
        this.iType = iType;
    }

    public Integer getiLeve() {
        return iLeve;
    }

    public void setiLeve(Integer iLeve) {
        this.iLeve = iLeve;
    }

    public Integer getiLocal() {
        return iLocal;
    }

    public void setiLocal(Integer iLocal) {
        this.iLocal = iLocal;
    }

    public String getpUrl() {
        return pUrl;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl == null ? null : pUrl.trim();
    }

    public Integer getiScan() {
        return iScan;
    }

    public void setiScan(Integer iScan) {
        this.iScan = iScan;
    }

    public Date gettShowTime() {
        return tShowTime;
    }

    public void settShowTime(Date tShowTime) {
        this.tShowTime = tShowTime;
    }

    public Date gettUpdateTime() {
        return tUpdateTime;
    }

    public void settUpdateTime(Date tUpdateTime) {
        this.tUpdateTime = tUpdateTime;
    }

    public Long getiUserId() {
        return iUserId;
    }

    public void setiUserId(Long iUserId) {
        this.iUserId = iUserId;
    }

    public Integer getiStatus() {
        return iStatus;
    }

    public void setiStatus(Integer iStatus) {
        this.iStatus = iStatus;
    }
    
    public String getvSummary() {
        return vSummary;
    }

    public void setvSummary(String vSummary) {
        this.vSummary = vSummary == null ? null : vSummary.trim();
    }

    public String getvContent() {
        return vContent;
    }

    public void setvContent(String vContent) {
        this.vContent = vContent == null ? null : vContent.trim();
    }
}