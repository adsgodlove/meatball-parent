package com.meatball.exuanbao.personal.model;

import java.io.Serializable;

public class UserToken implements Serializable {

	private static final long serialVersionUID = 1L;
    private Integer id;

    private String token;

    private String scope;

    private Long expiresTime;

    private Long createTime;

    private String activekey;

    private String userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    public Long getExpiresTime() {
        return expiresTime;
    }

    public void setExpiresTime(Long expiresTime) {
        this.expiresTime = expiresTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getActivekey() {
        return activekey;
    }

    public void setActivekey(String activekey) {
        this.activekey = activekey == null ? null : activekey.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}