package com.godeltech.simplewebapp.service;

import com.godeltech.simplewebapp.domain.Product;
import com.godeltech.simplewebapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public Product find(Long id) {
        return productRepository.findByIdProduct(id);
    }

    public Product find(String title) {
        return productRepository.findByTitle(title);
    }

//    public Product find(String type) {
//        return productRepository.findByFurnitureType(type);
//    }

    public void delete(Long id){
        productRepository.deleteByIdProduct(id);
    }

    public void save(Product product){
        productRepository.save(product);
    }

}
