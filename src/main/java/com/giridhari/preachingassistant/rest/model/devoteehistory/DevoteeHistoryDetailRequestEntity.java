package com.giridhari.preachingassistant.rest.model.devoteehistory;

import java.util.Date;

import com.giridhari.preachingassistant.rest.model.RequestEntity;

public class DevoteeHistoryDetailRequestEntity extends RequestEntity{
	private Long id;
	private Long commentedByDevoteeId;
	private Long ratedDevoteeId;
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
	
	public Long getCommentedByDevoteeId() {
		return commentedByDevoteeId;
	}
	public void setCommentedByDevoteeId(Long commentedByDevoteeId) {
		this.commentedByDevoteeId = commentedByDevoteeId;
	}
	public Long getRatedDevoteeId() {
		return ratedDevoteeId;
	}
	public void setRatedDevoteeId(Long ratedDevoteeId) {
		this.ratedDevoteeId = ratedDevoteeId;
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
