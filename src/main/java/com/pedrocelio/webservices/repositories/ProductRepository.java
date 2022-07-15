package com.pedrocelio.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrocelio.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
