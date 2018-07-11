package com.giridhari.preachingassistant.rest.model.programattendance;

import java.util.Date;

import com.giridhari.preachingassistant.rest.model.RequestEntity;

public class ProgramAttendanceDetailRequestEntity extends RequestEntity{

	private Long id;
	private Long sessionId;
	private Long devoteeId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getDevoteeId() {
		return devoteeId;
	}
	public void setDevoteeId(Long devoteeId) {
		this.devoteeId = devoteeId;
	}
	public Long getSessionId() {
		return sessionId;
	}
	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}
}
