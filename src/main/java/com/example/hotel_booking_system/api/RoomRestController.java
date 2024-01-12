package com.example.hotel_booking_system.api;

import com.example.hotel_booking_system.dto.Room.RoomRequest;
import com.example.hotel_booking_system.dto.Room.RoomResponse;
import com.example.hotel_booking_system.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomRestController
{

    @Autowired
    RoomService roomService;

    //Create room
    @PostMapping("/room")
    public ResponseEntity<RoomResponse> createRoom(@RequestBody RoomRequest roomRequest){
        RoomResponse createRoom = roomService.createRoom(roomRequest);
        return ResponseEntity.ok(createRoom);
    }
}
