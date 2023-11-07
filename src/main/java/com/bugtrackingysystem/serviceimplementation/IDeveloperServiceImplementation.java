package com.bugtrackingysystem.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.DeveloperDTO;
import com.bugtrackingsystem.dto.ProjectDTO;
import com.bugtrackingsystem.service.IDeveloperService;
import com.bugtrackingysystem.repository.DeveloperRepository;


@Service
public class IDeveloperServiceImplementation implements IDeveloperService{

	
	@Autowired
	
	private DeveloperRepository devrepository ;
	@Override
	public String addDeveloper(DeveloperDTO developer) {
		// TODO Auto-generated method stub
	devrepository.addDeveloper(developer);
		return "Developer Added succesfully";
	}

	@Override
	public String updateDeveloper(DeveloperDTO developer) {
		// TODO Auto-generated method stub
		devrepository.updateDeveloper(developer);
		return "Developer updated  succesfully";
	}

	@Override
	public DeveloperDTO getDeveloperById(Integer devId) {
		// TODO Auto-generated method stub
		return devrepository.getDeveloperById(devId);
	}

	@Override
	public List<DeveloperDTO> getAllDevelopers() {
		// TODO Auto-generated method stub
		return devrepository.getAllDevelopers();
		}

	@Override
	public List<ProjectDTO> getProjectByDevId(Integer devId) {
		// TODO Auto-generated method stub
		return devrepository.getProjectByDevId(devId);
	}

}
