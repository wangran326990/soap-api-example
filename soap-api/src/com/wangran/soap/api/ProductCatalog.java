package com.wangran.soap.api;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.wangran.model.Product;
import com.wangran.service.ProductServiceImpl;

/***
 * This is the portType name in WSDL eg. the portType service name is ProductCatalog
 * The service tag name will become serviceName and the url will become ../ServiceName
 * The port tag name attribute will become to  TestPort
 * targetNamespace override the target namepace.
 * @author wr
 *
 */
@WebService(endpointInterface="com.wangran.soap.api.ProductCatalogInterface",portName="ProductCatalogPortName")
public class ProductCatalog implements ProductCatalogInterface{
	ProductServiceImpl productServiceImp = new ProductServiceImpl();

	public List<String> getProductCategories(){
		//ProductServiceImpl productServiceImp = new ProductServiceImpl();
		return productServiceImp.getProductCategories();
	}
	
	public List<String> getProducts(String category){
		return productServiceImp.getProducts(category); 
	}
	
	public boolean addProduct(String category, String product){
		return productServiceImp.addProduct(category, product);
	}

	@Override
	public List<Product> getProducts2() {
		return productServiceImp.getProducts();
	}
}