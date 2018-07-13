package com.giridhari.preachingassistant.rest.model.followupvolunteer;

import com.giridhari.preachingassistant.rest.model.ResponseEntity;

public class FollowUpVolunteerDetailResponseEntity extends ResponseEntity{

	private Long id;
	private Long programId;
	private String programName;
	private Long devoteeId;
	private String devoteeName;
	private boolean isFollowupVolunteer;
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
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getDevoteeName() {
		return devoteeName;
	}
	public void setDevoteeName(String devoteeName) {
		this.devoteeName = devoteeName;
	}
	public boolean isFollowupVolunteer() {
		return isFollowupVolunteer;
	}
	public void setFollowupVolunteer(boolean isFollowupVolunteer) {
		this.isFollowupVolunteer = isFollowupVolunteer;
	}
	
	
}
