package com.example.hotel_booking_system.dto.Guest;

import com.example.hotel_booking_system.model.Guest;
import com.example.hotel_booking_system.model.Reservation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor

public class GuestResponse
{
    private long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    private List<Long> reservationList;

    private LocalDateTime created;
    private LocalDateTime updated;

    public GuestResponse(Guest g)
    {
        this.id = g.getId();
        this.username = g.getUsername();
        this.firstName = g.getFirstName();
        this.lastName = g.getLastName();
        this.email = g.getEmail();
        this.phoneNumber = g.getPhoneNumber();
        this.created = g.getCreated();
        this.updated = g.getUpdated();
        this.reservationList = g.getReservationList().stream().map(Reservation::getId).toList();
    }

}
