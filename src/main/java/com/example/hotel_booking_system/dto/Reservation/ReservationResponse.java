package com.example.hotel_booking_system.dto.Reservation;


import com.example.hotel_booking_system.model.Reservation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor

public class ReservationResponse
{
    private long id;
    private LocalDate reservationDate;

    private LocalDateTime created;
    private LocalDateTime updated;

    private long roomId;
    private long guestId;

    public ReservationResponse(Reservation r)
    {
        this.id = r.getId();
        this.reservationDate = r.getReservationDate();
        this.created = r.getCreated();
        this.updated = r.getUpdated();
        this.roomId = r.getRoom().getId();
        this.guestId = r.getGuest().getId();
    }


}
