package com.example.vehiclestore.Service.Impl;

import com.example.vehiclestore.Entity.User;
import com.example.vehiclestore.Repository.UserRepository;
import com.example.vehiclestore.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(Long userId) {
        return userRepository.findById(userId).orElseThrow(
                () -> new RuntimeException("User not Found")
        );
    }

    @Override
    public User belongsTo(User user) {
        return userRepository.save(user);
    }


}
