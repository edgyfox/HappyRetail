package com.happyretail.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="products")
public class ProductBean {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="prodId")
	private int prodId;
	
	@NotNull(message="Field should not be empty")
	@Column(name="prodCat")
	private String prodCat;
	
	@NotNull(message="Field should not be empty")
	@Column(name="prodBrand")
	private String prodBrand;
	
	@NotNull(message="Field should not be empty")
	@Column(name="prodName")
	private String prodName;
	
	@NotNull(message="Field should not be empty")
	@Column(name="prodPrice")
	private double prodPrice;
	
	public ProductBean() {
		
	}
	public ProductBean(int prodId, String prodCat, String prodBrand, String prodName, double prodPrice) {
		super();
		this.prodId = prodId;
		this.prodCat = prodCat;
		this.prodBrand = prodBrand;
		this.prodName = prodName;
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

}
