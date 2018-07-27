package com.giridhari.preachingassistant.rest.model.programassignment;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class ProgramAssignmentDetailResponse extends BaseDataResponse {

	private ProgramAssignmentDetailResponseEntity data;

	public ProgramAssignmentDetailResponse(ProgramAssignmentDetailResponseEntity data) {
		super();
		this.data = data;
	}

	public ProgramAssignmentDetailResponseEntity getData() {
		return data;
	}

	public void setData(ProgramAssignmentDetailResponseEntity data) {
		this.data = data;
	}
	
}
