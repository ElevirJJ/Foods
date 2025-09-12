package com.restaurant.food.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.restaurant.food.domain.entity.Dish;

public record DishDTO( Long id, String nome, Double preco, @JsonProperty("restaurante") RestaurantDTO restaurantDTO) {
    public DishDTO(Dish dish) {
        this(dish.getId(),dish.getNome(), dish.getPreco(), new RestaurantDTO(dish.getRestaurant()));
    }


}

