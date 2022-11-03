package com.hari.SportyShoes.jdbc;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hari.SportyShoes.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
