package com.giridhari.preachingassistant.rest.model.devoteehistory;

import java.util.Date;

import com.giridhari.preachingassistant.model.Response;
import com.giridhari.preachingassistant.rest.model.ResponseEntity;

public class DevoteeHistoryDetailResponseEntity extends ResponseEntity{
	private Long id;
	private Long commentedByDevoteeId;
	private String commentedByDevoteeName;
	private Long ratedDevoteeId;
	private String ratedDevoteeName;
	private Integer rating;
	private Response response;
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
	
	public String getCommentedByDevoteeName() {
		return commentedByDevoteeName;
	}

	public void setCommentedByDevoteeName(String commentedByDevoteeName) {
		this.commentedByDevoteeName = commentedByDevoteeName;
	}

	public Long getRatedDevoteeId() {
		return ratedDevoteeId;
	}
	
	public void setRatedDevoteeId(Long ratedDevoteeId) {
		this.ratedDevoteeId = ratedDevoteeId;
	}
	
	public String getRatedDevoteeName() {
		return ratedDevoteeName;
	}

	public void setRatedDevoteeName(String ratedDevoteeName) {
		this.ratedDevoteeName = ratedDevoteeName;
	}

	public Integer getRating() {
		return rating;
	}
	
	public void setRating(Integer rating) {
		this.rating = rating;
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
	
	public Date getTimeStamp() {
		return timeStamp;
	}
	
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
}
