package com.restaurant.food.domain.repository;

import com.restaurant.food.domain.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
}
