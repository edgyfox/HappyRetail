package com.happyretail.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.happyretail.model.ProductBean;
import com.happyretail.service.ProductService;

@Controller("/")
public class HappyRetailController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/")
	public String redirectToIndex()
	{
		return "index";
	}
	
	@RequestMapping(value="/showProducts")
	public String redirectToProducts(Model model)
	{
		List<ProductBean> products = service.getProducts();
		model.addAttribute("products", products);
		return "showProducts";
	}
	
	@RequestMapping(value="/addProduct")
	public String redirectToNewProductForm(Model model)
	{
		model.addAttribute("product", new ProductBean());
		return "productForm";
	}
	
	@PostMapping(value="/readForm")
	public ModelAndView readAndShowProducts(@ModelAttribute("product") ProductBean product,Model model)
	{
		service.insertProduct(product);
		return new ModelAndView("redirect:/showProducts", "model", model);
	}
}
