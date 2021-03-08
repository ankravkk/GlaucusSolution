package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.NumberService;

@RestController
public class NIncrementController {
	@Autowired
	NumberService numService;
	
	@GetMapping("/increase")
	void incrementNumber() {
		numService.increaseNum();
	}
}
