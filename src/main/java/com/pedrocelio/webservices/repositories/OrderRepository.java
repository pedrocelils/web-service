package com.pedrocelio.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrocelio.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
