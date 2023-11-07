package com.bugtrackingsystem.serviceimplementation;

import org.aspectj.weaver.IUnwovenClassFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.UserDTO;
import com.bugtrackingsystem.repository.UserRepository;
import com.bugtrackingsystem.service.IUserService;


@Service
public class IUserImplementation implements IUserService{
    @Autowired
    UserRepository userRepository;
	@Override
	public String registerUser(UserDTO user) {
		// TODO Auto-generated method stub
		  userRepository.save(user);
		  return "user registered successfully";
	}

	@Override
	public String signIn(String userName, String password) {
		// TODO Auto-generated method stub
		userRepository.signIn(userName, password);
		return "user signin succesfull";
	}

	@Override
	public String signOut() {
		// TODO Auto-generated method stub
		return userRepository.signOut();
	}}