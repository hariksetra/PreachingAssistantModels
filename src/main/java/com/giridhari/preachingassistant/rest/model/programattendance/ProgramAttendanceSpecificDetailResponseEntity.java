package com.giridhari.preachingassistant.rest.model.programattendance;

import java.util.List;

import com.giridhari.preachingassistant.rest.model.ResponseEntity;
import com.giridhari.preachingassistant.rest.model.devotee.DevoteeOverviewEntity;

public class ProgramAttendanceSpecificDetailResponseEntity extends ResponseEntity{
	private List<ProgramAttendanceId> attendanceId;
	private List<DevoteeOverviewEntity> devoteeList;
	
	public List<ProgramAttendanceId> getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(List<ProgramAttendanceId> attendanceId) {
		this.attendanceId = attendanceId;
	}
	public List<DevoteeOverviewEntity> getDevoteeList() {
		return devoteeList;
	}
	public void setDevoteeList(List<DevoteeOverviewEntity> devoteeList) {
		this.devoteeList = devoteeList;
	}
		
}
