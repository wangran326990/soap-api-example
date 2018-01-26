package com.wangran.soap.api;

import java.util.List;

import javax.jws.WebService;

import com.wangran.model.Product;

@WebService
public interface ProductCatalogInterface {
	public List<String> getProductCategories();
	
	public List<String> getProducts(String category);
	
	public boolean addProduct(String category, String product);
	
	public List<Product> getProducts2();
}
