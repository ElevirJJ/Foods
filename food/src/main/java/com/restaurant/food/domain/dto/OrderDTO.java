package com.restaurant.food.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.restaurant.food.domain.entity.Order;

public record OrderDTO(Long id, String cliente, Integer quantidade, @JsonProperty("prato") DishDTO dishDTO) {
    public OrderDTO (Order order){
        this(order.getId(), order.getCliente(), order.getQuantidade(), new DishDTO(order.getDish())
        );
    }
}
