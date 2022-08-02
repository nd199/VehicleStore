package com.naren.vehiclestore.Repository;

import com.naren.vehiclestore.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

}