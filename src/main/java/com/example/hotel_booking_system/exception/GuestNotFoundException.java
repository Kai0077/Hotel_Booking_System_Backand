package com.example.hotel_booking_system.exception;

public class GuestNotFoundException extends RuntimeException
{
    public GuestNotFoundException(String message)
    {
        super(message);
    }

}
