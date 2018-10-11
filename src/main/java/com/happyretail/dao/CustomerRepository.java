package com.happyretail.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.happyretail.model.CustomerBean;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerBean, String>{

}
