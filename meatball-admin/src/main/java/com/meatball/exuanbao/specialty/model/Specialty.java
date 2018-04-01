package com.meatball.exuanbao.specialty.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.meatball.exuanbao.school.model.School;
import com.meatball.vo.Page;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Title: Specialty.java 
 * @Package com.meatball.school.model 
 * @Description: TODO(专业表) 
 * @author zk  
 * @date 2018年3月15日 下午4:18:47 
 * @version V1.0
 */
public class Specialty extends Page implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//id
	@ApiModelProperty(value="id", example="1")
	private Long bId;
	//名称
	@ApiModelProperty(value="专业名称", example="经济学")
    private String vName;
	//代码
	@ApiModelProperty(value="专业代码", example="020101")
    private String vCode;
	//学科类型(1文,2理)
	@ApiModelProperty(value="学科类型(1文,2理)", example="1")
    private Integer iType;
    //专业层级
	@ApiModelProperty(value="专业层级", example="1")
    private Integer iLevel;
    //专业层级名称
	@ApiModelProperty(value="专业层级名称", example="本科、专业")
    private String iLevelname;
	//类别
	@ApiModelProperty(value="类别", example="1 学历门类、2学科门类、3专业类别")
    private Integer iCategory;
	//父级id
	@ApiModelProperty(value="父级id", example="0")
    private Long bPid;
	//授予学位
	@ApiModelProperty(value="授予学位", example="经济学学士")
    private String vDegree;
	//修学年限
	@ApiModelProperty(value="修学年限", example="四")
    private Integer iYear;
    //是否热门  1是 2否
	@ApiModelProperty(value="是否热门  1是 2否", example="1")
    private Integer iHot;
	//性别要求 男 女
	@ApiModelProperty(value="性别要求 男 女", example="男")
    private String vGender;
	//专业解读
	@ApiModelProperty(value="专业解读", example="经济学是一门很现实的学科。人民币升值还是贬值，石油价格的上涨...")
    private String vAnalysis;
	//必修课程
	@ApiModelProperty(value="必修课程", example="经济学主要课程：政治经济学、《资本论》、西方经济学、统计学、国际经济学...")
    private String vCourse;
	//优势院校
	@ApiModelProperty(value="优势院校", example="中央财经大学、西南财经大学...")
    private String vSchool;
	//就业方向
	@ApiModelProperty(value="就业方向", example="　经济学作为一个大的专业学科，下面还有很多的分支，像西方经济学、金融学、财政学、数量经济...")
    private String vGraduate;
	//就职岗位
	@ApiModelProperty(value="就职岗位", example="如财政部门、税务部门及政府其他经济管理部门，对想当政府公务员的考生来说")
    private String vOccupation;
	//行业趋势
	@ApiModelProperty(value="行业趋势", example="金融学研究生毕业后可进入银行、证券、信托等金融类机构工作，收入相当可观。数量经济学...")
    private String vEmployment;
	//专家点评
	@ApiModelProperty(value="专家点评", example="对现代经济理论感兴趣或是以后有志于从事经济理论研究的同学来说，这个专业是最好的选择。")
    private String vComment;
	//状态
	@ApiModelProperty(value="状态", example="1")
    private Integer iStatus;
	//创建时间
	@ApiModelProperty(value="创建时间", example="1")
    private Date tCreatetime;
	//创建人
	@ApiModelProperty(value="创建人", example="1")
    private Long bCreator;
	//修改时间
	@ApiModelProperty(value="修改时间", example="1")
    private Date tModifytime = new Date();
	//修改人
	@ApiModelProperty(value="修改人", example="1")
    private Long bModifier;
	
	
    //子集
	@ApiModelProperty(value="专业子集", example="1")
    private List<Specialty> children;
	//院校id(查询该院校优势专业)
	private Long schoolid;
    //优势学院
	//@ApiModelProperty(value="优势学院", example="1")
    //private List<School> schools;
    
    public Specialty(){}
    
    public Specialty(Long bId, String vName, Integer iType, Long bPid) {
		super();
		this.bId = bId;
		this.vName = vName;
		this.bPid = bPid;
		this.iType = iType;
	}
    
	public Specialty(Integer iType, Integer iCategory, Long bPid) {
		super();
		this.iType = iType;
		this.iCategory = iCategory;
		this.bPid = bPid;
	}

	public Integer getiHot() {
		return iHot;
	}

	public void setiHot(Integer iHot) {
		this.iHot = iHot;
	}

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

    public String getvCode() {
        return vCode;
    }

    public void setvCode(String vCode) {
        this.vCode = vCode == null ? null : vCode.trim();
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

    public Long getbPid() {
        return bPid;
    }

    public void setbPid(Long bPid) {
        this.bPid = bPid;
    }

    public String getvDegree() {
        return vDegree;
    }

    public void setvDegree(String vDegree) {
        this.vDegree = vDegree == null ? null : vDegree.trim();
    }

    public Integer getiYear() {
        return iYear;
    }

    public void setiYear(Integer iYear) {
        this.iYear = iYear;
    }

    public String getvGender() {
        return vGender;
    }

    public void setvGender(String vGender) {
        this.vGender = vGender == null ? null : vGender.trim();
    }

    public String getvAnalysis() {
        return vAnalysis;
    }

    public void setvAnalysis(String vAnalysis) {
        this.vAnalysis = vAnalysis == null ? null : vAnalysis.trim();
    }

    public String getvCourse() {
        return vCourse;
    }

    public void setvCourse(String vCourse) {
        this.vCourse = vCourse == null ? null : vCourse.trim();
    }

    public String getvSchool() {
        return vSchool;
    }

    public void setvSchool(String vSchool) {
        this.vSchool = vSchool == null ? null : vSchool.trim();
    }

    public String getvGraduate() {
        return vGraduate;
    }

    public void setvGraduate(String vGraduate) {
        this.vGraduate = vGraduate == null ? null : vGraduate.trim();
    }

    public String getvOccupation() {
        return vOccupation;
    }

    public void setvOccupation(String vOccupation) {
        this.vOccupation = vOccupation == null ? null : vOccupation.trim();
    }

    public String getvEmployment() {
        return vEmployment;
    }

    public void setvEmployment(String vEmployment) {
        this.vEmployment = vEmployment == null ? null : vEmployment.trim();
    }

    public String getvComment() {
        return vComment;
    }

    public void setvComment(String vComment) {
        this.vComment = vComment == null ? null : vComment.trim();
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

	public Integer getiLevel() {
		return iLevel;
	}

	public void setiLevel(Integer iLevel) {
		this.iLevel = iLevel;
	}

	public String getiLevelname() {
		return iLevelname;
	}

	public void setiLevelname(String iLevelname) {
		this.iLevelname = iLevelname;
	}

	public List<Specialty> getChildren() {
		return children;
	}

	public void setChildren(List<Specialty> children) {
		this.children = children;
	}

	public Long getSchoolid() {
		return schoolid;
	}

	public void setSchoolid(Long schoolid) {
		this.schoolid = schoolid;
	}

	/*public List<School> getSchools() {
		return schools;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}*/
    
}