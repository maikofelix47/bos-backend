package com.maikofelix47.bos.rider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/riders")
public class RiderController {
    @Autowired
    private RiderService riderService;

    @GetMapping("")
    public Iterable<Rider> findAll(){
        return riderService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Rider> findOne(@PathVariable Integer id){
        return riderService.findOne(id);
    }

    @PostMapping("")
    public Rider insertOne(@RequestBody Rider newRider){
        return riderService.insertOne(newRider);
    }

    @PutMapping("/{id}")
    public Rider updateOne(@PathVariable Integer id, @RequestBody Rider rider){
        return  riderService.updateOne(id,rider);
    }
}
