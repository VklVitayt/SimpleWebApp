package com.godeltech.simplewebapp.rest;

import com.godeltech.simplewebapp.domain.Employee;
import com.godeltech.simplewebapp.domain.Product;
import com.godeltech.simplewebapp.service.EmployeeService;
import com.godeltech.simplewebapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
@CrossOrigin
public class ProductApi {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAllProduct")
    private List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/getProductById/{id}")
    private Product getProductById(@PathVariable Long id){
        return productService.find(id);
    }

    @GetMapping("/getProductByTitle/{title}")
    private Product getProductByTitle(@PathVariable String title){
        return productService.find(title);
    }

    @GetMapping("/getProductByFurnitureType/{type}")
    private Product getProductByFurnitureType(@PathVariable String type){
        return productService.find(type);
    }

    @PostMapping("/postProduct")
    private void postProduct(@RequestBody Product product ){
        productService.save(product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    private ResponseEntity deleteProductById(@PathVariable Long id){
        System.out.println(id);
        productService.delete(id);
        return ResponseEntity.ok().build();
    }
}
