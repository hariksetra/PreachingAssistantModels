package com.giridhari.preachingassistant.model;

public enum TargetAudience {
	YOUTH_BOYS("Youth Boys"),
	YOUTH_GIRLS("Youth Girls"),
	YOUTH("Youth"),
	VAISHNAVI("Vaishnavi"),
	CONGREGATION("Congregation"),
	ALL("Generic Public Program");
	
	private String targetAudiance;
	
	private TargetAudience(String targetAudiance) {
		this.targetAudiance = targetAudiance;
	}
	
	@Override
	public String toString() {
		return this.targetAudiance;
	}
}
