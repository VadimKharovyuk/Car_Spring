package com.example.car_spring.repositoty;

import com.example.car_spring.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository  extends JpaRepository<Car,Long> {
}
