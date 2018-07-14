package com.giridhari.preachingassistant.rest.model.followupassignment;

import java.util.ArrayList;

import com.giridhari.preachingassistant.rest.model.ResponseEntity;

public class FollowUpDashboardReportResponseEntity extends ResponseEntity{
	private ArrayList<FollowUpProgramReport> programReportList;

	
	
	public ArrayList<FollowUpProgramReport> getProgramReportList() {
		return programReportList;
	}



	public void setProgramReportList(ArrayList<FollowUpProgramReport> programReportList) {
		this.programReportList = programReportList;
	}



	public void addProgramReport(FollowUpProgramReport followUpProgramReport) {
		if (this.programReportList == null) {
			this.programReportList = new ArrayList<FollowUpProgramReport>();
		}
		this.programReportList.add(followUpProgramReport);
	}
}
