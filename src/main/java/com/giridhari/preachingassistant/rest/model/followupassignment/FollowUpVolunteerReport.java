package com.giridhari.preachingassistant.rest.model.followupassignment;

import java.util.ArrayList;
import java.util.HashMap;

public class FollowUpVolunteerReport {
	private long volunteerId;
	private String volunteerName;
	private String volunteerPhone;
	private long followUpAssignedParticipants;
	private HashMap<Long, Long> followUpCounts;
	private HashMap<String, Long> responseCounts;
	private long percentageCompletionOfFollowup;
	
	public long getVolunteerId() {
		return volunteerId;
	}

	public void setVolunteerId(long volunteerId) {
		this.volunteerId = volunteerId;
	}

	public String getVolunteerName() {
		return volunteerName;
	}

	public void setVolunteerName(String volunteerName) {
		this.volunteerName = volunteerName;
	}

	public String getVolunteerPhone() {
		return volunteerPhone;
	}

	public void setVolunteerPhone(String volunteerPhone) {
		this.volunteerPhone = volunteerPhone;
	}

	public long getFollowUpAssignedParticipants() {
		return followUpAssignedParticipants;
	}

	public void setFollowUpAssignedParticipants(long followUpAssignedParticipants) {
		this.followUpAssignedParticipants = followUpAssignedParticipants;
	}

	public HashMap<Long, Long> getFollowUpCounts() {
		return followUpCounts;
	}

	public void setFollowUpCounts(HashMap<Long, Long> followUpCounts) {
		this.followUpCounts = followUpCounts;
	}

	public HashMap<String, Long> getResponseCounts() {
		return responseCounts;
	}

	public void setResponseCounts(HashMap<String, Long> responseCounts) {
		this.responseCounts = responseCounts;
	}

	public long getPercentageCompletionOfFollowup() {
		return percentageCompletionOfFollowup;
	}

	public void setPercentageCompletionOfFollowup(long percentageCompletionOfFollowup) {
		this.percentageCompletionOfFollowup = percentageCompletionOfFollowup;
	}

	public void incrementResponseCount(String response) {
		if (this.responseCounts == null) {
			this.responseCounts = new HashMap<String, Long>();
		}
		if (this.responseCounts.get(response) == null) {
			this.responseCounts.put(response, new Long(0));
		}
		this.responseCounts.put(response, this.responseCounts.get(response)+1);
	}
	
	public void incrementFollowUpCount(Long percentageScale) {
		if (this.followUpCounts == null) {
			this.followUpCounts = new HashMap<Long,Long>();
		}
		if (this.followUpCounts.get(percentageScale) == null) {
			this.followUpCounts.put(percentageScale, new Long(0));
		}
		this.followUpCounts.put(percentageScale, this.followUpCounts.get(percentageScale)+1);
	}
}
