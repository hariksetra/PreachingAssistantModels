package com.giridhari.preachingassistant.rest.model.programassignment;

import com.giridhari.preachingassistant.rest.model.RequestEntity;

public class ProgramAssignmentDetailRequestEntity extends RequestEntity{

	private Long id;
	private Long programId;
	private Long attendeeId;
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
	public Long getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(Long attendeeId) {
		this.attendeeId = attendeeId;
	}
	
	
}
