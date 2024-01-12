package com.example.hotel_booking_system.dto.Room;

import com.example.hotel_booking_system.model.Reservation;
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

public class RoomResponse
{
    private long id;
    private int roomNumber;
    private int numberOfBeds;
    private double price;

    private int isAvailable;

    private List<Long> reservationList;

    private LocalDateTime created;

    private LocalDateTime updated;

    private Long hotel_id;

    public RoomResponse(Room r)
    {
        this.id = r.getId();
        this.roomNumber = r.getRoomNumber();
        this.numberOfBeds = r.getNumberOfBeds();
        this.price = r.getPrice();
        this.isAvailable = r.getIsAvailable();
        this.created = r.getCreated();
        this.updated = r.getUpdated();
        this.reservationList = r.getReservationList().stream().map(Reservation::getId).collect(Collectors.toList());
        if(r.getHotel() != null)
            this.hotel_id = r.getHotel().getId();
    }
}
