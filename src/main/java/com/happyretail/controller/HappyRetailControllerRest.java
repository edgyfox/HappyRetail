package com.happyretail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.happyretail.model.CustomerBean;
import com.happyretail.model.ProductBean;
import com.happyretail.service.CustomerService;
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
	
	@Autowired
	CustomerService customerService;
	
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
		System.out.println("Insert new product...");
		productService.insertProduct(productBean);
	}
	
	/**
	 * Return all customers
	 * @return CustomerBean List
	 */
	@GetMapping(value=RestURIConstants.GET_CUSTOMERS)
	public @ResponseBody List<CustomerBean> showCustomers()
	{
		return customerService.getCustomers();
	}
	
	@PostMapping(value=RestURIConstants.ADD_CUSTOMER)
	public @ResponseBody void insertCustomer(@RequestBody CustomerBean customerBean)
	{
		System.out.println("Inserting new customer...");
		customerService.addCustomer(customerBean);
	}
}
