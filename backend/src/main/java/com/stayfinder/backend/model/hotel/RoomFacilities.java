package com.stayfinder.backend.model.hotel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
    private List<
            @NotBlank(message = "standard facilities cannot contain blank values")
            @Size(max = 100, message = "Facility name can be max 100 characters")
                    String> standard;

    /**
     * Manually added or uncommon facilities
     * Example: Socket near the bed, Drying rack for clothing
     */
    private List<
            @NotBlank(message = "custom facilities cannot contain blank values")
            @Size(max = 100, message = "Facility name can be max 100 characters")
                    String> custom;
}