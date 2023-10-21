package com.maikofelix47.bos.quantitytype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/quantityType")
public class QuantityTypeController {
    @Autowired
    private QuantityTypeService quantityTypeService;

    @GetMapping("")
    public Iterable<QuantityType> findAll(){
        return quantityTypeService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<QuantityType> findOne(@PathVariable Integer id){
        return quantityTypeService.findOne(id);
    }

    @PostMapping("")
    public QuantityType insertOne(@RequestBody QuantityType quantityType){
        return quantityTypeService.insertOne(quantityType);
    }

    @PutMapping("/{id}")
    public Optional<QuantityType> updateOne(@PathVariable Integer id, @RequestBody QuantityType quantityType){
        return  quantityTypeService.updateOne(id,quantityType);
    }
}
