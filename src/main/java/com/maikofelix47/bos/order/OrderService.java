package com.maikofelix47.bos.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Iterable<Orders> findAll(){
        return orderRepository.findAll();
    }
    public Optional<Orders> findOne(Integer id){
        return orderRepository.findById(id);
    }
    public Orders insertOne(Orders order){
        return orderRepository.save(order);
    }
}
