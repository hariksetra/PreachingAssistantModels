package com.giridhari.preachingassistant.rest.model.useraccount;

import com.giridhari.preachingassistant.rest.model.ResponseEntity;

public class UserLoginResponseEntity extends ResponseEntity{

	private long devoteeId;
	private String devoteeName;
	private String role;
	
	public long getDevoteeId() {
		return devoteeId;
	}
	
	public void setDevoteeId(long devoteeId) {
		this.devoteeId = devoteeId;
	}
	
	public String getDevoteeName() {
		return devoteeName;
	}
	
	public void setDevoteeName(String devoteeName) {
		this.devoteeName = devoteeName;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
}
