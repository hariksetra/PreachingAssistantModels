package com.giridhari.preachingassistant.rest.model.followupvolunteer;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class FollowupVolunteerDetailResponse extends BaseDataResponse {

	private FollowUpVolunteerDetailResponseEntity data;

	public FollowupVolunteerDetailResponse(FollowUpVolunteerDetailResponseEntity data) {
		super();
		this.data = data;
	}

	public FollowUpVolunteerDetailResponseEntity getData() {
		return data;
	}

	public void setData(FollowUpVolunteerDetailResponseEntity data) {
		this.data = data;
	}
	
}
