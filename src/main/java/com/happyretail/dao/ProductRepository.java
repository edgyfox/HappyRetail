package com.happyretail.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.happyretail.model.ProductBean;

@Repository
public interface ProductRepository extends CrudRepository<ProductBean, Integer> {

}
