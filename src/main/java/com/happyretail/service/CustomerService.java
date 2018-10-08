package com.happyretail.service;

import java.util.List;

import com.happyretail.model.CustomerBean;

public interface CustomerService {
	List<CustomerBean> getCustomers();
	boolean addCustomer(CustomerBean cb);

}
