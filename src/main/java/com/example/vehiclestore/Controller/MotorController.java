package com.example.vehiclestore.Controller;

import com.example.vehiclestore.Entity.Motorcycle;
import com.example.vehiclestore.Service.MotorCycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MotorController {

    @Autowired
    private MotorCycleService motorCycleService;

    @PostMapping("motorCycle")
    public ResponseEntity<Motorcycle> addMotorCycle(@RequestBody Motorcycle motorcycle){
        return new ResponseEntity<Motorcycle>(motorCycleService.addMotorCycle(motorcycle), HttpStatus.OK);
    }



}
