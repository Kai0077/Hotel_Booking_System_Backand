package com.example.hotel_booking_system.exception;

public class HotelNotFoundException extends RuntimeException
{
    public HotelNotFoundException(String message)
    {
        super(message);
    }

}
