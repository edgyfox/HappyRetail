package com.happyretail.service;

import java.util.ArrayList;
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
	
	/**
	 * Fetch products by ID
	 * @param productBean
	 * @return productBean
	 */
	ProductBean getProductById(ProductBean productBean);
	
	/**
	 * Fetch products by name
	 * @param productBean
	 * @return productBean
	 */
	ArrayList<ProductBean> getProductByName(ProductBean productBean);
	
	/**
	 * Fetch products by category
	 * @param productBean
	 * @return productBean
	 */
	ArrayList<ProductBean> getProductByCat(ProductBean productBean);
	
	/**
	 * Fetch products by gender
	 * @param productBean
	 * @return productBean
	 */
	ArrayList<ProductBean> getProductByGender(ProductBean productBean);
}
