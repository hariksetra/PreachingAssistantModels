package com.giridhari.preachingassistant.rest.model.yatra;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class YatraDetailResponse extends BaseDataResponse {

	private YatraDetailResponseEntity data;

	public YatraDetailResponse(YatraDetailResponseEntity data) {
		super();
		this.data = data;
	}

	public YatraDetailResponseEntity getData() {
		return data;
	}

	public void setData(YatraDetailResponseEntity data) {
		this.data = data;
	}
	
}
