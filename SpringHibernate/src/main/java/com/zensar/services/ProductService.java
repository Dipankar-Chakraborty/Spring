package com.zensar.services;

import java.util.List;
import com.zensar.entities.Product;

/**
 * @author Dipankar Chakraborty
 * @creation_date 4th Oct 2019 11:40AM
 * @modification_date 10th Oct 2019 05:20PM
 * @version 2.0
 * @copyright Zensar Technologies. All rights reserved
 * @description It is a Service Interface and used in business layer.
 */
public interface ProductService {
	List<Product> findAllProducts();

	Product findProductId(int productId);

	void addProduct(Product product);

	void updateProduct(Product product);

	void removeProduct(Product product);

	List<Product> findProductsByPriceRange(double priceMin, double priceMax);

	List<Product> findProductByName(String productName);

	List<Product> findProductByBrand(String productBrand);

	long getProductCount();
}
