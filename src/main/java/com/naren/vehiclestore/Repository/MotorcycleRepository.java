package com.naren.vehiclestore.Repository;

import com.naren.vehiclestore.Entity.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotorcycleRepository extends JpaRepository<Motorcycle, Long> {
}