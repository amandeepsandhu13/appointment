package com.bookingSystem.appointment.repositories;

import com.bookingSystem.appointment.models.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Long> {
}
