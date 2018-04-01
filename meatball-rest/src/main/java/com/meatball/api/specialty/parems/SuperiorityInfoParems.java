package com.meatball.api.specialty.parems;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class SuperiorityInfoParems implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//id
	@ApiModelProperty(value="专业唯一标识", example="1", required = true)
	private Long bId;

	public Long getbId() {
		return bId;
	}

	public void setbId(Long bId) {
		this.bId = bId;
	}

}
