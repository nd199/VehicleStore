package com.naren.vehiclestore.Repository;

import com.naren.vehiclestore.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}