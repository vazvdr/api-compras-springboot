package com.educandoweb.api_compras.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.api_compras.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{


}
