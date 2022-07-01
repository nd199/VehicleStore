package com.example.vehiclestore.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.Positive;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long vehicleId;

    @Column(name = "vehicle_name", nullable = false)
    private String vehicleName;

    @Column(name = "no_of_wheels")
    private Integer noOfWheels;

    @Column(name = "vehicle_colour", nullable = false)
    private String vehicleColour;

    @Column(name = "vehicle_type", nullable = false)
    private String vehicleType;

    @Positive
    @Column(name = "cost_of_vehicle")
    @NumberFormat(pattern = "₹###,###,###.00")
    private Double costOfVehicle;

    @Column(name = "registration_number", nullable = false, unique = true)
    private Long registrationNumber;

}