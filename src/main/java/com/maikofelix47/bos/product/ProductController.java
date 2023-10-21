package com.maikofelix47.bos.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("")
    public Iterable<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> findOne(@PathVariable Integer id){
        return productService.findOne(id);
    }

    @PostMapping("/product")
    public Product insertOne(@RequestBody Product product){
        return  productService.insertOne(product);
    }

    @PutMapping("/{id}")
    public Optional<Product> updateOne(@PathVariable Integer id, @RequestBody Product product){
        return  productService.updateOne(id,product);
    }
}
