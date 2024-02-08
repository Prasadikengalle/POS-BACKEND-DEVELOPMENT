package com.ijse.possystembackend.repository;

import com.ijse.possystembackend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository <Order, Long> {

}
