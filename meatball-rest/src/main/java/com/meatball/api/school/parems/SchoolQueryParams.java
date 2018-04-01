package com.meatball.api.school.parems;

import java.io.Serializable;
import com.meatball.vo.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class SchoolQueryParams extends Page implements Serializable{

	private static final long serialVersionUID = 1L;
	//名称
	@ApiModelProperty(value="名称", example="四川大学", required = false)
    private String vName;
	//院校所在地编号
    @ApiModelProperty(value="院校所在地编号", example="120001", required = false)
    private Integer iPlaceid;
	//院校所在地名称
    @ApiModelProperty(value="院校所在地名称", example="四川", required = false)
    private String vPlacename;
	//高校地区编号
    @ApiModelProperty(value="高校地区编号", example="120101", required = false)
    private Integer iRegionid;
	//高校地区名称
    @ApiModelProperty(value="高校地区名称", example="成都市", required = false)
    private String vRegionname;
	//院校性质编号
    @ApiModelProperty(value="院校性质编号", example="1", required = false)
    private Integer iNatureid;
	//院校性质名称
    @ApiModelProperty(value="院校性质名称", example="公办", required = false)
    private String iNaturename;
	//院校类型编号
    @ApiModelProperty(value="院校类型编号", example="1", required = false)
    private Integer iTypeid;
	//院校类型名称
    @ApiModelProperty(value="院校类型编号", example="文艺", required = false)
    private String vTypename;
	//院校隶属编号
    @ApiModelProperty(value="院校隶属编号", example="4", required = false)
    private Integer iSubid;
	//院校隶属类型
    @ApiModelProperty(value="院校隶属类型", example="1", required = false)
    private Integer iSubsort;
	//院校隶属名称
    @ApiModelProperty(value="院校隶属名称", example="四川省教育部", required = false)
    private String vSubname;
    //院校层次名称
    @ApiModelProperty(value="院校层次名称", example="1", required = false)
    private Integer iLevel;
	//院校层次名称
    @ApiModelProperty(value="院校层次名称", example="xxxxxx", required = false)
    private String vLevelname;
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public Integer getiPlaceid() {
		return iPlaceid;
	}
	public void setiPlaceid(Integer iPlaceid) {
		this.iPlaceid = iPlaceid;
	}
	public String getvPlacename() {
		return vPlacename;
	}
	public void setvPlacename(String vPlacename) {
		this.vPlacename = vPlacename;
	}
	public Integer getiRegionid() {
		return iRegionid;
	}
	public void setiRegionid(Integer iRegionid) {
		this.iRegionid = iRegionid;
	}
	public String getvRegionname() {
		return vRegionname;
	}
	public void setvRegionname(String vRegionname) {
		this.vRegionname = vRegionname;
	}
	public Integer getiNatureid() {
		return iNatureid;
	}
	public void setiNatureid(Integer iNatureid) {
		this.iNatureid = iNatureid;
	}
	public String getiNaturename() {
		return iNaturename;
	}
	public void setiNaturename(String iNaturename) {
		this.iNaturename = iNaturename;
	}
	public Integer getiTypeid() {
		return iTypeid;
	}
	public void setiTypeid(Integer iTypeid) {
		this.iTypeid = iTypeid;
	}
	public String getvTypename() {
		return vTypename;
	}
	public void setvTypename(String vTypename) {
		this.vTypename = vTypename;
	}
	public Integer getiSubid() {
		return iSubid;
	}
	public void setiSubid(Integer iSubid) {
		this.iSubid = iSubid;
	}
	public Integer getiSubsort() {
		return iSubsort;
	}
	public void setiSubsort(Integer iSubsort) {
		this.iSubsort = iSubsort;
	}
	public String getvSubname() {
		return vSubname;
	}
	public void setvSubname(String vSubname) {
		this.vSubname = vSubname;
	}
	public Integer getiLevel() {
		return iLevel;
	}
	public void setiLevel(Integer iLevel) {
		this.iLevel = iLevel;
	}
	public String getvLevelname() {
		return vLevelname;
	}
	public void setvLevelname(String vLevelname) {
		this.vLevelname = vLevelname;
	}
    
}
