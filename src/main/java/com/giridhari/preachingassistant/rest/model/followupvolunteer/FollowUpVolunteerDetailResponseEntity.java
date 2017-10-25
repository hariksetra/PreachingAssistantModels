package com.giridhari.preachingassistant.rest.model.followupvolunteer;

import com.giridhari.preachingassistant.rest.model.ResponseEntity;

public class FollowUpVolunteerDetailResponseEntity extends ResponseEntity{

	private Long id;
	private Long programId;
	private Long devoteeId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProgramId() {
		return programId;
	}
	public void setProgramId(Long programId) {
		this.programId = programId;
	}
	public Long getDevoteeId() {
		return devoteeId;
	}
	public void setDevoteeId(Long devoteeId) {
		this.devoteeId = devoteeId;
	}
	
	
}
