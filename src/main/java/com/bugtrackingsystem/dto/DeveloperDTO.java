package com.bugtrackingsystem.dto;

import java.util.List;

public class DeveloperDTO extends UserDTO{

	
	private String devName;
	private String devSkill;
	private List<ProjectDTO> project;
	
	public DeveloperDTO() {}
	
	public DeveloperDTO(String devName, String devSkill, List<ProjectDTO> project) {
		super();
		this.devName = devName;
		this.devSkill = devSkill;
		this.project = project;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getDevSkill() {
		return devSkill;
	}
	public void setDevSkill(String devSkill) {
		this.devSkill = devSkill;
	}
	public List<ProjectDTO> getProject() {
		return project;
	}
	public void setProject(List<ProjectDTO> project) {
		this.project = project;
	}
	
	
	
	
}
