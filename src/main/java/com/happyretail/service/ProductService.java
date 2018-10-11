package com.happyretail.service;

import java.util.List;

import com.happyretail.model.ProductBean;

/**
 * Provides Service interface related to ProductBean
 * @author Argha Nandan
 *
 */
public interface ProductService {
	/**
	 * Fetch all ProductBeans
	 * @return ProductBean List
	 */
	List<ProductBean> getProducts();
	
	/**
	 * Insert ProductBean to DB
	 * @param productBean
	 * @return insertion status
	 */
	void insertProduct(ProductBean productBean);
}
