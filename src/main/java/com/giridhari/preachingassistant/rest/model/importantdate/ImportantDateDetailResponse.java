package com.giridhari.preachingassistant.rest.model.importantdate;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class ImportantDateDetailResponse extends BaseDataResponse {
	
	private ImportantDateDetailResponseEntity data;
	
	public ImportantDateDetailResponse(ImportantDateDetailResponseEntity data) {
		super();
		this.data = data;
	}
	
	public ImportantDateDetailResponseEntity getData() {
		return data;
	}
	
	public void setData(ImportantDateDetailResponseEntity data) {
		this.data = data;
	}

}
