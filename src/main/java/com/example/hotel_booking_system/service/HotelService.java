package com.example.hotel_booking_system.service;

import com.example.hotel_booking_system.dto.Hotel.HotelRequest;
import com.example.hotel_booking_system.dto.Hotel.HotelResponse;
import com.example.hotel_booking_system.exception.HotelNotFoundException;
import com.example.hotel_booking_system.model.Hotel;
import com.example.hotel_booking_system.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HotelService
{

    @Autowired
    HotelRepository hotelRepository;

    // create new hotel
    public HotelResponse createHotel(HotelRequest hotelRequest) {
        try {
            Hotel hotelToSave = new Hotel();
            hotelRequest.copyTo(hotelToSave);
            hotelToSave.setCreated(LocalDateTime.now());
            hotelToSave.setUpdated(LocalDateTime.now());
            hotelRepository.save(hotelToSave);
            return new HotelResponse(hotelToSave);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", e);
        }
    }

    //List all hotels
    public List<HotelResponse> getAllHotels() {
        List<Hotel> hotels = hotelRepository.findAll();
        return hotels.stream()
                .map(HotelResponse::new)
                .collect(Collectors.toList());
    }

    //Find hotel by id
    public HotelResponse getHotelById(Long id) {
        Optional<Hotel> foundHotel = hotelRepository.findById(id);
        if (foundHotel.isEmpty()) {
            throw new HotelNotFoundException("Cannot find hotel with id: " + id);
        } else {
            return new HotelResponse(foundHotel.get());
        }
    }

    //Update hotel
    public HotelResponse updateHotel(Long id, HotelRequest hotelRequest){
        Optional<Hotel> optionalHotelToEdit = hotelRepository.findById(id);
        Hotel hotelToEdit = optionalHotelToEdit.get();
        if(optionalHotelToEdit.isEmpty()){
            throw new HotelNotFoundException("Cannot find hotel with id: " + id);
        } else {
            hotelRequest.copyTo(hotelToEdit);
            hotelRepository.save(hotelToEdit);
            return new HotelResponse(hotelToEdit);
        }

    }

    //Delete hotel
    public void deleteHotel(Long id){
        Optional<Hotel> optionalHotelToDelete = hotelRepository.findById(id);
        if(optionalHotelToDelete.isEmpty()){
            throw new HotelNotFoundException("Cannot find hotel with id: " + id);
        } else {
            hotelRepository.deleteById(id);
        }
    }



}
