package com.yahiya.ecom_project.controller;

import com.yahiya.ecom_project.model.Product;
import com.yahiya.ecom_project.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private Productservice service;

    @RequestMapping("/")
    public String greet(){
        return "hellow";
    }

    @RequestMapping("/products")
    public List<Product> getAllProduct(){
        return service.getAllProduct();
    }
}
