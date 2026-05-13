package com.yahiya.ecom_project.service;

import com.yahiya.ecom_project.model.Product;
import com.yahiya.ecom_project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Productservice {

    @Autowired
    private ProductRepository repo;

    public List<Product> getAllProduct() {
       return repo.findAll();
    }

    public Product getProduct(int id) {
        return repo.findById(id).orElse(null);
    }
}
