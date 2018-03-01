package com.giridhari.preachingassistant.rest.model.capturecontact;

import java.util.Date;

import com.giridhari.preachingassistant.rest.model.ResponseEntity;

public class CaptureContactDetailResponseEntity extends ResponseEntity {
	private Long id;
	private Long capturedById;
	private String capturedByName;
	private Long capturedDevoteeId;
	private String capturedDevoteeName;
	private String capturedDevoteePhone;
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
	public String getCapturedByName() {
		return capturedByName;
	}
	public void setCapturedByName(String capturedByName) {
		this.capturedByName = capturedByName;
	}
	public Long getCapturedDevoteeId() {
		return capturedDevoteeId;
	}
	public void setCapturedDevoteeId(Long capturedDevoteeId) {
		this.capturedDevoteeId = capturedDevoteeId;
	}
	public String getCapturedDevoteeName() {
		return capturedDevoteeName;
	}
	public void setCapturedDevoteeName(String capturedDevoteeName) {
		this.capturedDevoteeName = capturedDevoteeName;
	}
	public String getCapturedDevoteePhone() {
		return capturedDevoteePhone;
	}
	public void setCapturedDevoteePhone(String capturedDevoteePhone) {
		this.capturedDevoteePhone = capturedDevoteePhone;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
