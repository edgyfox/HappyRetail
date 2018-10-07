package com.happyretail.service;

import java.util.List;

import com.happyretail.model.ProductBean;

public interface ProductService {
	List<ProductBean> getProducts();
	boolean insertProduct(ProductBean pb);
}
