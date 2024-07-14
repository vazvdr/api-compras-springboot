package com.educandoweb.api_compras.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.api_compras.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{


}
