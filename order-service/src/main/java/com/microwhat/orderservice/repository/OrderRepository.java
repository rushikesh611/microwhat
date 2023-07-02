package com.microwhat.orderservice.repository;

import com.microwhat.orderservice.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
