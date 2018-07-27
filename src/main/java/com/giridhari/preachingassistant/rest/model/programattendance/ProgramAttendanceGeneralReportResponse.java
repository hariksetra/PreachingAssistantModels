package com.giridhari.preachingassistant.rest.model.programattendance;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class ProgramAttendanceGeneralReportResponse extends BaseDataResponse {
	
	 private ProgramAttendanceGeneralReport data;

	public ProgramAttendanceGeneralReportResponse(ProgramAttendanceGeneralReport data) {
		super();
		this.data = data;
	}

	public ProgramAttendanceGeneralReport getData() {
		return data;
	}

	public void setData(ProgramAttendanceGeneralReport data) {
		this.data = data;
	}

}
