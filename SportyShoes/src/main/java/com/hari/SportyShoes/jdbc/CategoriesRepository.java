package com.hari.SportyShoes.jdbc;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hari.SportyShoes.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}
