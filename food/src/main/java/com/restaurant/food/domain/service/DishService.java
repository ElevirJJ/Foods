package com.restaurant.food.domain.service;

import com.restaurant.food.domain.dto.DishDTO;
import com.restaurant.food.domain.entity.Dish;
import com.restaurant.food.domain.repository.DishRepository;
import com.restaurant.food.domain.repository.RestaurantRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishService {

    private final DishRepository dishRepository;
    private final RestaurantRepository restaurantRepository;


    public void createDish(DishDTO dto) {
        if (dto.restaurantDTO() == null || dto.restaurantDTO().id() == null) {
            throw new IllegalArgumentException("ID do restaurante é obrigatório.");
        }

        var restaurante = restaurantRepository.findById(dto.restaurantDTO().id())
                .orElseThrow(() -> new EntityNotFoundException("Restaurante não encontrado"));

        int dishQuantidade = restaurante.getDishes().size();

        if (dishQuantidade <= 10){
            throw new IllegalStateException("O restaurante já possui o número máximo de 10 pratos.");
        }

        dishRepository.save(new Dish(dto, restaurante));

    }


    public List<Dish> getLis (){
        return dishRepository.findAll();
    }

    public Dish buscarPeloId (Long id){
        return dishRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Id não existi no banco de dados"));
    }

    public void deleteId (Long id){
        dishRepository.deleteById(id);
    }
}
