package com.bugtrackingsystem.dto;

import java.util.List;

import lombok.Data;


@Data
public class ProjectDTO {
	private Integer projId;
	private String projName;
	private String projectDescription;
	private String projStatus;
	private List<DeveloperDTO> devList;
	private List<TestEngineerDTO> testEngList;
}
