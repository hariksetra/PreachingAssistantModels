package com.giridhari.preachingassistant.rest.model.programsession;

import java.util.Date;

import com.giridhari.preachingassistant.rest.model.RequestEntity;

public class ProgramSessionDetailRequestEntity extends RequestEntity{

	private Long id;
	private Long programId;
	private Date sessionDate;
	private String topic;
	
	
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
	public Date getSessionDate() {
		return sessionDate;
	}
	public void setSessionDate(Date sessionDate) {
		this.sessionDate = sessionDate;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}	
}
