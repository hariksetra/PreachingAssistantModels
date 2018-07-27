package com.giridhari.preachingassistant.rest.model.programsession;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class ProgramSessionDetailResponse extends BaseDataResponse {
	
	private ProgramSessionDetailResponseEntity data;
	
	public ProgramSessionDetailResponse(ProgramSessionDetailResponseEntity data) {
		super();
		this.data = data;
	}

	public ProgramSessionDetailResponseEntity getData() {
		return data;
	}
	
	public void setData(ProgramSessionDetailResponseEntity data) {
		this.data = data;
	}

}
