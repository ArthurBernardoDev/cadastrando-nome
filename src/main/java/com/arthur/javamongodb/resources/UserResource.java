package com.arthur.javamongodb.resources;

import java.util.List;
import java.util.stream.Collectors;

import com.arthur.javamongodb.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.arthur.javamongodb.domain.User;
import com.arthur.javamongodb.services.UserService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> findAll() {
		List<User> list = service.findAll();
		List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<UserDTO> findById(@PathVariable String id) {
	User obj = service.findById(id);
	return ResponseEntity.ok().body(new UserDTO(obj));
		
	}
	
		

}
