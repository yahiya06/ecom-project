package com.yahiya.ecom_project.controller;

import com.yahiya.ecom_project.model.Product;
import com.yahiya.ecom_project.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private Productservice service;

//    @RequestMapping("/")
//    public String greet(){
//        return "hellow";
//    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProduct(){
        return new ResponseEntity<>(service.getAllProduct(), HttpStatus.OK);
    }


    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id){

        Product product = service.getProduct(id);

        if(product != null)
           return new ResponseEntity<>(product, HttpStatus.OK);

        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
