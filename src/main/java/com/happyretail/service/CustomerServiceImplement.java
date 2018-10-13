package com.happyretail.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happyretail.dao.CustomerRepository;
import com.happyretail.model.CustomerBean;

/**
 * Implements the CustomerService interface
 * @author Argha Nandan
 *
 */
@Service
public class CustomerServiceImplement implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<CustomerBean> getRepositoryCustomers() {
		List<CustomerBean> customers = new ArrayList<CustomerBean>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}

	@Override
	public void addRepositoryCustomer(CustomerBean customerBean) {
		customerRepository.save(customerBean);
		
	}
}
