package com.pedrocelio.webservices.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.pedrocelio.webservices.entities.Tb_User;
import com.pedrocelio.webservices.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		Tb_User u1 = new Tb_User(null,"Maria","maria@gmail.com","84954989558","123456");
		Tb_User u2 = new Tb_User(null,"Alex","alex@gmail.com","231626528","123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));

	}
}
