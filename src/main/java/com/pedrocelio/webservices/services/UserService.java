package com.pedrocelio.webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrocelio.webservices.entities.Tb_User;
import com.pedrocelio.webservices.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<Tb_User> findAll(){
		return repository.findAll();
	}
	
	public Tb_User findById(Long id) {
		Optional<Tb_User> obj = repository.findById(id);
		return obj.get();
	}
}
