package com.pedrocelio.webservices.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.pedrocelio.webservices.entities.Category;
import com.pedrocelio.webservices.entities.Order;
import com.pedrocelio.webservices.entities.Product;
import com.pedrocelio.webservices.entities.Tb_User;
import com.pedrocelio.webservices.entities.enums.OrderStatus;
import com.pedrocelio.webservices.repositories.CategoryRepository;
import com.pedrocelio.webservices.repositories.OrderRepository;
import com.pedrocelio.webservices.repositories.ProductRepository;
import com.pedrocelio.webservices.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		Tb_User u1 = new Tb_User(null,"Maria","maria@gmail.com","84954989558","123456");
		Tb_User u2 = new Tb_User(null,"Alex","alex@gmail.com","231626528","123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		Category cat1 = new Category(null, "Veículos");
		Category cat2 = new Category(null, "Frutas");
		Category cat3 = new Category(null, "Eletônica");
		
		Product prod1 = new Product(null, "Celular", "Iphone 13", 15.000, "");
		Product prod2 = new Product(null, "Carro", "Gol", 15.000, "");
		Product prod3 = new Product(null, "Notebook", "Dell", 15.000, "");

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRepository.saveAll(Arrays.asList(prod1, prod2, prod3));
		
		
		prod1.getCategories().add(cat3);
		prod2.getCategories().add(cat1);
		prod3.getCategories().add(cat3);
		
		productRepository.saveAll(Arrays.asList(prod1, prod2, prod3));
		
	}	
}
