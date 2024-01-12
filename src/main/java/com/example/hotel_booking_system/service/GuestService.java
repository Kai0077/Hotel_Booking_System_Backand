package com.example.hotel_booking_system.service;

import com.example.hotel_booking_system.dto.Guest.GuestRequest;
import com.example.hotel_booking_system.dto.Guest.GuestResponse;
import com.example.hotel_booking_system.model.Guest;
import com.example.hotel_booking_system.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GuestService
{
    @Autowired
    GuestRepository guestRepository;

    //Create guest
    public GuestResponse createGuest(GuestRequest guestRequest){
        Guest guestToSave = new Guest();
        guestRequest.copyTo(guestToSave);
        guestToSave.setCreated(LocalDateTime.now());
        guestToSave.setUpdated(LocalDateTime.now());
        guestRepository.save(guestToSave);
        return new GuestResponse(guestToSave);
    }

}
