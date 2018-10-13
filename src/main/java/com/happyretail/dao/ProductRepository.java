package com.happyretail.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.happyretail.model.ProductBean;

@Repository
public interface ProductRepository extends CrudRepository<ProductBean, Integer> {
	
	@Query(value="select p from ProductBean p where prodId=?1")
	public ProductBean findById(int id);
	
	@Query(value="select p from ProductBean p where prodName like %?1%")
	public ArrayList<ProductBean> findByName(String name);
	
	@Query(value="select p from ProductBean p where prodCat like %?1%")
	public ArrayList<ProductBean> findByCat(String cat);
	
	@Query(value="select p from ProductBean p where prodGender=?1")
	public ArrayList<ProductBean> findByGender(String gender);
	
	@Query(value="select p from ProductBean p where prodPrice>?1 and prodPrice<?2")
	public ArrayList<ProductBean> findByPrice(double p1, double p2);
		
	@Query(value="select p from ProductBean p order by prodName")
	public ArrayList<ProductBean> sortByName();
	
	@Query(value="select p from ProductBean p order by prodBrand")
	public ArrayList<ProductBean> sortByBrand();
	
	@Query(value="select p from ProductBean p order by prodPrice")
	public ArrayList<ProductBean> sortByPrice();
}
