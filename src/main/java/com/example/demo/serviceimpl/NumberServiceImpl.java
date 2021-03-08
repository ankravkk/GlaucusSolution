package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.NumberRepo;
import com.example.demo.service.NumberService;

@Service
public class NumberServiceImpl implements NumberService {
	@Autowired
	NumberRepo numRepo;

	@Override
	public void increaseNum() {
		numRepo.increaseNum();
	}

}
