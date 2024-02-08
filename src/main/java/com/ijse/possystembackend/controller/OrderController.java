package com.ijse.possystembackend.controller;

import com.ijse.possystembackend.entity.Order;
import com.ijse.possystembackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public ResponseEntity<?> getAllOrders(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(orderService.getAllOrders());
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to load orders");
        }
    }

    @GetMapping("/orders/{id}")
    public ResponseEntity<?> getOrderById(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(orderService.getOrderById(id));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to get the order by ID");
        }
    }

    @PostMapping("/orders")
    public ResponseEntity<?> createOrder(@RequestBody Order order){

        try {
            Order newOrder = orderService.createOrder(order);

            return ResponseEntity.status(HttpStatus.CREATED).body(newOrder);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("order not created");
        }

    }





}
