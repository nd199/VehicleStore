package com.naren.vehiclestore.Service.Impl;

import com.naren.vehiclestore.Entity.Car;
import com.naren.vehiclestore.Repository.CarRepository;
import com.naren.vehiclestore.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {


    @Autowired
    private CarRepository carRepository;
    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car findById(Long carId) {
        return carRepository.findById(carId).orElseThrow(
                () -> new RuntimeException("Car Not Found")
        );
    }
}
