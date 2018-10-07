package com.happyretail.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.happyretail.model.ProductBean;

@Repository
public class RetailDaoImplement implements RetailDao {

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<ProductBean> getProducts() {
		String query = "select * from products;";
		return template.query(query, new ProductMapper()); 
	}

	@Override
	public ProductBean getProductById(ProductBean pb) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private class ProductMapper implements RowMapper<ProductBean>
	{

		@Override
		public ProductBean mapRow(ResultSet res, int row) throws SQLException {
			ProductBean pb = new ProductBean(res.getInt(1),
								res.getString(2),
								res.getString(3),
								res.getString(4),
								res.getDouble(5));
			return pb;
		}
		
	}

	@Override
	public int insertProduct(ProductBean pb) {
		String query = "insert into products values(?,?,?,?,?);";
		return template.update(query, pb.getProdId(),pb.getProdCat(),pb.getProdBrand(),pb.getProdName(),pb.getProdPrice());
	}

}
