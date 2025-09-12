package com.restaurant.food.domain.dto;

import com.restaurant.food.domain.entity.Restaurant;

public record RestaurantDTO(Long id, String nome, String endereco) {
    public RestaurantDTO (Restaurant restaurant){
        this(restaurant.getId(), restaurant.getNome(), restaurant.getEndereco());
    }

}
