package com.giridhari.preachingassistant.rest.model.programattendance;

import java.util.Date;

import com.giridhari.preachingassistant.rest.model.RequestEntity;

public class ProgramAttendanceDetailRequestEntity extends RequestEntity{

	private Long id;
	private Date attendanceDate;
	private Long programId;
	private Long devoteeId;
	private String topic;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getAttendanceDate() {
		return attendanceDate;
	}
	public void setAttendanceDate(Date attendanceDate) {
		this.attendanceDate = attendanceDate;
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
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	
}
