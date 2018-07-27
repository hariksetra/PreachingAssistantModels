package com.giridhari.preachingassistant.rest.model.followup;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class FollowupDetailResponse extends BaseDataResponse {
	
	private FollowUpDetailResponseEntity data;
	
	public FollowupDetailResponse(FollowUpDetailResponseEntity data) {
		super();
		this.data = data;
	}
	
	public FollowUpDetailResponseEntity getData() {
		return data;
	}
	
	public void setData(FollowUpDetailResponseEntity data) {
		this.data = data;
	}

}
