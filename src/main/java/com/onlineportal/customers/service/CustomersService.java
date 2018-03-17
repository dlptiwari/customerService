package com.onlineportal.customers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.onlineportal.customers.entity.Customers;
import com.onlineportal.customers.repository.CustomerRepository;

@Service
public class CustomersService {

	@Autowired
	CustomerRepository custmerRepository;

	public List<Customers> getAllCustomers() {

		return custmerRepository.findAll();
	}

	public Optional<Customers> getCustomer(@PathVariable("id") String id) {

		return custmerRepository.findById(Long.parseLong(id));
	}

	public void addCustomer(@RequestBody Customers newCustomer) {

		custmerRepository.save(newCustomer);
	}

	public void deleteCustomer(String id) {

		custmerRepository.deleteById(Long.parseLong(id));
	}
}
