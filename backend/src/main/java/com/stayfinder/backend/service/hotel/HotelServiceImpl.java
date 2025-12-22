package com.stayfinder.backend.service.hotel;

import com.stayfinder.backend.dto.hotel.HotelCreateRequest;
import com.stayfinder.backend.dto.hotel.HotelUpdateRequest;
import com.stayfinder.backend.dto.hotel.HotelResponse;
import com.stayfinder.backend.model.hotel.Hotel;
import com.stayfinder.backend.repository.hotel.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public HotelResponse createHotel(HotelCreateRequest request) {
        Hotel hotel = new Hotel();
        hotel.setBasicInfo(request.getBasicInfo());
        hotel.setImages(request.getImages());
        hotel.setRooms(request.getRooms());
        hotel.setFacilities(request.getFacilities());
        hotel.setSwimmingPool(request.getSwimmingPool());
        hotel.setReviews(request.getReviews());
        hotel.setMetadata(request.getMetadata());

        Hotel savedHotel = hotelRepository.save(hotel);
        return mapToResponse(savedHotel);
    }

    @Override
    public HotelResponse getHotelById(String id) {
        Hotel hotel = hotelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hotel not found with id: " + id));

        return mapToResponse(hotel);
    }

    @Override
    public List<HotelResponse> getAllHotels() {
        return hotelRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public HotelResponse updateHotel(String id, HotelUpdateRequest request) {
        Hotel hotel = hotelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hotel not found with id: " + id));

        hotel.setBasicInfo(request.getBasicInfo());
        hotel.setImages(request.getImages());
        hotel.setRooms(request.getRooms());
        hotel.setFacilities(request.getFacilities());
        hotel.setSwimmingPool(request.getSwimmingPool());
        hotel.setReviews(request.getReviews());
        hotel.setReviewInsights(request.getReviewInsights());
        hotel.setMetadata(request.getMetadata());

        Hotel updatedHotel = hotelRepository.save(hotel);
        return mapToResponse(updatedHotel);
    }

    @Override
    public void deleteHotel(String id) {
        hotelRepository.deleteById(id);
    }

    // ----------------- Helper method -----------------

    private HotelResponse mapToResponse(Hotel hotel) {
        HotelResponse response = new HotelResponse();

        response.setId(hotel.getId());
        response.setBasicInfo(hotel.getBasicInfo());
        response.setImages(hotel.getImages());
        response.setRooms(hotel.getRooms());
        response.setFacilities(hotel.getFacilities());
        response.setSwimmingPool(hotel.getSwimmingPool());
        response.setReviews(hotel.getReviews());
        response.setReviewInsights(hotel.getReviewInsights());
        response.setMetadata(hotel.getMetadata());

        return response;
    }


}
