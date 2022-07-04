package com.example.vehiclestore.Service.Impl;

import com.example.vehiclestore.Entity.Car;
import com.example.vehiclestore.Entity.Motorcycle;
import com.example.vehiclestore.Repository.CarRepository;
import com.example.vehiclestore.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CarServiceImpl implements CarService {


    @Autowired
    private CarRepository carRepository;
    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);
    }
}
