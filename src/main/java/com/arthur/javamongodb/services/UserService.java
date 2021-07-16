package com.arthur.javamongodb.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.javamongodb.domain.User;
import com.arthur.javamongodb.repository.UserRepository;

@Service
public class UserService {

		@Autowired
		private UserRepository repo;
		
		public List<User> findAll() {
			return repo.findAll();
		}
	
		
}
