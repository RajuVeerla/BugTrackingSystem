package com.bugtrackingsystem.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Project")
public class Project {
	@Id
	@Column(name="pid")
	private Integer projId;
	
	@Column(name="pname")
	private String projName;
	
	@Column(name="pdescription")
	private String projectDescription;
	
	@Column(name="pstatus")
	private String projStatus;
	
	
	private List<Developer> devList;
	
	
	private List<TestEngineer> testEngList;

}
