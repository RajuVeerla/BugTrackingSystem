package com.bugtrackingsystem.dto;





import java.time.LocalDate;

import com.bugtrackingsystem.util.BugStatus;
import com.bugtrackingsystem.util.Severity;

public class BugDTO {

	private Integer bugId;
	private String bugTitle;
	private String bugDescription;
	private Severity severity;
	private TestEngineerDTO createdBy;
	private DeveloperDTO assignTo;
	private BugStatus status;
	private LocalDate startDate;
	private LocalDate lastUpdatedDate;
	private ProjectDTO project;
	
	
	public BugDTO() {}
	
	
	
	public BugDTO(Integer bugId, String bugTitle, String bugDescription, Severity severity, TestEngineerDTO createdBy,
			DeveloperDTO assignTo, BugStatus status, LocalDate startDate, LocalDate lastUpdatedDate,
			ProjectDTO project) {
		super();
		this.bugId = bugId;
		this.bugTitle = bugTitle;
		this.bugDescription = bugDescription;
		this.severity = severity;
		this.createdBy = createdBy;
		this.assignTo = assignTo;
		this.status = status;
		this.startDate = startDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.project = project;
	}
	public Integer getBugId() {
		return bugId;
	}
	public void setBugId(Integer bugId) {
		this.bugId = bugId;
	}
	public String getBugTitle() {
		return bugTitle;
	}
	public void setBugTitle(String bugTitle) {
		this.bugTitle = bugTitle;
	}
	public String getBugDescription() {
		return bugDescription;
	}
	public void setBugDescription(String bugDescription) {
		this.bugDescription = bugDescription;
	}
	public Severity getSeverity() {
		return severity;
	}
	public void setSeverity(Severity severity) {
		this.severity = severity;
	}
	public TestEngineerDTO getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(TestEngineerDTO createdBy) {
		this.createdBy = createdBy;
	}
	public DeveloperDTO getAssignTo() {
		return assignTo;
	}
	public void setAssignTo(DeveloperDTO assignTo) {
		this.assignTo = assignTo;
	}
	public BugStatus getStatus() {
		return status;
	}
	public void setStatus(BugStatus status) {
		this.status = status;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(LocalDate lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public ProjectDTO getProject() {
		return project;
	}
	public void setProject(ProjectDTO project) {
		this.project = project;
	}



	public BugDTO orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}



	
	

}
