package com.bugtrackingystems.serviceimplementation;

import org.aspectj.weaver.IUnwovenClassFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugtrackingystems.repository.UserRepository;

@Service
public class IUserImplementation implements IUnwovenClassFile {
     @Autowired
     
     UserRepository userrepository;
	@Override
	public byte[] getBytes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] getClassNameAsChars() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFilename() {
		// TODO Auto-generated method stub
		return null;
	}

}
