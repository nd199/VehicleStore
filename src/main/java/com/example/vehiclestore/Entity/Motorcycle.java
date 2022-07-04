package com.example.vehiclestore.Entity;

import com.example.vehiclestore.Entity.Vehicle;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Motorcycle extends Vehicle {

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user")
    private User user;

    public void belongsTo(User user) {
        this.user=user;
    }
}