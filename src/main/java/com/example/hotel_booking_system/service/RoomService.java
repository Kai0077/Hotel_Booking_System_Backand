package com.example.hotel_booking_system.service;

import com.example.hotel_booking_system.dto.Room.RoomRequest;
import com.example.hotel_booking_system.dto.Room.RoomResponse;
import com.example.hotel_booking_system.model.Room;
import com.example.hotel_booking_system.repository.HotelRepository;
import com.example.hotel_booking_system.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RoomService
{

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    HotelRepository hotelRepository;

    //Create room
    public RoomResponse createRoom(RoomRequest roomRequest){
        Room roomToSave = new Room();
        roomRequest.copyTo(roomToSave, hotelRepository);
        roomToSave.setCreated(LocalDateTime.now());
        roomToSave.setUpdated(LocalDateTime.now());
        roomRepository.save(roomToSave);
        return new RoomResponse(roomToSave);
    }

}
