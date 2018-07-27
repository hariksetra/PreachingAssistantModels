package com.giridhari.preachingassistant.rest.model.devotee;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class DevoteeDetailResponse extends BaseDataResponse {

	private DevoteeDetailResponseEntity data;
	
	public DevoteeDetailResponse(DevoteeDetailResponseEntity data) {
		super();
		this.data = data;
	}
	
	public DevoteeDetailResponseEntity getData() {
		return data;
	}
	
	public void setData(DevoteeDetailResponseEntity data) {
		this.data = data;
	}
	
}
