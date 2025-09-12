package com.restaurant.food.controller;

import com.restaurant.food.domain.dto.RestaurantDTO;
import com.restaurant.food.domain.entity.Restaurant;
import com.restaurant.food.domain.service.RestauranteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurante")
public class RestaurantController {

    private final RestauranteService restauranteService;

    public RestaurantController(RestauranteService restauranteService) {
        this.restauranteService = restauranteService;
    }

    @PostMapping
    public ResponseEntity<Void>create (@RequestBody RestaurantDTO dto){
        restauranteService.createRestaurante(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Restaurant>> list (){
      var list =  restauranteService.get();
      return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestaurantDTO> peloId (@PathVariable Long id){
        var dados = restauranteService.buscarPeloId(id);
        return ResponseEntity.ok(new RestaurantDTO(dados));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
        restauranteService.deleteId(id);
        return ResponseEntity.ok().build();
    }

}
