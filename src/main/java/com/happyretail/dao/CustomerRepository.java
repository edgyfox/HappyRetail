package com.happyretail.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.happyretail.model.CustomerBean;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerBean, String>{

	@Query(value="select c from CustomerBean c where custEmail like ?1 and custPass like ?2")
	public ArrayList<CustomerBean> findByCredentials(String username, String password);
	
}
