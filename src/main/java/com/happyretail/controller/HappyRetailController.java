package com.happyretail.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.happyretail.model.CustomerBean;
import com.happyretail.model.ProductBean;
import com.happyretail.service.CustomerService;
import com.happyretail.service.ProductService;

/**
 * Default-controller with URI mapping = "/"
 * @author Argha Nandan
 *
 */
@Controller
@RequestMapping("/")
public class HappyRetailController {
	
	@Autowired
	ProductService service;
	
	@Autowired
	CustomerService custService;
	
	/**
	 * Redirecting to index.jsp
	 * return view
	 */
	@RequestMapping("/")
	public String redirectToIndex()
	{
		return "index";
	}
	
	/**
	 * Fetch and show all product details in showProducts.jsp
	 * @param model
	 * @return view
	 */
	@RequestMapping(value=RestURIConstants.GET_PRODUCTS)
	public String redirectToProducts(Model model)
	{
		List<ProductBean> products = service.getProducts();
		model.addAttribute("products", products);
		return "showProducts";
	}
	
	/**
	 * Redirect to productForm.jsp to insert new product.
	 * @param model
	 * @return view
	 */
	@RequestMapping(value=RestURIConstants.ADD_PRODUCT)
	public String redirectToNewProductForm(Model model)
	{
		model.addAttribute("product", new ProductBean());
		return "productForm";
	}
	
	/**
	 * Read product form and insert into DB, redirect to "/getProducts" URI.
	 * @param product
	 * @param model
	 * @return view
	 */
	@PostMapping(value="/readForm")
	public String readAndShowProducts(@Valid@ModelAttribute("product") ProductBean product,Model model, Errors errs)
	{
		System.out.println("FUNCTION");
		if(errs.hasErrors())
		{
			System.out.println("ERRORS");
			return "productForm";
		}
		service.insertProduct(product);
		return "redirect:" + RestURIConstants.GET_PRODUCTS;
	}
	
	/**
	 * fetch customers and redirect to showCustomers.jsp
	 * @param model
	 * @return view
	 */
	@RequestMapping(value=RestURIConstants.GET_CUSTOMERS)
	public String redirectToCustomers(Model model)
	{
		List<CustomerBean> customers = custService.getRepositoryCustomers();
		model.addAttribute("customers", customers);
		return "showCustomers";
	}
	
	/**
	 * redirect to addCustomer.jsp to add customer
	 * @param model
	 * @return view
	 */
	@RequestMapping(value=RestURIConstants.ADD_CUSTOMER)
	public String redirectToNewCustomerForm(Model model)
	{
		model.addAttribute("customer",new CustomerBean());
		return "customerForm";
	}
	
	/**
	 * read customer form and redirect to "/getCustomers" URI.
	 * Parameters: CustomerBean object, Model object.
	 * Returns: ModelAndView.
	 */
	@RequestMapping("/readCustomerForm")
	public ModelAndView readAndShowCustomers(@ModelAttribute("customer") CustomerBean customer, Model model)
	{
		custService.addRepositoryCustomer(customer);
		return new ModelAndView("redirect:" + RestURIConstants.GET_CUSTOMERS,"model",model);
	}
}
