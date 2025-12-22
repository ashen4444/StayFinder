package com.stayfinder.backend.dto.hotel;

import lombok.Data;
import java.util.List;

@Data
public class HotelUpdateRequest {

    private String description;

    private List<String> languagesSpoken;

    private Object facilities;
    private Object rooms;
    private Object roomPackages;
    private Object policies;
    private Object metadata;
}

