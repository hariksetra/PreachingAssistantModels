package com.giridhari.preachingassistant.rest.model;

/**
 * Generic entity representing anything with a status.
 * For eg, create responses, update responses, etc.
 * 
 * @author shyam
 *
 */
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
