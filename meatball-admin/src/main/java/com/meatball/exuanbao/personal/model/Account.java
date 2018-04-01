package com.meatball.exuanbao.personal.model;

import java.io.Serializable;
import java.util.Date;

import com.meatball.vo.Page;
/**
 * @Title: Account.java 
 * @Package com.meatball.exuanbao.personal.model 
 * @Description: TODO(用户model) 
 * @author jw  
 * @date 2018年3月25日 下午2:31:30 
 * @version V1.0
 */
public class Account extends Page implements Serializable {
	
	private static final long serialVersionUID = 1L;
    private Long bId;

    private String account;//账号

    private String password;//密码

    private String name;//名称

    private String nickname;//昵称

    private String avatar;//头像

    private String sex;//性别

    private Date birthday;//出生年月

    private String telephone;//固定电话

    private String phone;//手机号

    private String email;//邮箱
    
    private Integer provincecode;//省份编码

    private String provincename;//省份名称

    private Integer citycode;//地区编码

    private String cityname;//地区名称

    private String address;//详细地址

    private String platformid;//平台id

    private Integer status;//状态 1 有效  0无效

    private Integer verifycode;//验证码（短信）

    private String grade;//年级

    private String vType;//文/理科

    private Date registeredtime;//注册时间

    private Date updatetime;//更新时间

    public Integer getProvincecode() {
		return provincecode;
	}

	public void setProvincecode(Integer provincecode) {
		this.provincecode = provincecode;
	}

	public String getProvincename() {
		return provincename;
	}

	public void setProvincename(String provincename) {
		this.provincename = provincename;
	}

	public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getCitycode() {
        return citycode;
    }

    public void setCitycode(Integer citycode) {
        this.citycode = citycode;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPlatformid() {
        return platformid;
    }

    public void setPlatformid(String platformid) {
        this.platformid = platformid == null ? null : platformid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVerifycode() {
        return verifycode;
    }

    public void setVerifycode(Integer verifycode) {
        this.verifycode = verifycode;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getvType() {
        return vType;
    }

    public void setvType(String vType) {
        this.vType = vType == null ? null : vType.trim();
    }

    public Date getRegisteredtime() {
        return registeredtime;
    }

    public void setRegisteredtime(Date registeredtime) {
        this.registeredtime = registeredtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}