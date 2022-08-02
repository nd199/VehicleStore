package com.naren.vehiclestore.Controller;

import com.naren.vehiclestore.Entity.Car;
import com.naren.vehiclestore.Entity.Motorcycle;
import com.naren.vehiclestore.Entity.User;
import com.naren.vehiclestore.Service.CarService;
import com.naren.vehiclestore.Service.MotorCycleService;
import com.naren.vehiclestore.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private CarService carService;

    @Autowired
    private MotorCycleService motorCycleService;

    @PostMapping("user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return new ResponseEntity<User>(userService.addUser(user), HttpStatus.OK);
    }

    @PutMapping("car/{carId}/user/{userId}")
    public ResponseEntity<User> addUserToCar(@PathVariable("carId") Long carId,
                                             @PathVariable ("userId") Long userId)
    {
        User user = userService.findById(userId);
        Car car = carService.findById(carId);
        car.belongsTo(user);
        return  new ResponseEntity<User>(userService.belongsTo(user),HttpStatus.OK);
    }

    @PutMapping("motorCycle/{motorCycleId}/user/{userId}")
    public ResponseEntity<User> addUserToMotorCycle(@PathVariable("motorCycleId") Long mID,
                                                    @PathVariable ("userId") Long userId){
        User user = userService.findById(userId);
        Motorcycle motorcycle = motorCycleService.findById(mID);
        motorcycle.belongsTo(user);
        return  new ResponseEntity<User>(userService.belongsTo(user),HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") Long userId){

        return new ResponseEntity<User>(userService.findById(userId),HttpStatus.FOUND);
    }


}
