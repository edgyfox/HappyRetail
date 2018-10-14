package com.happyretail.service;

import java.util.List;

import com.happyretail.model.CustomerBean;
import com.happyretail.util.Credentials;

/**
 * Provides Service interface related to CustomerBean
 * @author Argha Nandan
 *
 */
public interface CustomerService {

	List<CustomerBean> getRepositoryCustomers();

	void addRepositoryCustomer(CustomerBean customerBean);
	
	boolean exists(Credentials credentials);
	
	CustomerBean getCustomerByCredentials(Credentials credentials);

}
