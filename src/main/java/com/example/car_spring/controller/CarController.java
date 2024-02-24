package com.example.car_spring.controller;

import com.example.car_spring.model.Car;
import com.example.car_spring.repositoty.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/cars")
public class CarController {
    private final CarRepository carRepository ;
    @GetMapping("/add")
    public String main(Model model){
        model.addAttribute("car",new Car()) ;
        return "cars.add";
    }
    @PostMapping("/add")
    public String addCar(@ModelAttribute  Car car){
        carRepository.save(car);
        return "redirect:/cars/add";
    }
    @GetMapping("/all")
    public String getAll( Model model){
        model.addAttribute("car",carRepository.findAll());
        return "getAll" ;
    }

}
