package com.maikofelix47.bos.store;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

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
