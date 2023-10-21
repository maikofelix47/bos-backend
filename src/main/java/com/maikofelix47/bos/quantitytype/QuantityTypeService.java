package com.maikofelix47.bos.quantitytype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuantityTypeService {

    @Autowired
    private QuantityTypeRespository quantityTypeRespository;

    public Iterable<QuantityType> findAll(){
        return quantityTypeRespository.findAll();
    }
    public Optional<QuantityType> findOne(Integer id){
        return quantityTypeRespository.findById(id);
    }

    public QuantityType insertOne(QuantityType quantityType){
        return  quantityTypeRespository.save(quantityType);
    }
    public Optional<QuantityType> updateOne(Integer id, QuantityType quantityType){
        return Optional.of(quantityTypeRespository.findById(id).map(quantityType1 -> {
            quantityType1.setName(quantityType.getName());
            quantityType1.setUnits(quantityType.getUnits());
            return quantityTypeRespository.save(quantityType1);
        }).orElseGet(() -> {
            return quantityTypeRespository.save(quantityType);
        }));
    }
}
