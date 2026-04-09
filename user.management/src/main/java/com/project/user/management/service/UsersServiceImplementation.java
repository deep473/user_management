package com.project.user.management.service;

import org.springframework.stereotype.Service;

import com.project.user.management.repository.UsersRepository;

@Service
public class UsersServiceImplementation 
						implements UsersService{

	UsersRepository repo;

	public UsersServiceImplementation(UsersRepository repo) {
		super();
		this.repo = repo;
	}
	
}
