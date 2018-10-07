package com.happyretail.dao;

import java.util.List;

import com.happyretail.model.ProductBean;

public interface RetailDao {
	List<ProductBean> getProducts();
	ProductBean getProductById(ProductBean pb);
	int insertProduct(ProductBean pb);
}
