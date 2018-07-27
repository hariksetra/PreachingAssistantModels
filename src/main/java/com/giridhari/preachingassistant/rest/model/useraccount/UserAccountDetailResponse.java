package com.giridhari.preachingassistant.rest.model.useraccount;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class UserAccountDetailResponse extends BaseDataResponse {

	private UserAccountDetailEntity data;
	
	public UserAccountDetailResponse(UserAccountDetailEntity data) {
		super();
		this.data = data;
	}
	
	public UserAccountDetailEntity getData() {
		return data;
	}
	
	public void setData(UserAccountDetailEntity data) {
		this.data = data;
	}
	
}
