package com.example.hotel_booking_system.dto.Guest;

import com.example.hotel_booking_system.model.Guest;
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

public class GuestRequest
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


    public Guest getGuestEntity(GuestRequest g) {
        return Guest.builder().id(g.id)
                .username(g.username)
                .firstName(g.firstName)
                .lastName(g.lastName)
                .email(g.email)
                .phoneNumber(g.phoneNumber)
                .created(g.created)
                .updated(g.updated)
                .build();
    }

    public void copyTo(Guest guest)
    {
        guest.setFirstName(this.getFirstName());
        guest.setLastName(this.getLastName());
        guest.setEmail(this.getEmail());
        guest.setPhoneNumber(this.getPhoneNumber());
        guest.setCreated(this.getCreated());
        guest.setUpdated(this.getUpdated());
    }

    public GuestRequest(GuestRequest g)
    {
        this.firstName = g.getFirstName();
        this.lastName = g.getLastName();
        this.email = g.getEmail();
        this.phoneNumber = g.getPhoneNumber();
        this.created = g.getCreated();
        this.updated = g.getUpdated();

    }
}
