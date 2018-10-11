package com.happyretail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.happyretail.model.ProductBean;
import com.happyretail.service.ProductService;

/**
 * Rest Controller with URI mapping "/rest"
 * @author Argha Nandan
 *
 */
@RestController
@RequestMapping(value="/rest")
public class HappyRetailControllerRest {

	@Autowired
	ProductService productService;
	
	/**
	 * Return all products
	 * @return ProductBean List
	 */
	@GetMapping(value=RestURIConstants.GET_PRODUCTS)
	public @ResponseBody List<ProductBean> showProducts()
	{
		return productService.getProducts();
	}
	
	/**
	 * Insert new product
	 * @param productBean
	 */
	@PostMapping(value=RestURIConstants.ADD_PRODUCT)
	public @ResponseBody void insertProduct(@RequestBody ProductBean productBean)
	{
		System.out.println("InsertProduct started...");
		productService.insertProduct(productBean);
	}
}
