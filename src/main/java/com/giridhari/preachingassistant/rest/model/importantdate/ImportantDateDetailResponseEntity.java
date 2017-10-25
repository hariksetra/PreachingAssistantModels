package com.giridhari.preachingassistant.rest.model.importantdate;

import java.util.Date;

import com.giridhari.preachingassistant.rest.model.ResponseEntity;

public class ImportantDateDetailResponseEntity extends ResponseEntity{

	private Long id;
	private Long devoteeId;
	private String significance;
	private Date date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDevoteeId() {
		return devoteeId;
	}
	public void setDevoteeId(Long devoteeId) {
		this.devoteeId = devoteeId;
	}
	public String getSignificance() {
		return significance;
	}
	public void setSignificance(String significance) {
		this.significance = significance;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
