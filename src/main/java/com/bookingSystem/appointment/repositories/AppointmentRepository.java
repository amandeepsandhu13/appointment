package com.bookingSystem.appointment.repositories;

import com.bookingSystem.appointment.models.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Long> {

    List<AppointmentEntity> findByAppointmentDateTimeBetween(LocalDateTime start, LocalDateTime end);

}
