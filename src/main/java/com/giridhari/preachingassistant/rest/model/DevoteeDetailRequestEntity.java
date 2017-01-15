package com.giridhari.preachingassistant.rest.model;

import java.util.Date;

import com.giridhari.preachingassistant.model.Gender;
import com.giridhari.preachingassistant.model.IncomeScale;
import com.giridhari.preachingassistant.model.MaritalStatus;

/**
 * 
 * @author shyam
 *
 */
public class DevoteeDetailRequestEntity extends RequestEntity {
	
	private String legalName;
	private String initiatedName;
	private Date dob;
	private Gender gender;
	private MaritalStatus maritalStatus;
	private String familyInfo;
	private String education;
	private String occupation;
	private String organization;
	private String designation;
	private IncomeScale incomeScale;
	private String smsPhone;
	private Date introDate;
	private String preferredLanguage;
	private String description;
	private Long capturedBy;
	private String area;
	private String address;
	private String email;
	private String capturedFor;
	private String booksRead;
	private Integer monthlyContribution;
	private String sikshaLevel;
	
	public String getLegalName() {
		return legalName;
	}
	
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	
	public String getInitiatedName() {
		return initiatedName;
	}
	
	public void setInitiatedName(String initiatedName) {
		this.initiatedName = initiatedName;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}
	
	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	public String getFamilyInfo() {
		return familyInfo;
	}
	
	public void setFamilyInfo(String familyInfo) {
		this.familyInfo = familyInfo;
	}
	
	public String getEducation() {
		return education;
	}
	
	public void setEducation(String education) {
		this.education = education;
	}
	
	public String getOccupation() {
		return occupation;
	}
	
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public String getOrganization() {
		return organization;
	}
	
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public IncomeScale getIncomeScale() {
		return incomeScale;
	}
	
	public void setIncomeScale(IncomeScale incomeScale) {
		this.incomeScale = incomeScale;
	}
	
	public String getSmsPhone() {
		return smsPhone;
	}
	
	public void setSmsPhone(String smsPhone) {
		this.smsPhone = smsPhone;
	}
	
	public Date getIntroDate() {
		return introDate;
	}
	
	public void setIntroDate(Date introDate) {
		this.introDate = introDate;
	}
	
	public String getPreferredLanguage() {
		return preferredLanguage;
	}
	
	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Long getCapturedBy() {
		return capturedBy;
	}
	
	public void setCapturedBy(Long capturedBy) {
		this.capturedBy = capturedBy;
	}
	
	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCapturedFor() {
		return capturedFor;
	}
	
	public void setCapturedFor(String capturedFor) {
		this.capturedFor = capturedFor;
	}
	
	public String getBooksRead() {
		return booksRead;
	}
	
	public void setBooksRead(String booksRead) {
		this.booksRead = booksRead;
	}
	
	public Integer getMonthlyContribution() {
		return monthlyContribution;
	}
	
	public void setMonthlyContribution(Integer monthlyContribution) {
		this.monthlyContribution = monthlyContribution;
	}
	
	public String getSikshaLevel() {
		return sikshaLevel;
	}
	
	public void setSikshaLevel(String sikshaLevel) {
		this.sikshaLevel = sikshaLevel;
	}
	
}
