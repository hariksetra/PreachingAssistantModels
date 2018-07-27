package com.giridhari.preachingassistant.rest.model.followupassignment;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class FollowupDashboardReportResponse extends BaseDataResponse {

	private FollowUpDashboardReportResponseEntity data;
	
	public FollowupDashboardReportResponse(FollowUpDashboardReportResponseEntity data) {
		super();
		this.data = data;
	}
	
	public FollowUpDashboardReportResponseEntity getData() {
		return data;
	}
	
	public void setData(FollowUpDashboardReportResponseEntity data) {
		this.data = data;
	}
	
}
