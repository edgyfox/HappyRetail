package com.happyretail.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happyretail.dao.CustomerRepository;
import com.happyretail.dao.RetailDao;
import com.happyretail.model.CustomerBean;

/**
 * Implements the CustomerService interface
 * @author Argha Nandan
 *
 */
@Service
public class CustomerServiceImplement implements CustomerService {

	@Autowired
	RetailDao dao;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public List<CustomerBean> getCustomers() {
		return dao.getCustomers();
	}

	@Override
	public boolean addCustomer(CustomerBean customerBean) {
		int success = dao.insertCustomer(customerBean);
		if(success==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

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
