package com.pedrocelio.webservices.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrocelio.webservices.entities.Tb_User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<Tb_User> findAll() {
		Tb_User u = new Tb_User(1L, "Pedro", "pedro@gmail.com", "124521522", "12345678");
		return ResponseEntity.ok().body(u);
	}
}
