package com.happyretail.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.happyretail.model.CustomerBean;
import com.happyretail.model.ProductBean;
import com.happyretail.service.CustomerService;
import com.happyretail.service.ProductService;
import com.happyretail.util.Credentials;
import com.happyretail.util.ErrorMessage;
import com.happyretail.util.PriceRange;

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
	
	public static final Logger logger = LoggerFactory.getLogger(HappyRetailControllerRest.class);
	
	/**
	 * Return all products
	 * @return ProductBean List
	 */
	@GetMapping(value=RestURIConstants.GET_PRODUCTS)
	public @ResponseBody ResponseEntity<List<ProductBean>> showProducts()
	{
		List<ProductBean> products = productService.getProducts();
		if(products.isEmpty())
		{
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<ProductBean>>(products, HttpStatus.OK);
	}
	
	/**
	 * Insert new product
	 * @param productBean
	 */
	@PostMapping(value=RestURIConstants.ADD_PRODUCT)
	public @ResponseBody void insertProduct(@RequestBody ProductBean productBean)
	{
		productService.insertProduct(productBean);
	}
	
	/**
	 * Insert multiple products
	 * @param productBeans
	 */
	@PostMapping(value=RestURIConstants.ADD_LIST_OF_PRODUCTS)
	public @ResponseBody void insertListOfProducts(@RequestBody List<ProductBean> productBeans)
	{
		for(int i=0;i<productBeans.size();i++)
		{
			this.insertProduct(productBeans.get(i));
		}
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
	 * Return products by price range
	 * @param range
	 * @return ProductBean List
	 */
	@PostMapping(value=RestURIConstants.GET_PRODUCTS_BY_PRICE)
	public @ResponseBody List<ProductBean> showProductsByPrice(@RequestBody PriceRange range)
	{
		logger.info("Fetching products by price range.");
		return productService.getProductsByPrice(range.getMaxRange(), range.getMinRange());
	}
	
	/**
	 * Return products sorted by name
	 * @return ProductBean List
	 */
	@GetMapping(value=RestURIConstants.SORT_PRODUCTS_BY_NAME)
	public @ResponseBody List<ProductBean> sortProductsByName()
	{
		logger.info("Sorting products by name.");
		return productService.sortProductsByName();
	}
	
	/**
	 * Return products sorted by brand
	 * @return ProductBean List
	 */
	@GetMapping(value=RestURIConstants.SORT_PRODUCTS_BY_BRAND)
	public @ResponseBody List<ProductBean> sortProductsByBrand()
	{
		logger.info("Sorting products by brand.");
		return productService.sortProductsByBrand();
	}
	
	/**
	 * Return products sorted by price
	 * @return ProductBean List
	 */
	@GetMapping(value=RestURIConstants.SORT_PRODUCTS_BY_PRICE)
	public @ResponseBody List<ProductBean> sortProductsByPrice()
	{
		logger.info("Sorting products by price.");
		return productService.sortProductsByPrice();
	}
	
	/**
	 * Return all customers
	 * @return CustomerBean List
	 */
	@GetMapping(value=RestURIConstants.GET_CUSTOMERS)
	public @ResponseBody List<CustomerBean> showCustomers()
	{
		logger.info("Fetching customers.");
		return customerService.getRepositoryCustomers();
	}
	
	/**
	 * Insert a customer
	 * @param customerBean
	 */
	@PostMapping(value=RestURIConstants.ADD_CUSTOMER)
	public @ResponseBody void insertCustomer(@RequestBody CustomerBean customerBean)
	{
		customerService.addRepositoryCustomer(customerBean);
	}
	
	/**
	 * Login customer
	 * @param credentials
	 * @return HttpStatus
	 */
	@PostMapping(value=RestURIConstants.LOGIN)
	public @ResponseBody ResponseEntity<ErrorMessage> loginCustomer(@RequestBody Credentials credentials)
	{
		if(!customerService.exists(credentials))
		{
			logger.error("Customer does not exist.");
			logger.info(credentials.toString());
			return new ResponseEntity<ErrorMessage>(new ErrorMessage("Customer does not exist!"),HttpStatus.OK);
		}
		logger.info(credentials.getUsername() + " logged in.");
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	/**
	 * Register customer
	 * @param customerBean
	 * @return HttpStatus
	 */
	@PostMapping(value=RestURIConstants.REGISTER)
	public @ResponseBody ResponseEntity<ErrorMessage> registerCustomer(@RequestBody CustomerBean customerBean)
	{
		Credentials credentials = new Credentials(customerBean.getCustEmail(), customerBean.getCustPass());
		if(customerService.exists(credentials))
		{
			logger.error("Customer already exists.");
			return new ResponseEntity<ErrorMessage>(new ErrorMessage("Customer already exists!"),HttpStatus.CONFLICT);
		}
		this.insertCustomer(customerBean);
		logger.info(customerBean.getCustEmail() + " inserted.");
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
