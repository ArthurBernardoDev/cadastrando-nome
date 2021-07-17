package com.arthur.javamongodb.services;


import java.util.List;
import java.util.Optional;

import com.arthur.javamongodb.services.exception.ObjectNotFoundException;
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

		public User findById(String id) {
			Optional<User> obj = repo.findById(id);
			return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}

		public User insert(User obj) {
			return repo.insert(obj);
		}


}
