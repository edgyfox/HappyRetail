package com.happyretail.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.happyretail.model.CustomerBean;
import com.happyretail.model.ProductBean;

/**
 * Implements the RetailDao interface
 * @author Argha Nandan
 *
 */
@Repository
public class RetailDaoImplement implements RetailDao {

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<ProductBean> getProducts() {
		String query = "select prod_id,prod_brand,prod_name,prod_cat,prod_price from products;";
		return template.query(query, new ProductMapper()); 
	}

	@Override
	public ProductBean getProductById(ProductBean productBean) {
		// auto-generated
		return null;
	}

	@Override
	public int insertProduct(ProductBean productBean) {
		String query = "insert into products(prod_id,prod_brand,prod_name,prod_cat,prod_price) values(?,?,?,?,?);";
		return template.update(query, productBean.getProdId(),
				productBean.getProdBrand(),productBean.getProdName(),
				productBean.getProdCat(),productBean.getProdPrice());
	}

	@Override
	public List<CustomerBean> getCustomers() {
		String query = "select * from customers";
		return template.query(query, new CustomerMapper());
	}

	@Override
	public int insertCustomer(CustomerBean customerBean) {
		String query = "insert into customers values(?,?,?,?,?)";
		return template.update(query,customerBean.getCustId(),
				customerBean.getCustEmail(),customerBean.getCustName(),
				customerBean.getCustPass(),customerBean.getCustPhone());
	}
	
	/**
	 * Fetching ProductBean rows using RowMapper
	 * @author Argha Nandan
	 *
	 */
	private class ProductMapper implements RowMapper<ProductBean>
	{

		@Override
		public ProductBean mapRow(ResultSet res, int row) throws SQLException {
			ProductBean productBean = new ProductBean(res.getInt(1),
								res.getString(2),
								res.getString(3),
								res.getString(4),
								res.getString(5),
								res.getDouble(6));
			return productBean;
		}
		
	}
	
	/**
	 * Fetching CustomerBean rows using RowMapper
	 * @author Argha Nandan
	 *
	 */
	private class CustomerMapper implements RowMapper<CustomerBean>
	{

		@Override
		public CustomerBean mapRow(ResultSet res, int row) throws SQLException {
			CustomerBean customerBean = new CustomerBean(res.getInt(1),
								res.getString(2),
								res.getString(3),
								res.getString(4),
								res.getString(5),
								res.getString(6));
			return customerBean;
		}
		
	}

}
