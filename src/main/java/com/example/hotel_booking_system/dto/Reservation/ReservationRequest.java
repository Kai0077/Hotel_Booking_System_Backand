package com.example.hotel_booking_system.dto.Reservation;

import com.example.hotel_booking_system.model.Reservation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ReservationRequest
{
    private long id;
    private LocalDate reservationDate;

    private LocalDateTime created;
    private LocalDateTime updated;


    private Reservation getReservationEntity(ReservationRequest r)
    {
        return Reservation.builder().id(r.id)
                .reservationDate(r.reservationDate)
                .created(r.created)
                .updated(r.updated)
                .build();
    }

    public void copyTo(ReservationRequest reservation)
    {
        reservation.setReservationDate(this.getReservationDate());
        reservation.setCreated(this.getCreated());
        reservation.setUpdated(this.getUpdated());
    }

    public ReservationRequest(Reservation r)
    {
        this.reservationDate = r.getReservationDate();
        this.created = r.getCreated();
        this.updated = r.getUpdated();
    }




}
