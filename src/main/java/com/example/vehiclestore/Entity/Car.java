package com.example.vehiclestore.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Car extends Vehicle {

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_user_id")
    private User user;


    public void belongsTo(User user) {
        this.user = user;
    }
}