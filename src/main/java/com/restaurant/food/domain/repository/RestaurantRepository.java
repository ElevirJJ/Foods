package com.restaurant.food.domain.repository;

import com.restaurant.food.domain.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    Optional<Restaurant> findByNomeAndEndereco(String nome, String endereco);

}
