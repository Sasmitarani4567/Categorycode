package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Demo;
import com.example.demo.service.Demoservice;



public class DemoController {

	
	@Autowired
	private Demoservice demoservice;

	@GetMapping("/FetchNextNumber")
	public List<Demo> getNumber() {
		return demoservice.getAllFetchNumber();
	}

	@GetMapping("/employeeDetails/{categoryCode}")
	public Optional<Demo> getFetchNumberById(@PathVariable(value = "categoryCode") int categoryCode) {
		return demoservice.getfetchNumber(categoryCode);
	}

	@PostMapping("/employeeDetails")
	public String addNumber(@RequestBody Demo demo) {
		demoservice.addNumber(demo);
		return "Number added successfully";
	}
}
