package com.giridhari.preachingassistant.rest.model.useraccount;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class UserLoginResponse extends BaseDataResponse {
	
	private UserLoginResponseEntity data;
	
	public UserLoginResponse(UserLoginResponseEntity data) {
		super();
		this.data = data;
	}
	
	public UserLoginResponseEntity getData() {
		return data;
	}
	
	public void setData(UserLoginResponseEntity data) {
		this.data = data;
	}

}
