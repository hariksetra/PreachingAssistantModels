package com.giridhari.preachingassistant.model;

/**
 * The income scale enum.
 * @author shyam
 *
 */
public enum IncomeScale {
	
	HIGH("HIGH"),
	MID("MID"),
	LOW("LOW");
	
	private String scale;
	
	private IncomeScale(String scale) {
		this.scale = scale;
	}
	
	@Override
	public String toString() {
		return this.scale;
	}

}
