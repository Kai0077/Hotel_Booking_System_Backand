package com.example.hotel_booking_system.service;

import com.example.hotel_booking_system.HotelBookingSystemApplication;
import com.example.hotel_booking_system.dto.Hotel.HotelRequest;
import com.example.hotel_booking_system.dto.Hotel.HotelResponse;
import com.example.hotel_booking_system.model.Hotel;
import com.example.hotel_booking_system.repository.HotelRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = HotelBookingSystemApplication.class)
@Transactional
class HotelServiceTest {

    @Autowired
    HotelRepository hotelRepository;

    @Autowired
    HotelService hotelService;

    @BeforeEach
    void setUp() {
        // Clean up the database
        hotelRepository.deleteAll();
    }

    @AfterEach
    void tearDown() {
        // Clean up the database after each test
        hotelRepository.deleteAll();
    }

    @Test
    void createHotel() {
        HotelRequest hotelRequest = new HotelRequest();
        hotelRequest.setName("Test Hotel");
        hotelRequest.setStreet("123 Test Street");
        hotelRequest.setCity("New York");
        hotelRequest.setZip(2200);
        hotelRequest.setCountry("USA");
        hotelRequest.setCreated(LocalDateTime.now());
        hotelRequest.setUpdated(LocalDateTime.now());

        HotelResponse result = hotelService.createHotel(hotelRequest);

        System.out.println("Created hotel: " + result);

        assertEquals(hotelRequest.getName(), result.getName());
        assertEquals(hotelRequest.getStreet(), result.getStreet());
        assertEquals(hotelRequest.getCity(), result.getCity());
        assertEquals(hotelRequest.getZip(), result.getZip());
        assertEquals(hotelRequest.getCountry(), result.getCountry());
        assertEquals(hotelRequest.getCreated(), result.getCreated());
        assertEquals(hotelRequest.getUpdated(), result.getUpdated());
    }

    @Test
    void getAllHotels() {
        Hotel hotel1 = new Hotel();
        hotel1.setName("Tivoli Hotel");
        hotel1.setStreet("Arni Magnussons Gade 2");
        hotel1.setCity("København");
        hotel1.setZip(2300);
        hotel1.setCountry("Danmark");
        hotelRepository.save(hotel1);

        List<HotelResponse> result = hotelService.getAllHotels();

        System.out.println("All hotels: " + result);

        assertEquals(1, result.size());
        assertTrue(result.stream().anyMatch(h -> h.getName().equals(hotel1.getName())));
        assertTrue(result.stream().anyMatch(h -> h.getStreet().equals(hotel1.getStreet())));
        assertTrue(result.stream().anyMatch(h -> h.getCity().equals(hotel1.getCity())));
        assertTrue(result.stream().anyMatch(h -> h.getZip() == hotel1.getZip()));
        assertTrue(result.stream().anyMatch(h -> h.getCountry().equals(hotel1.getCountry())));
    }

    @Test
    void getHotelById() {
        Hotel hotel = new Hotel();
        hotel.setName("Tivoli Hotel");
        hotel.setId(1L);
        Hotel savedHotel = hotelRepository.save(hotel);
        HotelResponse result = hotelService.getHotelById(savedHotel.getId());
        System.out.println("Saved Hotel ID: " + savedHotel.getId());
        System.out.println("Returned Hotel ID: " + result.getId());
        assertEquals(savedHotel.getId(), result.getId());
    }

    @Test
    void updateHotel() {
        Hotel hotel = new Hotel();
        hotel.setName("Tivoli Hotel");
        hotel.setStreet("Arni Magnussons Gade 2");
        hotel.setCity("København");
        hotel.setZip(2300);
        hotel.setCountry("Danmark");
        Hotel savedHotel = hotelRepository.save(hotel);

        HotelRequest hotelRequest = new HotelRequest();
        hotelRequest.setName("Tivoli Hotel2");
        hotelRequest.setStreet("Arni Magnussons Gade 22");
        hotelRequest.setCity("København N");
        hotelRequest.setZip(23002);
        hotelRequest.setCountry("Danmark2");


        HotelResponse result = hotelService.updateHotel(savedHotel.getId(), hotelRequest);

        System.out.println("Request Name: " + hotelRequest.getName());
        System.out.println("Response Name: " + result.getName());
        System.out.println("Request Street: " + hotelRequest.getStreet());
        System.out.println("Response Street: " + result.getStreet());
        System.out.println("Request City: " + hotelRequest.getCity());
        System.out.println("Response City: " + result.getCity());
        System.out.println("Request Zip: " + hotelRequest.getZip());
        System.out.println("Response Zip: " + result.getZip());
        System.out.println("Request Country: " + hotelRequest.getCountry());
        System.out.println("Response Country: " + result.getCountry());

        assertEquals(hotelRequest.getName(), result.getName());
        assertEquals(hotelRequest.getStreet(), result.getStreet());
        assertEquals(hotelRequest.getCity(), result.getCity());
        assertEquals(hotelRequest.getZip(), result.getZip());
        assertEquals(hotelRequest.getCountry(), result.getCountry());

    }

    @Test
    void deleteHotel() {
        Hotel hotel = new Hotel();
        hotel.setName("Tivoli Hotel");
        hotel.setStreet("Arni Magnussons Gade 2");
        hotel.setCity("København");
        hotel.setZip(2300);
        hotel.setCountry("Danmark");
        Hotel savedHotel = hotelRepository.save(hotel);

        System.out.println("Saved Hotel ID: " + savedHotel.getId());

        hotelService.deleteHotel(savedHotel.getId());

        Optional<Hotel> deletedHotel = hotelRepository.findById(savedHotel.getId());


        if(deletedHotel.isPresent()) {
            System.out.println("The hotel is still in the database.");
        } else {
            System.out.println("The hotel has been successfully deleted from the database.");
        }

        assertFalse(deletedHotel.isPresent());
    }
}