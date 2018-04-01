/**
 * Project Name:meatball-admin
 * File Name:SpecialtyTree.java
 * Package Name:com.meatball.exuanbao.specialty.model
 * Date:2018年3月21日上午10:31:18
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.specialty.model;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

/**   
 * @Title: SpecialtyTree.java 
 * @Package com.meatball.exuanbao.specialty.model 
 * @Description: TODO(zk) 
 * @author zk  
 * @date 2018年3月21日 上午10:31:18 
 * @version V1.0   
 */
public class SpecialtyTree implements Serializable{

	private static final long serialVersionUID = 1L;
	// 主键
	@ApiModelProperty(value="id", example="1")
	private Long id;
	// 父ID
	@ApiModelProperty(value="父ID", example="0")
    private Long pid;
    // 名称
	@ApiModelProperty(value="名称", example="种子科学与工程")
    private String name;
	//代码
	@ApiModelProperty(value="代码", example="090107")
    private String vCode;
	//学科类型(1文,2理)
	@ApiModelProperty(value="学科类型(1文,2理)", example="1")
    private Integer iType;
	//类别
	@ApiModelProperty(value="类别（1,2,3）", example="1")
    private Integer iCategory;
    // 学校
	@ApiModelProperty(value="学校id", example="124")
    private Long schoolId ;
    //vo 是否选中
	@ApiModelProperty(value="是否选中(true 选中，false 不选中)", example="fasle")
    private Boolean checked = Boolean.FALSE;
    // 子菜单
	@ApiModelProperty(value="id", example="1001")
    private List<SpecialtyTree> children;
    
    public SpecialtyTree(){}
    
    public SpecialtyTree(Long id, String name, Integer iType, Long pid, Integer iCategory) {
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.iType = iType;
		this.iCategory = iCategory;
	}
    
	public SpecialtyTree(Long pid, Integer iType, Integer iCategory, Long schoolId) {
		super();
		this.pid = pid;
		this.iType = iType;
		this.iCategory = iCategory;
		this.schoolId = schoolId;
	}

	public SpecialtyTree(Integer iType, Integer iCategory, Long pid) {
		super();
		this.iType = iType;
		this.iCategory = iCategory;
		this.pid = pid;
	}
	
	public SpecialtyTree(Long pid) {
		super();
		this.pid = pid;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getvCode() {
		return vCode;
	}
	public void setvCode(String vCode) {
		this.vCode = vCode;
	}
	public Integer getiType() {
		return iType;
	}
	public void setiType(Integer iType) {
		this.iType = iType;
	}
	public Integer getiCategory() {
		return iCategory;
	}
	public void setiCategory(Integer iCategory) {
		this.iCategory = iCategory;
	}
	public Long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	public List<SpecialtyTree> getChildren() {
		return children;
	}
	public void setChildren(List<SpecialtyTree> children) {
		this.children = children;
	}
    
}
