package com.giridhari.preachingassistant.rest.model.capturecontact;

import java.util.Date;

import com.giridhari.preachingassistant.rest.model.RequestEntity;

public class CaptureContactDetailRequestEntity extends RequestEntity  {
	private Long id;
	private Long capturedById;
	private Long capturedDevoteeId;
	private Date timestamp;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getCapturedById() {
		return capturedById;
	}
	
	public void setCapturedById(Long capturedById) {
		this.capturedById = capturedById;
	}
	
	public Long getCapturedDevoteeId() {
		return capturedDevoteeId;
	}
	
	public void setCapturedDevoteeId(Long capturedDevoteeId) {
		this.capturedDevoteeId = capturedDevoteeId;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
