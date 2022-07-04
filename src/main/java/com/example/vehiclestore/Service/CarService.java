package com.example.vehiclestore.Service;

import com.example.vehiclestore.Entity.Car;

public interface CarService {
    Car addCar(Car car);

    Car findById(Long carId);
}
