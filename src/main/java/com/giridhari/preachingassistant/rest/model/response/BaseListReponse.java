package com.giridhari.preachingassistant.rest.model.response;

import java.util.List;

import com.giridhari.preachingassistant.rest.model.Paging;
import com.giridhari.preachingassistant.rest.model.ResponseEntity;

/**
 * Holder for responses which have a list format with paging information
 * 
 * @author shyam
 *
 */
public class BaseListReponse extends BaseResponse {
	
	private List<? extends ResponseEntity> data;
	private Paging paging;

	public List<? extends ResponseEntity> getData() {
		return data;
	}

	public void setData(List<? extends ResponseEntity> data) {
		this.data = data;
	}
	
	public Paging getPaging() {
		return paging;
	}
	
	public void setPaging(Paging paging) {
		this.paging = paging;
	}

}
