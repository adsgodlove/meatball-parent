package com.meatball.exuanbao.personal.model;

import java.io.Serializable;
import java.util.Date;

public class PlatformUser implements Serializable {

	private static final long serialVersionUID = 1L;
    private String id;

    private String realName;

    private String idCard;

    private String nick;

    private String head;

    private Integer sex;

    private String sexName;

    private Date birthday;

    private String bindType;

    private Integer qqNumber;

    private String signature;

    private Integer age;

    private Integer mobile;

    private String password;

    private String username;

    private Date createTime;

    private Date loginEndDate;

    private Date updateTime;

    private String userAccessToken;

    private String activeKey;

    private String unionid;

    private String opendid;

    private Integer registeFlag;

    private Integer tokenid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName == null ? null : sexName.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBindType() {
        return bindType;
    }

    public void setBindType(String bindType) {
        this.bindType = bindType == null ? null : bindType.trim();
    }

    public Integer getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(Integer qqNumber) {
        this.qqNumber = qqNumber;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLoginEndDate() {
        return loginEndDate;
    }

    public void setLoginEndDate(Date loginEndDate) {
        this.loginEndDate = loginEndDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserAccessToken() {
        return userAccessToken;
    }

    public void setUserAccessToken(String userAccessToken) {
        this.userAccessToken = userAccessToken == null ? null : userAccessToken.trim();
    }

    public String getActiveKey() {
        return activeKey;
    }

    public void setActiveKey(String activeKey) {
        this.activeKey = activeKey == null ? null : activeKey.trim();
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    public String getOpendid() {
        return opendid;
    }

    public void setOpendid(String opendid) {
        this.opendid = opendid == null ? null : opendid.trim();
    }

    public Integer getRegisteFlag() {
        return registeFlag;
    }

    public void setRegisteFlag(Integer registeFlag) {
        this.registeFlag = registeFlag;
    }

    public Integer getTokenid() {
        return tokenid;
    }

    public void setTokenid(Integer tokenid) {
        this.tokenid = tokenid;
    }
}