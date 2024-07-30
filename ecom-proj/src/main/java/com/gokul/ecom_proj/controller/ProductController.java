package com.gokul.ecom_proj.controller;


import com.gokul.ecom_proj.model.Product;
import com.gokul.ecom_proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;
    @RequestMapping("/")
    public String greet(){
        return "Hello World";
    }
    @RequestMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
}
