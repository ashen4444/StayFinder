package com.stayfinder.backend.service.hotel;

import com.stayfinder.backend.model.hotel.Hotel;

import java.util.List;

public interface HotelService {

    Hotel createHotel(Hotel hotel);

    List<Hotel> getAllHotels();

    Hotel getHotelById(String id);
}
