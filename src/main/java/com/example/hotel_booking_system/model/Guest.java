package com.example.hotel_booking_system.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Guest
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDateTime created;
    private LocalDateTime updated;

    @OneToMany(mappedBy = "guest")
    private List<Reservation> reservationList;

}
