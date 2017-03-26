package com.giridhari.preachingassistant.rest.model.devotee;

import java.util.Date;

import com.giridhari.preachingassistant.rest.model.ResponseEntity;

/**
 * Used to hold overview of a devotee. Useful when showing a list of devotees.
 * 
 * @author shyam
 *
 */
public class DevoteeOverviewEntity extends ResponseEntity {
	
	private Long id;
	private String name;
	private String phone;
	private String preferredLanguage;
	private Date introDate;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPreferredLanguage() {
		return preferredLanguage;
	}
	
	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}
	
	public Date getIntroDate() {
		return introDate;
	}
	
	public void setIntroDate(Date introDate) {
		this.introDate = introDate;
	}
	
}
