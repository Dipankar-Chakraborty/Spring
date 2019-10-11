package com.zensar.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;

public class DbOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbConfig.xml");
		ProductService productService = ctx.getBean("productServiceImpl", ProductService.class);
		List<Product> products=productService.findAllProducts();
		for(Product currentProduct:products) {
			System.out.println(currentProduct);
		}
		Product p1 = productService.findProductId(1002);
		System.out.println(p1);
		//Product product = new Product(1007, "Car", "Audi", 2500000);
		//productService.addProduct(product);
		/*
		 * Product p2 = productService.findProductId(1002); if(p2 !=null) {
		 * productService.updateProduct(p2); } else {
		 * System.out.println("Product not found"); }
		 */
		Product p2 = productService.findProductId(1002); 
		if(p2 !=null) {
			 productService.removeProduct(p2); } else {
			 System.out.println("Product not found"); }
	}

}
