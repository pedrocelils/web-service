package com.pedrocelio.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrocelio.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
