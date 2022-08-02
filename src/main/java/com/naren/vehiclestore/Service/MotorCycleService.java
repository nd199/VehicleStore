package com.naren.vehiclestore.Service;

import com.naren.vehiclestore.Entity.Motorcycle;

public interface MotorCycleService {

    Motorcycle addMotorCycle(Motorcycle motorcycle);
    Motorcycle findById(Long mID);
}
