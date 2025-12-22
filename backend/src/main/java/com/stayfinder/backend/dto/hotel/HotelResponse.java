package com.stayfinder.backend.dto.hotel;

import lombok.Data;
import java.util.List;

@Data
public class HotelResponse {

    private String id;

    private String name;
    private String address;
    private String description;

    private List<String> languagesSpoken;

    private Object facilities;
    private Object rooms;
    private Object roomPackages;
    private Object policies;
    private Object metadata;
}

