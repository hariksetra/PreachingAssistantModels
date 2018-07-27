package com.giridhari.preachingassistant.rest.model.response;

/**
 * Base wrapper for all responses with "data" element
 * 
 * @author shyam
 *
 */
public class BaseDataResponse {
	
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
