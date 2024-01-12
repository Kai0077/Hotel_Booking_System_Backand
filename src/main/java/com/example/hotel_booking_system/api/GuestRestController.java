package com.example.hotel_booking_system.api;

import com.example.hotel_booking_system.dto.Guest.GuestRequest;
import com.example.hotel_booking_system.dto.Guest.GuestResponse;
import com.example.hotel_booking_system.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestRestController
{
    @Autowired
    GuestService guestService;

    //Create guest
    @PostMapping("/guest")
    public ResponseEntity<GuestResponse> createGuest(@RequestBody GuestRequest guestRequest){
        GuestResponse createGuest = guestService.createGuest(guestRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(createGuest);
    }
}
