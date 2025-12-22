package com.stayfinder.backend.repository.hotel;

import com.stayfinder.backend.model.hotel.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, String> {
}
