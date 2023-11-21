package com.poc.orderservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrderServiceApplication {

	@Value("${user.role}")
	private String role;

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@GetMapping(
			value = "/whoAmI/{username}",
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String whoAmI(@PathVariable("username") String username) {
		return String.format("Hello! You're %s and you'll become a(n) %s...\n", username, role);
	}

}
