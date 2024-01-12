package com.example.hotel_booking_system.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Room
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int roomNumber;
    private int numberOfBeds;
    private double price;
    private LocalDateTime created;
    private LocalDateTime updated;
    private int isAvailable;

    @OneToMany(mappedBy = "room")
    private List<Reservation> reservationList = new ArrayList<>();

   @ManyToOne
   @JoinColumn(name = "hotel_id", referencedColumnName = "id")
    private Hotel hotel;

}
