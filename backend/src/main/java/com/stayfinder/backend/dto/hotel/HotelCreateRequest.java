package com.stayfinder.backend.dto.hotel;

import lombok.Data;
import java.util.List;

@Data
public class HotelCreateRequest {

    private String name;
    private String address;
    private String description;

    private List<String> languagesSpoken;

    // Embedded domain objects (already finalized)
    private Object facilities;
    private Object rooms;
    private Object roomPackages;
    private Object policies;
    private Object metadata;
}

