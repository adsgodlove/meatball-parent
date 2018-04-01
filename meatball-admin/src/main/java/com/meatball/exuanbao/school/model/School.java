package com.meatball.exuanbao.school.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import com.meatball.exuanbao.specialty.model.Specialty;
import com.meatball.exuanbao.specialty.model.SpecialtyTree;
import com.meatball.file.model.File;
import com.meatball.parameter.model.SchoolLevel;
import com.meatball.vo.Page;

import io.swagger.annotations.ApiModelProperty;
import springfox.documentation.annotations.ApiIgnore;


/**
 * @Title: School.java 
 * @Package com.meatball.exuanbao.school.model 
 * @Description: TODO(学校) 
 * @author zk  
 * @date 2018年3月15日 下午4:19:04 
 * @version V1.0
 */
public class School extends Page implements Serializable{
	private static final long serialVersionUID = 1L;
	//id
	private Long bId;
	//名称
    private String vName;
    //学校代码
    private String vCode;
    //学校图片logo
    private String pLogo;
	//建校时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dStime;
	//院校所在地编号
    private Integer iPlaceid;
	//院校所在地名称
    private String vPlacename;
	//高校地区编号
    private Integer iRegionid;
	//高校地区名称
    private String vRegionname;
	//院校性质编号
    private Integer iNatureid;
	//院校性质名称
    private String iNaturename;
	//院校类型编号
    private Integer iTypeid;
	//院校类型名称
    private String vTypename;
	//院校隶属编号
    private Integer iSubid;
	//院校隶属类型
    private Integer iSubsort;
	//院校隶属名称
    private String vSubname;
    //院校层次名称
    private Integer iLevel;
	//院校层次名称
    private String vLevelname;
	//院校网址
    private String vUrl;
	//电子邮箱
    private String vEmail;
	//联系电话
    private String vPhone;
	//院校地址
    private String vAddress;
	//占地面积
    private String vCovering;
	//校舍面积
    private String vSchoolhouse;
	//固定资产
    private String vAsset;
	//教学仪器
    private String vInstrument;
	//图书馆藏
    private String vLibrary;
	//专业数量
    private String vMajor;
	//在校学生
    private String vStudents;
	//专任教师
    private String vTeachers;
	//历史沿革
    private String vHistory;
	//院系设置
    private String vFaculty;
	//合作办学
    private String vCooperation;
	//特色解读
    private String vFeature;
	//排名
    private Integer iRanking;
	//状态
    private Integer iStatus;
	//创建时间
    private Date tCreatetime;
	//创建人
    private Long bCreator;
	//修改时间
    private Date tModifytime = new Date();
	//修改人
    private Long bModifier;
	//学科实力
    private String tStrength;
    //学院简介
    private String vSummary;
    
    
    //院校专业id集合(1,2,24,67,...)
    @ApiModelProperty(value="院校专业id集合(1,2,24,67,...)", example="1", required = false, hidden = false)
    private String specialtyStr;
    //专业id(查询该专业优势院校)
    @ApiModelProperty(value="专业id(查询该专业优势院校)", example="1", required = false, hidden = false)
    private Long specialtyid;
    //附件
    @ApiModelProperty(value="附件集", example="...", required = false, hidden = false)
    private List<File> paperss;
    //学院专业树
    @ApiModelProperty(value="学院专业树", example="...", required = false, hidden = false)
    private List<SpecialtyTree> specialtysTrees;
    //学院层次
    @ApiModelProperty(value="学院层次", example="...", required = false, hidden = false)
    private List<SchoolLevel> schoolLevels;
    //app 院校类型、层次
    @ApiModelProperty(value="app 院校类型、层次", example="...", required = false, hidden = false)
    private List<String> schoolAppTitle;
    //app标题
    @ApiModelProperty(value="app标题", example="...", required = false, hidden = false)
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
        this.dStime = dStime ;
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

	public List<File> getPaperss() {
		return paperss;
	}

	public void setPaperss(List<File> paperss) {
		this.paperss = paperss;
	}

	public String getvSummary() {
		return vSummary;
	}

	public void setvSummary(String vSummary) {
		this.vSummary = vSummary;
	}

	public List<String> getSchoolAppTitle() {
		return schoolAppTitle;
	}

	public void setSchoolAppTitle(List<String> schoolAppTitle) {
		this.schoolAppTitle = schoolAppTitle;
	}

	public String getSpecialtyStr() {
		return specialtyStr;
	}

	public void setSpecialtyStr(String specialtyStr) {
		this.specialtyStr = specialtyStr;
	}

	public List<SpecialtyTree> getSpecialtysTrees() {
		return specialtysTrees;
	}

	public void setSpecialtysTrees(List<SpecialtyTree> specialtysTrees) {
		this.specialtysTrees = specialtysTrees;
	}

	public List<SchoolLevel> getSchoolLevels() {
		return schoolLevels;
	}

	public void setSchoolLevels(List<SchoolLevel> schoolLevels) {
		this.schoolLevels = schoolLevels;
	}

	public List<String> getAppTitle() {
		return appTitle;
	}

	public void setAppTitle(List<String> appTitle) {
		this.appTitle = appTitle;
	}

	public Long getSpecialtyid() {
		return specialtyid;
	}

	public void setSpecialtyid(Long specialtyid) {
		this.specialtyid = specialtyid;
	}

	public String getvCode() {
		return vCode;
	}

	public void setvCode(String vCode) {
		this.vCode = vCode;
	}

	public String getpLogo() {
		return pLogo;
	}

	public void setpLogo(String pLogo) {
		this.pLogo = pLogo;
	}
    
}