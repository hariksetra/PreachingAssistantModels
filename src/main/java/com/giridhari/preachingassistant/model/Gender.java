package com.giridhari.preachingassistant.model;

/**
 * The gender enum
 * 
 * @author shyam
 *
 */
public enum Gender {
	MALE("MALE"),
	FEMALE("FEMALE");
	
	private final String gender;
	
	private Gender(final String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return gender;
	}
}
