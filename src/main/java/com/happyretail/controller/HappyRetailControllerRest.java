package com.happyretail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.happyretail.model.ProductBean;
import com.happyretail.service.ProductService;

@RestController
@RequestMapping(value="/rest")
public class HappyRetailControllerRest {

	ProductService productService;
	
	@GetMapping(value="/getContacts")
	public @ResponseBody ProductBean testRest1()
	{
		ProductBean productBean = new ProductBean(123, "Mobile", "Asus", "Zenfone", 14999);
		return productBean;
	}
}
