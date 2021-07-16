package com.arthur.javamongodb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.arthur.javamongodb.domain.User;
import com.arthur.javamongodb.repository.UserRepository;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		userRepository.deleteAll();

		User maria = new User(null, "Maria Silva");
		User alex = new User(null, "alex da silva");
		User bob = new User(null, "bob paulo");

		userRepository.saveAll(Arrays.asList(maria, alex, bob));
	}

}
