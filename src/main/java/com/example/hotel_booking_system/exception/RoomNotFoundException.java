package com.example.hotel_booking_system.exception;

public class RoomNotFoundException extends RuntimeException
{
    public RoomNotFoundException(String message)
    {
        super(message);
    }
}
