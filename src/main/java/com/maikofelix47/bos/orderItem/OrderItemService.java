package com.maikofelix47.bos.orderItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;

    public Iterable<OrderItem> findAll(){
        return orderItemRepository.findAll();
    }
    public Optional<OrderItem> findOne(Integer id){
        return orderItemRepository.findById(Long.valueOf(id));
    }
    public OrderItem insertOne(OrderItem orderItem){
        return  orderItemRepository.save(orderItem);
    }

}
