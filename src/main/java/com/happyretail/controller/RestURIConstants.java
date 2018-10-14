package com.happyretail.controller;

public class RestURIConstants {

	public static final String GET_PRODUCTS = "/getProducts";
	public static final String GET_PRODUCTS_BY_ID = "/getProducts/id/{id}";
	public static final String GET_PRODUCTS_BY_NAME = "/getProducts/name/{name}";
	public static final String GET_PRODUCTS_BY_CAT = "/getProducts/cat/{cat}";
	public static final String GET_PRODUCTS_BY_GENDER = "/getProducts/gender/{gender}";
	public static final String GET_PRODUCTS_BY_PRICE = "/getProducts/price";
	
	public static final String SORT_PRODUCTS_BY_NAME  = "/sortProducts/name";
	public static final String SORT_PRODUCTS_BY_BRAND = "/sortProducts/brand";
	public static final String SORT_PRODUCTS_BY_PRICE = "/sortProducts/price";
	
	public static final String ADD_PRODUCT = "/addProduct";
	public static final String ADD_LIST_OF_PRODUCTS = "/addProducts";
	
	public static final String GET_CUSTOMERS = "/getCustomers";
	public static final String ADD_CUSTOMER = "/addCustomer";
	public static final String LOGIN = "/login";
	public static final String REGISTER = "/register";
	
}
