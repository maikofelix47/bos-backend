package com.maikofelix47.bos.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("")
    public Iterable<Orders> findAll(){
        return orderService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Orders> findOne(@PathVariable Integer id){
        return orderService.findOne(id);
    }
    @PostMapping("")
    public Orders insertOne(){
        Orders order = new Orders();
        return orderService.insertOne(order);
    }

}
