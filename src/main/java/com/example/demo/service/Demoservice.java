package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Demo;
import com.example.demo.repository.Demorepository;

public class Demoservice {

	@Autowired
	private Demorepository demorepository;

	public List<Demo> getAllFetchNumber() {
		List<Demo> demo = (List<Demo>) demorepository.findAll();
		return demo;
	}

	public Optional<Demo> getfetchNumber(int categoryCode) {
		return demorepository.findById((long) categoryCode);
	}

	
	public void addNumber(Demo demo) {
		demorepository.save(demo);
	}
}
