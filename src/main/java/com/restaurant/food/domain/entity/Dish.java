package com.restaurant.food.domain.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.restaurant.food.domain.dto.DishDTO;
import com.restaurant.food.domain.dto.RestaurantDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "pratos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "restaurante_id")
    private Restaurant restaurant;

    @OneToMany(mappedBy = "dish", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Order> orders;

    public Dish(DishDTO dishDTO, Restaurant restaurante) {
        this.nome = dishDTO.nome();
        this.preco = dishDTO.preco();
        this.restaurant = restaurante;

    }
}
