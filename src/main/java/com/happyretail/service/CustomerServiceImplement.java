package com.happyretail.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happyretail.dao.CustomerRepository;
import com.happyretail.model.CustomerBean;
import com.happyretail.util.Credentials;

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

	@Override
	public boolean exists(Credentials credentials) {
		boolean exists = true;
		List<CustomerBean> customers = new ArrayList<CustomerBean>();
		customerRepository.findByCredentials(credentials.getUsername(), credentials.getPassword()).forEach(customer -> customers.add(customer));
		if(customers.isEmpty())
		{
			exists = false;
		}
		return exists;
	}

	@Override
	public CustomerBean getCustomerByCredentials(Credentials credentials) {
		List<CustomerBean> customers = new ArrayList<CustomerBean>();
		customerRepository.findByCredentials(credentials.getUsername(), credentials.getPassword()).forEach(customer -> customers.add(customer));
		return customers.get(0);
	}
}
