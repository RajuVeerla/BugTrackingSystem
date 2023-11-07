package com.bugtrackingsystem.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Developer")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Developer extends User{
    @Id
	@Column(name="dname")
	private String devName;
	
	@Column(name="dskill")
	private String devSkill;
	
	@OneToMany
	private List<Project> project;

}
