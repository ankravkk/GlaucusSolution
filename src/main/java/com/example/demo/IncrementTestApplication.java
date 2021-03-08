package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IncrementTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncrementTestApplication.class, args);
		System.out.println("Server Started");
	}

}
