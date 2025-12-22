package com.stayfinder.backend.service.hotel;

import com.stayfinder.backend.dto.hotel.HotelCreateRequest;
import com.stayfinder.backend.dto.hotel.HotelUpdateRequest;
import com.stayfinder.backend.dto.hotel.HotelResponse;

import java.util.List;

public interface HotelService {

    HotelResponse createHotel(HotelCreateRequest request);

    HotelResponse getHotelById(String id);

    List<HotelResponse> getAllHotels();

    HotelResponse updateHotel(String id, HotelUpdateRequest request);

    void deleteHotel(String id);
}
