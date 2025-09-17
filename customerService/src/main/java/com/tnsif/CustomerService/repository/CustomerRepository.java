package com.tnsif.CustomerService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.CustomerService.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}