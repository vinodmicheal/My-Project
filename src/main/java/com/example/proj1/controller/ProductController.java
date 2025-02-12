package com.example.proj1.controller;


import com.example.proj1.model.Product;
import com.example.proj1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService Service;

    @RequestMapping("/")
    public String greet(){

        return "hello world";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){

        return Service.getAllProducts();

    }
}
