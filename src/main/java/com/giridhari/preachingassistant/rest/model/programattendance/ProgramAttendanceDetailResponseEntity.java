package com.giridhari.preachingassistant.rest.model.programattendance;



import com.giridhari.preachingassistant.rest.model.ResponseEntity;

public class ProgramAttendanceDetailResponseEntity extends ResponseEntity {

	private Long id;
	private Long sessionId;
	private Long devoteeId;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSessionId() {
		return sessionId;
	}
	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}
	public Long getDevoteeId() {
		return devoteeId;
	}
	public void setDevoteeId(Long devoteeId) {
		this.devoteeId = devoteeId;
	}
	
}
