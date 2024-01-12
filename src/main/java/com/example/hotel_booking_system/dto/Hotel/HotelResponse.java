package com.example.hotel_booking_system.dto.Hotel;


import com.example.hotel_booking_system.model.Hotel;
import com.example.hotel_booking_system.model.Room;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
@NoArgsConstructor

public class HotelResponse
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


    public HotelResponse(Hotel h)
    {
        this.id = h.getId();
        this.name = h.getName();
        this.street = h.getStreet();
        this.city = h.getCity();
        this.zip = h.getZip();
        this.country = h.getCountry();
        this.created = h.getCreated();
        this.updated = h.getUpdated();
        this.roomAmount = h.getRoomAmount();
        this.roomList = h.getRoomList().stream().map(Room::getId).collect(Collectors.toList());
    }

}
