package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicInfo {

    private String name;

    /**
     * Full address or nearby city/province description
     */
    private String address;

    /**
     * Short descriptive paragraph about the hotel
     */
    private String description;

    /**
     * Views available from the hotel (sea, garden, mountain, etc.)
     */
    private List<String> views;

    /**
     * Languages spoken by staff
     */
    private List<String> languagesSpoken;
}
