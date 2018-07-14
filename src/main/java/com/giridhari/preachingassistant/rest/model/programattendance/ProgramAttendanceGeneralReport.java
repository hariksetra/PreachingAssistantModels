package com.giridhari.preachingassistant.rest.model.programattendance;

import java.util.HashMap;
import java.util.List;

import com.giridhari.preachingassistant.rest.model.ResponseEntity;

public class ProgramAttendanceGeneralReport extends ResponseEntity{
	private String programName;
	private List<String> columnNames;
	private List<HashMap<String, String>> reportRows;
	
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public List<String> getColumnNames() {
		return columnNames;
	}
	public void setColumnNames(List<String> columnNames) {
		this.columnNames = columnNames;
	}
	public List<HashMap<String, String>> getReportRows() {
		return reportRows;
	}
	public void setReportRows(List<HashMap<String, String>> reportRows) {
		this.reportRows = reportRows;
	}
	
	public String getRowDataOfColumn(int rowNo, String colName) {
		if (this.reportRows.size() > rowNo) {
			return this.reportRows.get(rowNo).get(colName);
		}
		return null;
	}
}
