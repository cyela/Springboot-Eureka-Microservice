package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.model.Product;


@RestController
@RequestMapping("/e-product")
public class ProductController {

	@Autowired
	private RestTemplate restTemplate ;
	
	@GetMapping("/fetchall")
	//@HystrixCommand(fallbackMethod = "getFallbackProducts")
	public Product fetchAllProducts() {

		return restTemplate.getForObject("http://product-service/product/one", Product.class);

	}

	/*public Product getFallbackProducts() {

		return new Product("Null","Null",0);

	}*/
}