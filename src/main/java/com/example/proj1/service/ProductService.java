package com.example.proj1.service;

import com.example.proj1.model.Product;
import com.example.proj1.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {



    ProductRepo repo;

    @Autowired
    public ProductService( ProductRepo repo){

        this.repo = repo;
    }

    public List<Product> getAllProducts() {

        return repo.findAll();
    }
}
