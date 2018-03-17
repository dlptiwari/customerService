package com.onlineportal.customers.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineportal.customers.entity.Customers;


@Transactional
@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long> {

}
