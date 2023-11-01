package com.maikofelix47.bos.orderItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/orderItems")
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;

    @GetMapping("")
    public Iterable<OrderItem> findAll(){
        return orderItemService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<OrderItem> findOne(@PathVariable  Integer id){
        return orderItemService.findOne(id);
    }

    @PostMapping("")
    public OrderItem insertOne(@RequestBody OrderItem orderItem){
        return orderItemService.insertOne(orderItem);
    }

}
