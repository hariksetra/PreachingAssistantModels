package com.giridhari.preachingassistant.model;

public enum CountryCode {
	INDIA("India");
	
	private final String countryCode;
	
	private CountryCode(final String countryCode) {
		this.countryCode = countryCode;
	}
	
	@Override
	public String toString() {
		return countryCode;
	}
}
