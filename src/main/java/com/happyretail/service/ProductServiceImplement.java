package com.happyretail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happyretail.dao.RetailDao;
import com.happyretail.model.ProductBean;

@Service
public class ProductServiceImplement implements ProductService {

	@Autowired
	RetailDao dao;
	@Override
	public List<ProductBean> getProducts() {
		return dao.getProducts();
	}

	@Override
	public boolean insertProduct(ProductBean pb) {
		int success = dao.insertProduct(pb);
		if(success==0)
			return false;
		else
			return true;
	}

}
