package com.giridhari.preachingassistant.rest.model.programattendance;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class ProgramAttendanceDetailResponse extends BaseDataResponse {

	private ProgramAttendanceDetailResponseEntity data;

	public ProgramAttendanceDetailResponse(ProgramAttendanceDetailResponseEntity data) {
		super();
		this.data = data;
	}

	public ProgramAttendanceDetailResponseEntity getData() {
		return data;
	}

	public void setData(ProgramAttendanceDetailResponseEntity data) {
		this.data = data;
	}
	
}
