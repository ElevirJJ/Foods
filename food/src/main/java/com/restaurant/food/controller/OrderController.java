package com.restaurant.food.controller;

import com.restaurant.food.domain.dto.OrderDTO;
import com.restaurant.food.domain.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<Void> create (@RequestBody OrderDTO dto){
        orderService.createOrder(dto);
        return ResponseEntity.ok().build();
    }
}
