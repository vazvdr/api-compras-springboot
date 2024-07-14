package com.educandoweb.api_compras.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.api_compras.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{


}
