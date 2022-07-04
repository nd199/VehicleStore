package com.example.vehiclestore.Service;

import com.example.vehiclestore.Entity.User;

public interface UserService {
    User addUser(User user);

    User findById(Long userId);

    User belongsTo(User user);
}
