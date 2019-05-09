package com.godeltech.simplewebapp.repository;

import com.godeltech.simplewebapp.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByIdProduct(Long id);

    Product findByTitle(String title);

    Product findByFurnitureType(String type);

    void deleteByIdProduct(Long id);
}

