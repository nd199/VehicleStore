package com.naren.vehiclestore.Controller;

import com.naren.vehiclestore.Entity.Motorcycle;
import com.naren.vehiclestore.Service.MotorCycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MotorCycleController {

    @Autowired
    private MotorCycleService motorCycleService;

    @PostMapping("motorCycle")
    public ResponseEntity<Motorcycle> addMotorCycle(@RequestBody Motorcycle motorcycle){
        return new ResponseEntity<Motorcycle>(motorCycleService.addMotorCycle(motorcycle), HttpStatus.OK);
    }



}
