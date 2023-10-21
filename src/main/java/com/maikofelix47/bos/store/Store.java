package com.maikofelix47.bos.store;

import com.maikofelix47.bos.product.Product;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @OneToMany
    Set<Product> products;

    public Store(){

    }
    public Store(Integer id, String name){
        this.id = id;
        this.name = name;
    }
    public Integer getId(){
        return  this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getName(){
        return  this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}
