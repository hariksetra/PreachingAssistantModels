package com.giridhari.preachingassistant.rest.model.followupassignment;

import com.giridhari.preachingassistant.rest.model.ResponseEntity;

public class FollowUpAssignmentDetailResponseEntity extends ResponseEntity {

	private Long id;
	private Long attendeeId;
	private String attendeeName;
	private Long volunteerId;
	private Long programId;
	private String programName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(Long attendeeId) {
		this.attendeeId = attendeeId;
	}
	public Long getVolunteerId() {
		return volunteerId;
	}
	public void setVolunteerId(Long volunteerId) {
		this.volunteerId = volunteerId;
	}
	public Long getProgramId() {
		return programId;
	}
	public void setProgramId(Long programId) {
		this.programId = programId;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getAttendeeName() {
		return attendeeName;
	}
	public void setAttendeeName(String attendeeName) {
		this.attendeeName = attendeeName;
	}
	
	
}
