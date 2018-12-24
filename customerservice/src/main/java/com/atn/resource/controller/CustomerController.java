package com.atn.resource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atn.resource.model.Customers;
import com.atn.resource.repo.CustomerRepository;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	@Autowired
	CustomerRepository repo;
	
	@GetMapping
	public String getCustomer() {
		return "Hello";
	}
	
	@GetMapping("/all")
	public List<Customers> getAllCustomer() {
		return repo.findAll();
	}
	
	
}
