package com.example.hotel_booking_system.repository;

import com.example.hotel_booking_system.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>
{
}
