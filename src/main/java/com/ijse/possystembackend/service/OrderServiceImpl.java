package com.ijse.possystembackend.service;

import com.ijse.possystembackend.entity.Order;
import com.ijse.possystembackend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements  OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrders(){
        return orderRepository.findAll();

    }

    @Override
    public Order createOrder(Order order){
        return orderRepository.save(order);
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}
