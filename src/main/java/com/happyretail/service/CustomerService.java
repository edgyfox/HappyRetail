package com.happyretail.service;

import java.util.List;

import com.happyretail.model.CustomerBean;

/**
 * Provides Service interface related to CustomerBean
 * @author Argha Nandan
 *
 */
public interface CustomerService {
	/**
	 * Fetch all customers
	 * @return CustomerBean List
	 */
	List<CustomerBean> getCustomers();
	
	/**
	 * Add Customerbean to DB
	 * @param customerBean
	 * @return success status
	 */
	boolean addCustomer(CustomerBean customerBean);
	
	List<CustomerBean> getRepositoryCustomers();
	
	void addRepositoryCustomer(CustomerBean customerBean);

}
