package com.example.hotel_booking_system.repository;

import com.example.hotel_booking_system.model.Guest;
import com.example.hotel_booking_system.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>
{
}
