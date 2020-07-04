package com.ecommerce.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.model.Product;


@RestController
@RequestMapping("/api/e-com")
public class ProductController {

	@Autowired
	private RestTemplate restTemplate ;
	
	@GetMapping("/products")
	//@HystrixCommand(fallbackMethod = "getFallbackProducts")
	public List<Product> fetchProducts() {

		ResponseEntity<Product[]> responseEntity =  restTemplate.getForEntity("http://product-service/product/all", Product[].class);
		return Arrays.asList(responseEntity.getBody());

	}

	@GetMapping("/product")
	public Product fetchAllProducts(@RequestParam(name="id") Long id) {

		return restTemplate.getForObject("http://product-service/product/id?id="+id, Product.class);

	}
	
	@PostMapping("/save")
	public void saveProduct(@RequestBody Product prod) {

		restTemplate.postForObject("http://product-service/product/save",prod, Product.class);

	}
	
	/*public Product getFallbackProducts() {

		return new Product("Null","Null",0);

	}*/
}