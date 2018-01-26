package com.wangran.service;

import java.util.ArrayList;
import java.util.List;

import com.wangran.model.Product;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public ProductServiceImpl() {
		//book list;
		bookList.add("Book 1");
		bookList.add("Book 2");
		bookList.add("Book 3");
		
		musicList.add("Music 1");
		musicList.add("Music 2");
		musicList.add("Music 3");
		
		movieList.add("Movie 1");
		movieList.add("Movie 2");
		movieList.add("Movie 3");
		
	}
	
	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String catagory){
		switch(catagory){
		case "book":
			return bookList;
		case "music":
			return musicList;
		case "movie":
			return movieList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product){
		switch(category){
			case "book":{
				bookList.add(product);
				return true;
			}
			case "music":
			{
				musicList.add(product);
				return true;
			}
			case "movie":{
				movieList.add(product);
				return true;
			}
		}
		return false;
	}
	
	public List<Product> getProducts(){
		List<Product> products = new ArrayList<>();
		products.add(new Product("Product 1", "001", 99.99));
		products.add(new Product("Product 2", "002", 97.99));
		products.add(new Product("Product 3", "003", 91.99));
		
		return products;
	}
}
