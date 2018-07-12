package com.giridhari.preachingassistant.rest.model.followup;

import java.util.Date;

import com.giridhari.preachingassistant.model.Response;
import com.giridhari.preachingassistant.rest.model.ResponseEntity;

public class FollowUpDetailResponseEntity extends ResponseEntity{

	private Long id;
	private Long followupForSessionId;
	private Date followupForSessionDate;
	private String followupForSessionTopic;
	private Long volunteerId;
	private Long attendeeId;
	private Long programId;
	private Response response;
	private String comment;
	private Integer rating;
	private Date timestamp;
	private Integer taskStatus;
	private String volunteerName;
	private String attendeeName;
	private String programName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getVolunteerId() {
		return volunteerId;
	}
	public void setVolunteerId(Long volunteerId) {
		this.volunteerId = volunteerId;
	}
	public Long getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(Long attendeeId) {
		this.attendeeId = attendeeId;
	}
	public Long getProgramId() {
		return programId;
	}
	public void setProgramId(Long programId) {
		this.programId = programId;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(Integer taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getVolunteerName() {
		return volunteerName;
	}
	public void setVolunteerName(String volunteerName) {
		this.volunteerName = volunteerName;
	}
	public String getAttendeeName() {
		return attendeeName;
	}
	public void setAttendeeName(String attendeeName) {
		this.attendeeName = attendeeName;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public Long getFollowupForSessionId() {
		return followupForSessionId;
	}
	public void setFollowupForSessionId(Long followupForSessionId) {
		this.followupForSessionId = followupForSessionId;
	}
	public Date getFollowupForSessionDate() {
		return followupForSessionDate;
	}
	public void setFollowupForSessionDate(Date followupForSessionDate) {
		this.followupForSessionDate = followupForSessionDate;
	}
	public String getFollowupForSessionTopic() {
		return followupForSessionTopic;
	}
	public void setFollowupForSessionTopic(String followupForSessionTopic) {
		this.followupForSessionTopic = followupForSessionTopic;
	}
	
}
