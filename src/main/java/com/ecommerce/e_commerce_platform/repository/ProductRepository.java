package com.ecommerce.e_commerce_platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.e_commerce_platform.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
