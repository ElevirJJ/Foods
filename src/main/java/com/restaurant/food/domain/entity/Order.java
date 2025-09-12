package com.restaurant.food.domain.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.restaurant.food.domain.dto.OrderDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pedidos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cliente;
    private Integer quantidade;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "prato_id")
    private Dish dish;

    public Order (OrderDTO dto, Dish dish){
        this.cliente = dto.cliente();
        this.quantidade = dto.quantidade();
        this.dish = dish;
    }

}
