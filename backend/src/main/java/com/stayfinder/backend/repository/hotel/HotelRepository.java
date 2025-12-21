package com.stayfinder.backend.repository.hotel;

import com.stayfinder.backend.model.hotel.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel, String> {
}
