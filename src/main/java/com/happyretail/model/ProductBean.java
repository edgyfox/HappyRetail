package com.happyretail.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="products")
public class ProductBean {
	@Id
	@Column(name="prodId")
	private int prodId;
	
	@NotNull(message="Field should not be empty")
	@Column(name="prodName")
	private String prodName;
	
	@NotNull(message="Field should not be empty")
	@Column(name="prodBrand")
	private String prodBrand;
	
	@NotNull(message="Field should not be empty")
	@Column(name="prodCat")
	private String prodCat;
	
	@NotNull(message="Field should not be empty")
	@Column(name="prodGender")
	private String prodGender;
	
	@NotNull(message="Field should not be empty")
	@Column(name="prodPrice")
	private double prodPrice;
	
	public ProductBean() {}
	
	public ProductBean(int prodId, String prodBrand, String prodName, 
			String prodCat, String prodGender, double prodPrice) {
		super();
		this.prodId = prodId;
		this.prodBrand = prodBrand;
		this.prodName = prodName;
		this.prodCat = prodCat;
		this.prodGender = prodGender;
		this.prodPrice = prodPrice;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdCat() {
		return prodCat;
	}
	public void setProdCat(String prodCat) {
		this.prodCat = prodCat;
	}
	public String getProdBrand() {
		return prodBrand;
	}
	public void setProdBrand(String prodBrand) {
		this.prodBrand = prodBrand;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getProdGender() {
		return prodGender;
	}
	public void setProdGender(String prodGender) {
		this.prodGender = prodGender;
	}

}
