package com.hujt.spring.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hujt.spring.annotation.repository.UserRepository;

@Service
public class UserService {
	
	
	private UserRepository userRepository;
	
	@Autowired
	@Qualifier("userRepositoryImpl")
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void add(){
		System.out.println("UserService add...");
		userRepository.save();
	}
}
