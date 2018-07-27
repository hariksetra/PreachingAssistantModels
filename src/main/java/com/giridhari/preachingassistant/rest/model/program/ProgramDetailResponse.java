package com.giridhari.preachingassistant.rest.model.program;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class ProgramDetailResponse extends BaseDataResponse {
	
	private ProgramDetailResponseEntity data;

	public ProgramDetailResponse(ProgramDetailResponseEntity data) {
		super();
		this.data = data;
	}

	public ProgramDetailResponseEntity getData() {
		return data;
	}

	public void setData(ProgramDetailResponseEntity data) {
		this.data = data;
	}

}
