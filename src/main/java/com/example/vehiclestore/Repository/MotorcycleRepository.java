package com.example.vehiclestore.Repository;

import com.example.vehiclestore.Entity.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotorcycleRepository extends JpaRepository<Motorcycle, Long> {
}