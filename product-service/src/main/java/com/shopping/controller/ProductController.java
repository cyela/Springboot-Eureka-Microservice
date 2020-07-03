package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.model.Product;
import com.shopping.service.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductServiceImpl prodService;

	@GetMapping("/one")
	public List<Product> getProducts() {

		return prodService.findAllProducts();

	}

	@GetMapping("/all")
	public Product getProduct() {

		return prodService.findProductById(new Long(2));

	}
}
