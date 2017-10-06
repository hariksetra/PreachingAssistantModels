package com.giridhari.preachingassistant.rest.model.devoteehistory;

import java.util.Date;

import com.giridhari.preachingassistant.rest.model.ResponseEntity;

public class DevoteeHistoryDetailResponseEntity extends ResponseEntity{
	private Long id;
	private Long followUpVolunteerId;
	private Long devoteeId;
	private Integer rating;
	private String response;
	private String comment;
	private Date timeStamp;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getFollowUpVolunteerId() {
		return followUpVolunteerId;
	}
	public void setFollowUpVolunteerId(Long followUpVolunteerId) {
		this.followUpVolunteerId = followUpVolunteerId;
	}
	public Long getDevoteeId() {
		return devoteeId;
	}
	public void setDevoteeId(Long devoteeId) {
		this.devoteeId = devoteeId;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
}
