package com.onlineportal.customers.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlineportal.customers.entity.Customers;
import com.onlineportal.customers.service.CustomersService;

@RestController
@Table(name="customers", schema="customer_schema")
public class CustomersController {

	@Autowired
	CustomersService customerService;

	@RequestMapping("/customers")
	@CrossOrigin(origins = "http://localhost:3000")
	public List<Customers> getAllCustomers() {

		return customerService.getAllCustomers();
	}

	@RequestMapping("/customers/{id}")
	@CrossOrigin(origins = "http://localhost:3000")
	public Optional<Customers> getCustomer(@PathVariable("id") String id) {

		return customerService.getCustomer(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/customers")
	@CrossOrigin(origins = "http://localhost:3000")
	public void addCustomer(@RequestBody Customers newCustomer) {
		
		
		System.out.println("Add Customer");
		customerService.addCustomer(newCustomer);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/customers/{id}")
	@CrossOrigin(origins = "http://localhost:3000")
	public void deleteCustomer(@PathVariable("id") String id) {

		customerService.deleteCustomer(id);
	}
}
