package com.happyretail.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happyretail.dao.ProductRepository;
import com.happyretail.dao.RetailDao;
import com.happyretail.model.ProductBean;

/**
 * Implements the ProductService interface
 * @author Argha Nandan
 *
 */
@Service
public class ProductServiceImplement implements ProductService {

	@Autowired
	RetailDao dao;
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<ProductBean> getProducts() {
		ArrayList<ProductBean> products = new ArrayList<>();
		productRepository.findAll().forEach(product -> products.add(product));
		return products;
	}

	@Override
	public void insertProduct(ProductBean productBean) {
		productRepository.save(productBean);
	}
	
	/*@Override
	public List<ProductBean> getProducts() {
		return dao.getProducts();
	}

	@Override
	public boolean insertProduct(ProductBean productBean) {
		int success = dao.insertProduct(productBean);
		if(success==0)
			return false;
		else
			return true;
	}
	
	
*/
}
