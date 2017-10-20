package com.giridhari.preachingassistant.model;

public enum ProgramType {
	NEW("New"),
	CULTIVATION("Cultivation"),
	DEVOTEES("Devotees"),
	PRIVATE("Private");
	
	private String programType;
	
	private ProgramType(String programType) {
		this.programType = programType;
	}
	
	@Override
	public String toString() {
		return this.programType;
	}
}
