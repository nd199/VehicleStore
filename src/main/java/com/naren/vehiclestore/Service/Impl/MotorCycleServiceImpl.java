package com.naren.vehiclestore.Service.Impl;

import com.naren.vehiclestore.Entity.Motorcycle;
import com.naren.vehiclestore.Repository.MotorcycleRepository;
import com.naren.vehiclestore.Service.MotorCycleService;
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

    @Override
    public Motorcycle findById(Long mID) {
        return motorcycleRepository.findById(mID).orElseThrow(
                () -> new RuntimeException("MotorCycle not Found")
        );
    }
}