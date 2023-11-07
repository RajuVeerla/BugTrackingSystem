package com.bugtrackingsystem.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.print.attribute.standard.Severity;

import com.bugtrackingsystem.util.BugStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Bugs")
public class Bug {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bid")
	private Integer bugId;
	
	@Column(name="bTitle")
	private String bugTitle;
	
	@Column(name="bdescription")
	private String bugDescription;
	
	@Column(name="severity")
	private Severity severity;
	
	@Column(name="createdBy")
	private TestEngineer createdBy;
	
	@Column(name="assignTo")
	private Developer assignTo;
	
	@Column(name="status")
	private BugStatus status;
	
	@Column(name="startDate")
	private LocalDate startDate;
	
	@Column(name="lastUpdatedDate")
	private LocalDate lastUpdatedDate;
	
	@Column(name="project")
	private Project project;

}
