package com.example.vehiclestore.Service.Impl;

import com.example.vehiclestore.Entity.Motorcycle;
import com.example.vehiclestore.Repository.MotorcycleRepository;
import com.example.vehiclestore.Service.MotorCycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotorCycleServiceImpl implements MotorCycleService {

    @Autowired
    private MotorcycleRepository motorcycleRepository;

    @Override
    public Motorcycle addMotorCycle(Motorcycle motorcycle) {
        return motorcycleRepository.save(motorcycle);
    }
}