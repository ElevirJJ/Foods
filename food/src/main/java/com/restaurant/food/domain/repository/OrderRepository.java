package com.restaurant.food.domain.repository;

import com.restaurant.food.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
