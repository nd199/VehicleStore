package com.naren.vehiclestore.Service;

import com.naren.vehiclestore.Entity.Car;

public interface CarService {
    Car addCar(Car car);

    Car findById(Long carId);
}
