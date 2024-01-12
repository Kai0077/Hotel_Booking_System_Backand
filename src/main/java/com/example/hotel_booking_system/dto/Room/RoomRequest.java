package com.example.hotel_booking_system.dto.Room;

import com.example.hotel_booking_system.model.Hotel;
import com.example.hotel_booking_system.model.Room;
import com.example.hotel_booking_system.repository.HotelRepository;
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

public class RoomRequest
{
    private long id;
    private int roomNumber;
    private int numberOfBeds;
    private double price;

    private int isAvailable;
    private LocalDateTime created;
    private LocalDateTime updated;

    private List<Long> reservationList;

    private Long hotel_id;

    private Room getRoomEntity(RoomRequest r)
    {
        return Room.builder().id(r.id)
                .roomNumber(r.roomNumber)
                .numberOfBeds(r.numberOfBeds)
                .price(r.price)
                .isAvailable(r.isAvailable)
                .created(r.created)
                .updated(r.updated)
                .build();
    }

    public void copyTo(Room room, HotelRepository hotelRepository)
    {
        room.setRoomNumber(this.getRoomNumber());
        room.setNumberOfBeds(this.getNumberOfBeds());
        room.setPrice(this.getPrice());
        room.setIsAvailable(isAvailable);
        room.setCreated(this.getCreated());
        room.setUpdated(this.getUpdated());
        if(hotel_id != null) {
            Hotel hotel = hotelRepository.findById(hotel_id).orElse(null);
            room.setHotel(hotel);
        }
    }

    public RoomRequest(Room r)
    {
        this.roomNumber = r.getRoomNumber();
        this.numberOfBeds = r.getNumberOfBeds();
        this.price = r.getPrice();
        this.isAvailable = r.getIsAvailable();
        this.created = r.getCreated();
        this.updated = r.getUpdated();
    }

}
