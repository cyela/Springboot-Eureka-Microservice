package com.shopping.service;

import java.util.List;

import com.shopping.model.Product;

public interface ProductService {

	public List<Product> findAllProducts();

	public Product findProductById(Long id);
}
