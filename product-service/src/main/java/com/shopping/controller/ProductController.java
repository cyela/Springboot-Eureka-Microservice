package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.model.Product;
import com.shopping.repo.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductRepository prodRepo;

	@GetMapping("/all")
	public List<Product> getProducts() {

		return prodRepo.findAll();

	}

	@GetMapping("/id")
	public ResponseEntity<Product> getProduct(@RequestParam(name = "id") Long id) {

		Product product = prodRepo.findProductByProductid(id);

		return ResponseEntity.ok().body(product);

	}

	@PostMapping("/save")
	public void saveProduct(@RequestBody Product product) {

		Product pres = prodRepo.save(product);
		if (pres != null) {
			System.out.println("Success");
		}

	}
}
