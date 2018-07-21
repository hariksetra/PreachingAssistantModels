package com.giridhari.preachingassistant.rest.model.capturecontact;

import java.util.Date;

import com.giridhari.preachingassistant.rest.model.RequestEntity;
import com.giridhari.preachingassistant.rest.model.devotee.DevoteeDetailRequestEntity;

public class CaptureContactDetailRequestEntity extends RequestEntity  {
	private Long id;
	private Long capturedById;
	private String introducedAt;
	private Date timestamp;
	private Long programInterestedIn;
	private Integer rating;
	private String introComments;
	private DevoteeDetailRequestEntity capturedDevotee;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	public Long getCapturedById() {
		return capturedById;
	}

	public void setCapturedById(Long capturedById) {
		this.capturedById = capturedById;
	}

	public Date getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getIntroducedAt() {
		return introducedAt;
	}

	public void setIntroducedAt(String introducedAt) {
		this.introducedAt = introducedAt;
	}

	public Long getProgramInterestedIn() {
		return programInterestedIn;
	}

	public void setProgramInterestedIn(Long programInterestedIn) {
		this.programInterestedIn = programInterestedIn;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getIntroComments() {
		return introComments;
	}

	public void setIntroComments(String introComments) {
		this.introComments = introComments;
	}

	public DevoteeDetailRequestEntity getCapturedDevotee() {
		return capturedDevotee;
	}

	public void setCapturedDevotee(DevoteeDetailRequestEntity capturedDevotee) {
		this.capturedDevotee = capturedDevotee;
	}
	
	
}
