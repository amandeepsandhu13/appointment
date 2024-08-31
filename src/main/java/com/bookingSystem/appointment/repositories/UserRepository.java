package com.bookingSystem.appointment.repositories;

import com.bookingSystem.appointment.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
