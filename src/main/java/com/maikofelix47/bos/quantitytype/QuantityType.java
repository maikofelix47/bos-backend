package com.maikofelix47.bos.quantitytype;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class QuantityType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String units;

    public QuantityType(){

    }
    public QuantityType(Integer id, String name, String units){
        this.id = id;
        this.name = name;
        this.units = units;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName(){
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getUnits(){
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
}
