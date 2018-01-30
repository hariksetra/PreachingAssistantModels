package com.giridhari.preachingassistant.model;

public enum Response {
	
	CALL_AGAIN("CALL AGAIN"),
	COMING("COMING"),
	DOUBTFUL("DOUBTFUL"),
	NOT_COMING("NOT COMING"),
	WRONG_NUMBER("WRONG NUMBER"),
	TRAVELLING_OUTSTATION("Out of town"),
	PERMANENTLY_SHIFTED("PERMANENTLY SHIFTED"),
	REMOVE_ME("REMOVE ME");
	
	private final String response;
	
	private Response(String response) {
		this.response = response;
	}
	
	@Override
	public String toString() {
		return response;
	}
	
}