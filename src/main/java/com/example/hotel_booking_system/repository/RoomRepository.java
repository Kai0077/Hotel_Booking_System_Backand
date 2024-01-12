package com.example.hotel_booking_system.repository;

import com.example.hotel_booking_system.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>
{
}
