package com.restaurant.food.controller;

import com.restaurant.food.domain.dto.DishDTO;
import com.restaurant.food.domain.entity.Dish;
import com.restaurant.food.domain.service.DishService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prato")
public class DishController {

    private final DishService dishRepository;

    public DishController(DishService dishRepository) {
        this.dishRepository = dishRepository;
    }

    @PostMapping
    public ResponseEntity<Void>create(@RequestBody DishDTO dishDTO){
        dishRepository.createDish(dishDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Dish>> list (){
        var lista = dishRepository.getLis();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DishDTO> get (@PathVariable Long id){
        var dados = dishRepository.buscarPeloId(id);
        return ResponseEntity.ok(new DishDTO(dados));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
        dishRepository.deleteId(id);
        return ResponseEntity.ok().build();
    }
}
