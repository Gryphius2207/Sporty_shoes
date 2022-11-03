package com.hari.SportyShoes.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.SportyShoes.entity.Categories;
import com.hari.SportyShoes.entity.Product;
import com.hari.SportyShoes.jdbc.ProductRepository;

@SuppressWarnings("unused")
@Service
public class ProductService {
	@Autowired
	public ProductRepository prodrepo;
	
	public List<Product> listAll()
	{
		return prodrepo.findAll();
	}
	
	public void save(Product product)
	{
		prodrepo.save(product);
	}

}
