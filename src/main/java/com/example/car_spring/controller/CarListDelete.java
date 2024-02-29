package com.example.car_spring.controller;

import com.example.car_spring.repositoty.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class CarListDelete {
    private final CarRepository carRepository ;
    @RequestMapping("/delete/{id}")
    public String deleteCarByID(@PathVariable (name = "id") Long id) {
        carRepository.deleteById(id);
        return "redirect:/cars/all";
    }

}
