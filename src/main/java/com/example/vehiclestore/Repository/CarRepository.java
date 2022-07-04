package com.example.vehiclestore.Repository;

import com.example.vehiclestore.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}