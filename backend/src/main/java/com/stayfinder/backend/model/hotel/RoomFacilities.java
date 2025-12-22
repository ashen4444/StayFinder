package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomFacilities {

    /**
     * Predefined/common facilities
     * Example: AC, Free Wi-Fi, Flat Screen TV
     */
    private List<String> standard;

    /**
     * Manually added or uncommon facilities
     * Example: Socket near the bed, Drying rack for clothing
     */
    private List<String> custom;
}
