package com.restaurant.food.domain.service;

import com.restaurant.food.domain.dto.RestaurantDTO;
import com.restaurant.food.domain.entity.Restaurant;
import com.restaurant.food.domain.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteService {

    private final RestaurantRepository restaurantRepository;

    public RestauranteService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public void createRestaurante (RestaurantDTO dto){
        var create = new Restaurant(dto.nome(), dto.endereco());
        restaurantRepository.save(create);
    }

    public List<Restaurant> get (){
        return restaurantRepository.findAll();
    }

    public Restaurant buscarPeloId (Long id){
        return restaurantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID não existi no banco de dados"));
    }

    public void deleteId (Long id){
        restaurantRepository.deleteById(id);
    }

}
