package com.example.hotel_booking_system.exception;

public class ReservationNotFoundException extends RuntimeException
{
    public ReservationNotFoundException(String message)
    {
        super(message);
    }
}
