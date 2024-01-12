package com.example.hotel_booking_system.dto.Hotel;

import com.example.hotel_booking_system.model.Hotel;
import com.example.hotel_booking_system.model.Room;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class HotelRequest
{
    private long id;
    private String name;
    private String street;
    private String city;
    private int zip;
    private String country;

    private List<Long> roomList;

    private LocalDateTime created;
    private LocalDateTime updated;

    private int roomAmount;

    public Hotel getHotelEntity(HotelRequest h){
        return Hotel.builder().id(h.id)
                .name(h.name)
                .street(h.street)
                .city(h.city)
                .zip(h.zip)
                .country(h.country)
                .created(h.created)
                .updated(h.updated)
                .roomAmount(h.roomAmount)
                .build();
    }

    public void copyTo(Hotel hotel){
        hotel.setName(this.getName());
        hotel.setStreet(this.getStreet());
        hotel.setCity(this.getCity());
        hotel.setZip(this.getZip());
        hotel.setCountry(this.getCountry());
        hotel.setCreated(this.getCreated());
        hotel.setUpdated(this.getUpdated());
        hotel.setRoomAmount(this.getRoomAmount());
    }

    public HotelRequest(Hotel h){
        this.name = h.getName();
        this.street = h.getStreet();
        this.city = h.getCity();
        this.zip = h.getZip();
        this.country = h.getCountry();
        this.created = h.getCreated();
        this.updated = h.getUpdated();
        this.roomAmount = h.getRoomAmount();
    }
}
