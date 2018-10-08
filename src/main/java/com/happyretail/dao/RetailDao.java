package com.happyretail.dao;

import java.util.List;

import com.happyretail.model.CustomerBean;
import com.happyretail.model.ProductBean;

/**
 * Provides common DAO methods for CustomerBean and ProductBean
 * @author Argha Nandan
 *
 */
public interface RetailDao {
	/**
	 * get all products details
	 * @return ProductBean List 
	 */
	List<ProductBean> getProducts();
	
	/**
	 * Fetch product by ID
	 * @param productBean
	 * @return ProductBean
	 */
	ProductBean getProductById(ProductBean productBean);
	
	/**
	 * Insert product
	 * @param productBean
	 * @return number of rows affected
	 */
	int insertProduct(ProductBean productBean);
	
	/**
	 * Fetch all customers
	 * @return CustomerBean List
	 */
	List<CustomerBean> getCustomers();
	
	/**
	 * Insert customer
	 * @param customerBean
	 * @return number of rows affected
	 */
	int insertCustomer(CustomerBean customerBean);
}
