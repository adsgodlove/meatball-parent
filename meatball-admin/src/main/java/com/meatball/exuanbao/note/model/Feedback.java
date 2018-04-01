package com.meatball.exuanbao.note.model;

import java.io.Serializable;
import java.util.Date;

import com.meatball.vo.Page;
/**
 * @Title: Feedback.java 
 * @Package com.meatball.exuanbao.note.model 
 * @Description: TODO(反馈意见model) 
 * @author jw  
 * @date 2018年3月30日 下午4:00:49 
 * @version V1.0
 */
public class Feedback extends Page implements Serializable {
	
	private static final long serialVersionUID = 1L;
    private Long id;

    private Long userId;//用户id

    private String userName;//用户名称

    private String userTel;//用户手机号码

    private String platformId;//平台用户id

    private String content;//反馈内容

    private Date createdate;//反馈时间

    private Integer state;//状态 1有效 0无效

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId == null ? null : platformId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}