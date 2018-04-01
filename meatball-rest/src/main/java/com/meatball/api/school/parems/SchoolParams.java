package com.meatball.api.school.parems;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import com.meatball.vo.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Title: SchoolParams.java 
 * @Package com.meatball.api.school.parems 
 * @Description: TODO(学校) 
 * @author zk  
 * @date 2018年3月15日 下午4:19:04 
 * @version V1.0
 */
@ApiModel
public class SchoolParams extends Page implements Serializable{
	private static final long serialVersionUID = 1L;
	//id
	@ApiModelProperty(value="id", example="1001")
	private Long bId;
	//名称
	@ApiModelProperty(value="名称", example="四川大学")
    private String vName;
	//学校代码
	@ApiModelProperty(value="学校代码", example="10001")
    private String vCode;
    //学校图片logo
	@ApiModelProperty(value="学校图片logo图片路径", example="fiel/xxx/xxx.jpg")
    private String pLogo;
	//建校时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value="建校时间", example="1890-01-01")
    private Date dStime;
	//院校所在地编号
    @ApiModelProperty(value="院校所在地编号", example="120001")
    private Integer iPlaceid;
	//院校所在地名称
    @ApiModelProperty(value="院校所在地名称", example="四川")
    private String vPlacename;
	//高校地区编号
    @ApiModelProperty(value="高校地区编号", example="120101")
    private Integer iRegionid;
	//高校地区名称
    @ApiModelProperty(value="高校地区名称", example="成都市")
    private String vRegionname;
	//院校性质编号
    @ApiModelProperty(value="院校性质编号", example="1")
    private Integer iNatureid;
	//院校性质名称
    @ApiModelProperty(value="院校性质名称", example="公办")
    private String iNaturename;
	//院校类型编号
    @ApiModelProperty(value="院校类型编号", example="1")
    private Integer iTypeid;
	//院校类型名称
    @ApiModelProperty(value="院校类型编号", example="文艺")
    private String vTypename;
	//院校隶属编号
    @ApiModelProperty(value="院校隶属编号", example="4")
    private Integer iSubid;
	//院校隶属类型
    @ApiModelProperty(value="院校隶属类型", example="1")
    private Integer iSubsort;
	//院校隶属名称
    @ApiModelProperty(value="院校隶属名称", example="四川省教育部")
    private String vSubname;
    //院校层次名称
    @ApiModelProperty(value="院校层次名称", example="1")
    private Integer iLevel;
	//院校层次名称
    @ApiModelProperty(value="院校层次名称", example="211/985工程")
    private String vLevelname;
	//院校网址
    @ApiModelProperty(value="院校网址", example="http://www.scu.edu.cn/")
    private String vUrl;
	//电子邮箱
    @ApiModelProperty(value="电子邮箱", example="xxxxxxx@xx.com")
    private String vEmail;
	//联系电话
    @ApiModelProperty(value="联系电话", example="028-86080605")
    private String vPhone;
	//院校地址
    @ApiModelProperty(value="院校地址", example=" 成都市一环路南一段24号 ")
    private String vAddress;
	//占地面积
    @ApiModelProperty(value="占地面积", example="100亩")
    private String vCovering;
	//校舍面积
    @ApiModelProperty(value="校舍面积", example="1000亩")
    private String vSchoolhouse;
	//固定资产
    @ApiModelProperty(value="固定资产", example="200亿")
    private String vAsset;
	//教学仪器
    @ApiModelProperty(value="教学仪器", example="1000套")
    private String vInstrument;
	//图书馆藏
    @ApiModelProperty(value="图书馆藏", example="1000000册")
    private String vLibrary;
	//专业数量
    @ApiModelProperty(value="专业数量", example="200个")
    private String vMajor;
	//在校学生
    @ApiModelProperty(value="在校学生", example="30000")
    private String vStudents;
	//专任教师
    @ApiModelProperty(value="String", example="2000")
    private String vTeachers;
	//历史沿革
    @ApiModelProperty(value="历史沿革", example="xxxxxx")
    private String vHistory;
	//院系设置
    @ApiModelProperty(value="院系设置", example="xxxxxx")
    private String vFaculty;
	//合作办学
    @ApiModelProperty(value="合作办学", example="xxxxxx")
    private String vCooperation;
	//特色解读
    @ApiModelProperty(value="特色解读", example="xxxxxx")
    private String vFeature;
	//排名
    @ApiModelProperty(value="排名", example="xxxxxx")
    private Integer iRanking;
	//状态
    @ApiModelProperty(value="状态", example="0 正常 1删除")
    private Integer iStatus;
	//创建时间
    @ApiModelProperty(value="创建时间", example="yyyy-MM-dd HH:mm:ss")
    private Date tCreatetime;
	//创建人
    @ApiModelProperty(value="创建人编码", example="1111")
    private Long bCreator;
	//修改时间
    @ApiModelProperty(value="修改时间", example="yyyy-MM-dd HH:mm:ss")
    private Date tModifytime = new Date();
	//修改人
    @ApiModelProperty(value="修改人编码", example="1111")
    private Long bModifier;
	//学科实力
    @ApiModelProperty(value="学科实力", example="xxxxxx")
    private String tStrength;
    //学院简介
    @ApiModelProperty(value="学院简介", example="xxxxxx")
    private String vSummary;
    
    //app标题
    @ApiModelProperty(value="app标题", example="211,985,本科")
    private List<String> appTitle;

    public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName == null ? null : vName.trim();
    }

    public Date getdStime() {
        return dStime;
    }

    public void setdStime(Date dStime) {
        this.dStime = dStime;
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
        this.vPlacename = vPlacename == null ? null : vPlacename.trim();
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
        this.vRegionname = vRegionname == null ? null : vRegionname.trim();
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
        this.iNaturename = iNaturename == null ? null : iNaturename.trim();
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
        this.vTypename = vTypename == null ? null : vTypename.trim();
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
        this.vSubname = vSubname == null ? null : vSubname.trim();
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
        this.vLevelname = vLevelname == null ? null : vLevelname.trim();
    }

    public String getvUrl() {
        return vUrl;
    }

    public void setvUrl(String vUrl) {
        this.vUrl = vUrl == null ? null : vUrl.trim();
    }

    public String getvEmail() {
        return vEmail;
    }

    public void setvEmail(String vEmail) {
        this.vEmail = vEmail == null ? null : vEmail.trim();
    }

    public String getvPhone() {
        return vPhone;
    }

    public void setvPhone(String vPhone) {
        this.vPhone = vPhone == null ? null : vPhone.trim();
    }

    public String getvAddress() {
        return vAddress;
    }

    public void setvAddress(String vAddress) {
        this.vAddress = vAddress == null ? null : vAddress.trim();
    }

    public String getvCovering() {
        return vCovering;
    }

    public void setvCovering(String vCovering) {
        this.vCovering = vCovering == null ? null : vCovering.trim();
    }

    public String getvSchoolhouse() {
        return vSchoolhouse;
    }

    public void setvSchoolhouse(String vSchoolhouse) {
        this.vSchoolhouse = vSchoolhouse == null ? null : vSchoolhouse.trim();
    }

    public String getvAsset() {
        return vAsset;
    }

    public void setvAsset(String vAsset) {
        this.vAsset = vAsset == null ? null : vAsset.trim();
    }

    public String getvInstrument() {
        return vInstrument;
    }

    public void setvInstrument(String vInstrument) {
        this.vInstrument = vInstrument == null ? null : vInstrument.trim();
    }

    public String getvLibrary() {
        return vLibrary;
    }

    public void setvLibrary(String vLibrary) {
        this.vLibrary = vLibrary == null ? null : vLibrary.trim();
    }

    public String getvMajor() {
        return vMajor;
    }

    public void setvMajor(String vMajor) {
        this.vMajor = vMajor == null ? null : vMajor.trim();
    }

    public String getvStudents() {
        return vStudents;
    }

    public void setvStudents(String vStudents) {
        this.vStudents = vStudents == null ? null : vStudents.trim();
    }

    public String getvTeachers() {
        return vTeachers;
    }

    public void setvTeachers(String vTeachers) {
        this.vTeachers = vTeachers == null ? null : vTeachers.trim();
    }

    public String getvHistory() {
        return vHistory;
    }

    public void setvHistory(String vHistory) {
        this.vHistory = vHistory == null ? null : vHistory.trim();
    }

    public String getvFaculty() {
        return vFaculty;
    }

    public void setvFaculty(String vFaculty) {
        this.vFaculty = vFaculty == null ? null : vFaculty.trim();
    }

    public String getvCooperation() {
        return vCooperation;
    }

    public void setvCooperation(String vCooperation) {
        this.vCooperation = vCooperation == null ? null : vCooperation.trim();
    }

    public String getvFeature() {
        return vFeature;
    }

    public void setvFeature(String vFeature) {
        this.vFeature = vFeature == null ? null : vFeature.trim();
    }

    public Integer getiRanking() {
        return iRanking;
    }

    public void setiRanking(Integer iRanking) {
        this.iRanking = iRanking;
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

    public Long getbCreator() {
        return bCreator;
    }

    public void setbCreator(Long bCreator) {
        this.bCreator = bCreator;
    }

    public Date gettModifytime() {
        return tModifytime;
    }

    public void settModifytime(Date tModifytime) {
        this.tModifytime = tModifytime;
    }

    public Long getbModifier() {
        return bModifier;
    }

    public void setbModifier(Long bModifier) {
        this.bModifier = bModifier;
    }

    public String gettStrength() {
        return tStrength;
    }

    public void settStrength(String tStrength) {
        this.tStrength = tStrength == null ? null : tStrength.trim();
    }

	public String getvSummary() {
		return vSummary;
	}

	public void setvSummary(String vSummary) {
		this.vSummary = vSummary;
	}
    
}