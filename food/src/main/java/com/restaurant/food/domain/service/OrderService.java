package com.restaurant.food.domain.service;

import com.restaurant.food.domain.dto.OrderDTO;
import com.restaurant.food.domain.entity.Order;
import com.restaurant.food.domain.repository.DishRepository;
import com.restaurant.food.domain.repository.OrderRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final DishRepository dishRepository;

    public OrderService(OrderRepository orderRepository, DishRepository dishRepository) {
        this.orderRepository = orderRepository;
        this.dishRepository = dishRepository;
    }

    public void createOrder(OrderDTO dto){
        if (dto.dishDTO() == null || dto.dishDTO().id() == null) {
            throw new IllegalArgumentException("ID do Prato é obrigatório");
        }

        var dish = dishRepository.findById(dto.dishDTO().id())
                .orElseThrow(() -> new EntityNotFoundException("Prato não encontrado"));

        orderRepository.save(new Order(dto, dish));
    }


}
