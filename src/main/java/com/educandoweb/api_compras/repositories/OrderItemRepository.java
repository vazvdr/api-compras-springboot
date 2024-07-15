package com.educandoweb.api_compras.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.api_compras.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
