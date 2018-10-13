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
	 * @return productBean List
	 */
	ArrayList<ProductBean> getProductByName(ProductBean productBean);
	
	/**
	 * Fetch products by category
	 * @param productBean
	 * @return productBean List
	 */
	ArrayList<ProductBean> getProductByCat(ProductBean productBean);
	
	/**
	 * Fetch products by gender
	 * @param productBean
	 * @return productBean List
	 */
	ArrayList<ProductBean> getProductByGender(ProductBean productBean);
	
	/**
	 * Fetch products from a price range
	 * @param price1
	 * @param price2
	 * @return productBean List
	 */
	ArrayList<ProductBean> getProductsByPrice(double price1, double price2);
	
	/**
	 * Fetch products sorted by name
	 * @return ProductBean List
	 */
	ArrayList<ProductBean> sortProductsByName();
	
	/**
	 * Fetch products sorted by brand
	 * @return ProductBean List
	 */
	ArrayList<ProductBean> sortProductsByBrand();
	
	/**
	 * Fetch products sorted by Price
	 * @return ProductBean List
	 */
	ArrayList<ProductBean> sortProductsByPrice();
}
