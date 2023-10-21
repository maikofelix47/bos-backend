package com.maikofelix47.bos.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }
    public Optional<Product> findOne(Integer id){
        return  productRepository.findById(id);
    }
    public Product insertOne(Product product){
        return  productRepository.save(product);
    }

    public Optional<Product> updateOne(Integer id, Product product){
        return Optional.of(productRepository.findById(id).map(product1 -> {
            product1.setName(product1.getName());
            product1.setPrice(product.getPrice());
            product1.setQuantity(product.getQuantity());
            product1.setQuantityType(product.getQuantityType());
            product1.setStore(product.getStore());
            return productRepository.save(product1);
        }).orElseGet(() -> {
            return productRepository.save(product);
        }));
    }
}
