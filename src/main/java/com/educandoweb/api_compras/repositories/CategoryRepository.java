package com.educandoweb.api_compras.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.api_compras.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{


}
