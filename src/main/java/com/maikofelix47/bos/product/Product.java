package com.maikofelix47.bos.product;

import com.maikofelix47.bos.orderItem.OrderItem;
import com.maikofelix47.bos.quantitytype.QuantityType;
import com.maikofelix47.bos.store.Store;
import jakarta.persistence.*;
import org.springframework.data.util.Lazy;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private Double price;
    private Integer quantity;

    @ManyToOne
    private QuantityType quantityType;

    @ManyToOne
    private Store store;


    public Product(){

    }

    public Product(Integer id, String name, Double price, Integer quantity, QuantityType quantityType, Store store){
         this.id = id;
         this.name = name;
         this.price = price;
         this.quantity = quantity;
         this.quantityType = quantityType;
         this.store = store;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantityType(QuantityType quantityType) {
        this.quantityType = quantityType;
    }

    public QuantityType getQuantityType() {
        return quantityType;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Store getStore() {
        return store;
    }
}
