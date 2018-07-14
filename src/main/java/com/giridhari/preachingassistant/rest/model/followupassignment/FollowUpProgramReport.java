package com.giridhari.preachingassistant.rest.model.followupassignment;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class FollowUpProgramReport {
	private long programId;
	private String programName;
	private long totalParticipants;
	private long followUpAssignedParticipants;
	private long percentageCompletionOfFollowup;
	
	private Date currentFollowUpSessionDate;
	private String currentFollowUpSessionTopic;
	
	private HashMap<Long, Long> followUpCounts;
	private HashMap<String, Long> responseCounts;
	private ArrayList<FollowUpVolunteerReport> volunteerReportList;

	public long getProgramId() {
		return programId;
	}

	public void setProgramId(long programId) {
		this.programId = programId;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public long getTotalParticipants() {
		return totalParticipants;
	}

	public void setTotalParticipants(long totalParticipants) {
		this.totalParticipants = totalParticipants;
	}

	public long getFollowUpAssignedParticipants() {
		return followUpAssignedParticipants;
	}

	public void setFollowUpAssignedParticipants(long followUpAssignedParticipants) {
		this.followUpAssignedParticipants = followUpAssignedParticipants;
	}

	public long getPercentageCompletionOfFollowup() {
		return percentageCompletionOfFollowup;
	}

	public void setPercentageCompletionOfFollowup(long percentageCompletionOfFollowup) {
		this.percentageCompletionOfFollowup = percentageCompletionOfFollowup;
	}

	public Date getCurrentFollowUpSessionDate() {
		return currentFollowUpSessionDate;
	}

	public void setCurrentFollowUpSessionDate(Date currentFollowUpSessionDate) {
		this.currentFollowUpSessionDate = currentFollowUpSessionDate;
	}

	public String getCurrentFollowUpSessionTopic() {
		return currentFollowUpSessionTopic;
	}

	public void setCurrentFollowUpSessionTopic(String currentFollowUpSessionTopic) {
		this.currentFollowUpSessionTopic = currentFollowUpSessionTopic;
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

	public ArrayList<FollowUpVolunteerReport> getVolunteerReportList() {
		return volunteerReportList;
	}

	public void setVolunteerReportList(ArrayList<FollowUpVolunteerReport> volunteerReportList) {
		this.volunteerReportList = volunteerReportList;
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
	
	public void incrementResponseCount(String response) {
		if (this.responseCounts == null) {
			this.responseCounts = new HashMap<String, Long>();
		}
		if (this.responseCounts.get(response) == null) {
			this.responseCounts.put(response, new Long(0));
		}
		this.responseCounts.put(response, this.responseCounts.get(response)+1);
	}
	
	public void addVolunteerReport(FollowUpVolunteerReport followUpVolunteerReport) {
		if (this.volunteerReportList == null) {
			this.volunteerReportList = new ArrayList<FollowUpVolunteerReport>();
		}
		this.volunteerReportList.add(followUpVolunteerReport);
	}
}
