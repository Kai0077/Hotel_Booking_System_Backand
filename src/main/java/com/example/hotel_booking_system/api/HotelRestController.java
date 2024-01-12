package com.example.hotel_booking_system.api;

import com.example.hotel_booking_system.dto.Hotel.HotelRequest;
import com.example.hotel_booking_system.dto.Hotel.HotelResponse;
import com.example.hotel_booking_system.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelRestController
{
    @Autowired
    HotelService hotelService;

    //Create new hotel
    @PostMapping("/hotel")
    public ResponseEntity<HotelResponse> createHotel(@RequestBody HotelRequest hotelRequest){
        HotelResponse createHotel = hotelService.createHotel(hotelRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(createHotel);
    }


    //get all hotels
    @GetMapping("/hotels")
    public ResponseEntity<List<HotelResponse>>getAllHotels(){
        List<HotelResponse> hotelResponses = hotelService.getAllHotels();
        return new ResponseEntity<>(hotelResponses, HttpStatus.OK);
    }

    //find hotel by id
    @GetMapping("/hotel/{id}")
    public ResponseEntity<HotelResponse> getHotelById(@PathVariable("id") Long id){
        HotelResponse hotelResponse = hotelService.getHotelById(id);
        return new ResponseEntity<>(hotelResponse, HttpStatus.OK);
    }

    //update hotel
    @PutMapping("/hotel/{id}")
    public ResponseEntity<String> updateHotel(@PathVariable("id") Long id, @RequestBody HotelRequest hotelRequest){
        HotelResponse updatedHotel = hotelService.updateHotel(id, hotelRequest);
        return ResponseEntity.status(HttpStatus.OK).body("Hotel with id: " + updatedHotel.getId() + " was updated");
    }

    //delete hotel
    @DeleteMapping("/hotel/{id}")
    public ResponseEntity<String> deleteHotel(@PathVariable("id") Long id){
        hotelService.deleteHotel(id);
        return ResponseEntity.status(HttpStatus.OK).body("Hotel with id: " + id + " was deleted");
    }

}
