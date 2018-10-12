package com.happyretail.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	 * Return all products belonging to particular category
	 * @param cat
	 * @return ProductBean List
	 */
	@GetMapping(value=RestURIConstants.GET_PRODUCTS_BY_CAT)
	public @ResponseBody List<ProductBean> showProductsByCat(@PathVariable("cat") String cat)
	{
		ProductBean productBean = new ProductBean();
		productBean.setProdCat(cat);
		return productService.getProductByCat(productBean);
	}
	
	/**
	 * Return all products belonging to particular gender
	 * @param gender
	 * @return ProductBean List
	 */
	@GetMapping(value=RestURIConstants.GET_PRODUCTS_BY_GENDER)
	public @ResponseBody List<ProductBean> showProductsByGender(@PathVariable("gender") String gender)
	{
		ProductBean productBean = new ProductBean();
		productBean.setProdGender(gender);
		return productService.getProductByGender(productBean);
	}
	
	/**
	 * Return all products by name
	 * @param name
	 * @return ProductBean List
	 */
	@GetMapping(value=RestURIConstants.GET_PRODUCTS_BY_NAME)
	public @ResponseBody List<ProductBean> showProductsByName(@PathVariable("name") String name)
	{
		ProductBean productBean = new ProductBean();
		productBean.setProdName(name);
		return productService.getProductByName(productBean);
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
