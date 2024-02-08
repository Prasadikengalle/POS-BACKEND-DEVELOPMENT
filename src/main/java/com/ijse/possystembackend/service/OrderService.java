package com.ijse.possystembackend.service;

import com.ijse.possystembackend.dto.OrderDTO;
import com.ijse.possystembackend.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    List<Order> getAllOrders();

    Order getOrderById(Long id);

    Order createOrder(OrderDTO orderDTO);


}
