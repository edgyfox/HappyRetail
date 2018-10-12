package com.happyretail.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.w3c.dom.ls.LSInput;

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
}
