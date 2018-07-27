package com.giridhari.preachingassistant.rest.model.followupassignment;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class FollowupAssignmentDetailResponse extends BaseDataResponse {
	
	private FollowUpAssignmentDetailResponseEntity data;
	
	public FollowupAssignmentDetailResponse(FollowUpAssignmentDetailResponseEntity data) {
		super();
		this.data = data;
	}
	
	public FollowUpAssignmentDetailResponseEntity getData() {
		return data;
	}
	
	public void setData(FollowUpAssignmentDetailResponseEntity data) {
		this.data = data;
	}

}
