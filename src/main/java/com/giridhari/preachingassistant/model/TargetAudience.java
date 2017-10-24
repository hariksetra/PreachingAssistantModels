package com.giridhari.preachingassistant.model;

public enum TargetAudience {
	YOUTH_BOYS("Youth Boys"),
	YOUTH_GIRLS("Youth Girls"),
	YOUTH("Youth"),
	VAISHNAVI("Vaishnavi"),
	CONGREGATION("Congregation"),
	ALL("Generic Public Program");
	
	private String targetAudience;
	
	private TargetAudience(String targetAudience) {
		this.targetAudience = targetAudience;
	}
	
	@Override
	public String toString() {
		return this.targetAudience;
	}
}
