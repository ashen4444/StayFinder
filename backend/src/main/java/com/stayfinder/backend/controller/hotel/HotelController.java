package com.stayfinder.backend.controller.hotel;

import com.stayfinder.backend.dto.hotel.HotelCreateRequest;
import com.stayfinder.backend.dto.hotel.HotelResponse;
import com.stayfinder.backend.dto.hotel.HotelUpdateRequest;
import com.stayfinder.backend.model.hotel.Hotel;
import com.stayfinder.backend.service.hotel.HotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping
    public HotelResponse createHotel(@RequestBody HotelCreateRequest request) {
        return hotelService.createHotel(request);
    }

    @GetMapping
    public List<HotelResponse> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @GetMapping("/{id}")
    public HotelResponse getHotelById(@PathVariable String id) {
        return hotelService.getHotelById(id);
    }

    @PutMapping("/{id}")
    public HotelResponse updateHotel(
            @PathVariable String id,
            @RequestBody HotelUpdateRequest request
    ) {
        return hotelService.updateHotel(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable String id) {
        hotelService.deleteHotel(id);
    }
}
