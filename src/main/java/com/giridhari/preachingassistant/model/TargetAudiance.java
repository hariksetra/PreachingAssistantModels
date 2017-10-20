package com.giridhari.preachingassistant.model;

public enum TargetAudiance {
	YOUTH_BOYS("Youth Boys"),
	YOUTH_GIRLS("Youth Girls"),
	YOUTH("Youth"),
	VAISHNAVI("Vaishnavi"),
	CONGREGATION("Congregation"),
	ALL("Generic Public Program");
	
	private String targetAudiance;
	
	private TargetAudiance(String targetAudiance) {
		this.targetAudiance = targetAudiance;
	}
	
	@Override
	public String toString() {
		return this.targetAudiance;
	}
}
