package com.bugtrackingystems.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.DeveloperDTO;
import com.bugtrackingsystem.dto.ProjectDTO;
import com.bugtrackingsystem.service.IDeveloperService;
import com.bugtrackingystems.repository.DeveloperRepository;


@Service
public class IDeveloperServiceImplementation implements IDeveloperService{

	
	@Autowired
	
	private DeveloperRepository devrepository ;
	@Override
	public DeveloperDTO addDeveloper(DeveloperDTO developer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeveloperDTO updateDeveloper(DeveloperDTO developer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeveloperDTO getDeveloperById(Integer devId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DeveloperDTO> getAllDevelopers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectDTO> getProjectByDevId(Integer devId) {
		// TODO Auto-generated method stub
		return null;
	}

}
