package com.happyretail.service;

import java.util.List;

import com.happyretail.model.CustomerBean;

/**
 * Provides Service interface related to CustomerBean
 * @author Argha Nandan
 *
 */
public interface CustomerService {

	List<CustomerBean> getRepositoryCustomers();

	void addRepositoryCustomer(CustomerBean customerBean);

}
