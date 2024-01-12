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

public class Hotel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String street;
    private String city;
    private int zip;
    private String country;
    private LocalDateTime created;
    private LocalDateTime updated;


    @OneToMany(mappedBy = "hotel", cascade = CascadeType.REMOVE)
    private List<Room> roomList = new ArrayList<>();


    private int roomAmount;


}
