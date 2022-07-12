package com.pedrocelio.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrocelio.webservices.entities.Tb_User;

public interface UserRepository extends JpaRepository<Tb_User, Long> {

	
}
