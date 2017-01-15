package com.giridhari.preachingassistant.rest.model;

public class GenericStatusEntity extends ResponseEntity {

	private String status;
	private String reason;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
