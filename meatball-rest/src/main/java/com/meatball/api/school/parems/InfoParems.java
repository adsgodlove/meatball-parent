package com.meatball.api.school.parems;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class InfoParems implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//id
	@ApiModelProperty(value="唯一标识", example="1", required = true)
	private Long bId;

	public Long getbId() {
		return bId;
	}

	public void setbId(Long bId) {
		this.bId = bId;
	}

}
