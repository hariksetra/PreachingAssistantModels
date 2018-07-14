package com.giridhari.preachingassistant.rest.model.useraccount;

/**
 * Used to represent request body for create user account
 * api
 */
public class CreateUserAccountRequestEntity {
	private String email;
	private long devoteeId;
	private String type;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getDevoteeId() {
		return devoteeId;
	}
	public void setDevoteeId(long devoteeId) {
		this.devoteeId = devoteeId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
