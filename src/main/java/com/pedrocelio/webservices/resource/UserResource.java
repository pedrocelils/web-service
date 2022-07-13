package com.pedrocelio.webservices.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrocelio.webservices.entities.Tb_User;
import com.pedrocelio.webservices.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<Tb_User>> findAll() {
		List<Tb_User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Tb_User> findById(@PathVariable Long id) {
		Tb_User obj = service.findById(id);
		return ResponseEntity.ok(obj);
	}
	
	
}
