package com.giridhari.preachingassistant.rest.model.devoteehistory;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class DevoteeHistoryDetailResponse extends BaseDataResponse {
	
	private DevoteeHistoryDetailResponseEntity data;

	public DevoteeHistoryDetailResponse(DevoteeHistoryDetailResponseEntity data) {
		super();
		this.data = data;
	}

	public DevoteeHistoryDetailResponseEntity getData() {
		return data;
	}

	public void setData(DevoteeHistoryDetailResponseEntity data) {
		this.data = data;
	}

}
