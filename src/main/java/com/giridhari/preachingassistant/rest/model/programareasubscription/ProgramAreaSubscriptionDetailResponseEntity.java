package com.giridhari.preachingassistant.rest.model.programareasubscription;

import com.giridhari.preachingassistant.model.CountryCode;
import com.giridhari.preachingassistant.rest.model.ResponseEntity;

public class ProgramAreaSubscriptionDetailResponseEntity extends ResponseEntity{

	private Long id;
	private Long programId;
	private CountryCode countryCode;
	private String zipPostalCode;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProgramId() {
		return programId;
	}
	public void setProgramId(Long programId) {
		this.programId = programId;
	}
	public CountryCode getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(CountryCode countryCode) {
		this.countryCode = countryCode;
	}
	public String getZipPostalCode() {
		return zipPostalCode;
	}
	public void setZipPostalCode(String zipPostalCode) {
		this.zipPostalCode = zipPostalCode;
	}
	
	
}
