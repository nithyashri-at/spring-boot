package com.atn.resource.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atn.resource.model.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer>{

}
