package com.giridhari.preachingassistant.rest.model.response;

import com.giridhari.preachingassistant.rest.model.ResponseEntity;

public class BaseDataResponse {
	
	private ResponseEntity data;
	
	public BaseDataResponse(ResponseEntity entity) {
		this.data = entity;
	}

	public ResponseEntity getData() {
		return data;
	}

	public void setData(ResponseEntity data) {
		this.data = data;
	}

}
