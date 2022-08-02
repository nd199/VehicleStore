package com.naren.vehiclestore.Service;

import com.naren.vehiclestore.Entity.User;

public interface UserService {
    User addUser(User user);

    User findById(Long userId);

    User belongsTo(User user);
}
