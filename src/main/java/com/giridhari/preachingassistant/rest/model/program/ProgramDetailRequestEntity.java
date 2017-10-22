package com.giridhari.preachingassistant.rest.model.program;


import com.giridhari.preachingassistant.model.ProgramType;
import com.giridhari.preachingassistant.model.TargetAudience;
import com.giridhari.preachingassistant.rest.model.RequestEntity;

public class ProgramDetailRequestEntity extends RequestEntity{
	private Long id;
	private String name;
	private Long mentorId;
	private Long parentYatraId;
	private String description;
	private String address;
	private String mapLocation;
	private ProgramType type;
	private TargetAudience targetAudience;
	private String followupDescription;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMentorId() {
		return mentorId;
	}
	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}
	public Long getParentYatraId() {
		return parentYatraId;
	}
	public void setParentYatraId(Long parentYatraId) {
		this.parentYatraId = parentYatraId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMapLocation() {
		return mapLocation;
	}
	public void setMapLocation(String mapLocation) {
		this.mapLocation = mapLocation;
	}
	public ProgramType getType() {
		return type;
	}
	public void setType(ProgramType type) {
		this.type = type;
	}
	public TargetAudience getTargetAudience() {
		return targetAudience;
	}
	public void setTargetAudience(TargetAudience targetAudience) {
		this.targetAudience = targetAudience;
	}
	public String getFollowupDescription() {
		return followupDescription;
	}
	public void setFollowupDescription(String followupDescription) {
		this.followupDescription = followupDescription;
	}
	
}
