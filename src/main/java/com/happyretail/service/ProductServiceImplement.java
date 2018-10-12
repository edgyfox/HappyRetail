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

	@Override
	public ProductBean getProductById(ProductBean productBean) {
		ProductBean product = productRepository.findById(productBean.getProdId());
		return product;		
	}

	@Override
	public ArrayList<ProductBean> getProductByName(ProductBean productBean) {
		ArrayList<ProductBean> products = new ArrayList<>();
		productRepository.findByName(productBean.getProdName()).forEach(product -> products.add(product));
		return products;
	}

	@Override
	public ArrayList<ProductBean> getProductByCat(ProductBean productBean) {
		ArrayList<ProductBean> products = new ArrayList<>();
		productRepository.findByCat(productBean.getProdCat()).forEach(product -> products.add(product));
		return products;
	}

	@Override
	public ArrayList<ProductBean> getProductByGender(ProductBean productBean) {
		ArrayList<ProductBean> products = new ArrayList<>();
		productRepository.findByGender(productBean.getProdGender()).forEach(product -> products.add(product));
		return products;
	}
}
