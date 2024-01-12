package com.example.hotel_booking_system.repository;

import com.example.hotel_booking_system.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long>
{
}
