package com.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.model.Product;
import com.shopping.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository prodRepo;

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return prodRepo.findAll();
	}

	@Override
	public Product findProductById(Long id) {
		// TODO Auto-generated method stub
		return prodRepo.findProductByProductid(id);
	}

}
