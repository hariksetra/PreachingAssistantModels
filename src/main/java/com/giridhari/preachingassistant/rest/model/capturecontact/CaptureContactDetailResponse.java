package com.giridhari.preachingassistant.rest.model.capturecontact;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class CaptureContactDetailResponse extends BaseDataResponse {

	private CaptureContactDetailResponseEntity data;
	
	public CaptureContactDetailResponse(CaptureContactDetailResponseEntity data) {
		super();
		this.data = data;
	}
	
	public CaptureContactDetailResponseEntity getData() {
		return data;
	}
	
	public void setData(CaptureContactDetailResponseEntity data) {
		this.data = data;
	}
	
}
