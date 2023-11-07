package com.bugtrackingsystem.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="TestEngineer")
public class TestEngineer extends User{
    @Id
	@Column(name="tname")
	private String testerName;
	
	@Column(name="tskill")
	private String testerSkill;
	
	@OneToMany
	private List<Project> project;
}
