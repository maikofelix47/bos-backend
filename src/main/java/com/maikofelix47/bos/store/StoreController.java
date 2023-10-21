package com.maikofelix47.bos.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping("")
    public @ResponseBody Iterable<Store> getAllStores(){
        return storeService.findAll();
    }
    @PostMapping("")
    public Store insertOne(@RequestBody Store store){
        return storeService.insertOne(store);
    }

    @GetMapping("/{id}")
    public Optional<Store> getOne(@PathVariable Integer id){
       return  storeService.findOne(id);
    }

    @PutMapping("/{id}")
    public Optional<Store> updateOne(@PathVariable Integer id, @RequestBody Store store){
       return  storeService.updateOne(id,store);
    }
}
