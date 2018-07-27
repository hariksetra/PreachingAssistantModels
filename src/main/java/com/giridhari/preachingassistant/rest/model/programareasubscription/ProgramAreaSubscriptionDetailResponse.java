package com.giridhari.preachingassistant.rest.model.programareasubscription;

import com.giridhari.preachingassistant.rest.model.response.BaseDataResponse;

public class ProgramAreaSubscriptionDetailResponse extends BaseDataResponse {
	
	private ProgramAreaSubscriptionDetailResponseEntity data;

	public ProgramAreaSubscriptionDetailResponse(ProgramAreaSubscriptionDetailResponseEntity data) {
		super();
		this.data = data;
	}

	public ProgramAreaSubscriptionDetailResponseEntity getData() {
		return data;
	}

	public void setData(ProgramAreaSubscriptionDetailResponseEntity data) {
		this.data = data;
	}

}
