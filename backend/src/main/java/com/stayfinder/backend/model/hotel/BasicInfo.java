package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicInfo {

    @NotBlank(message = "Hotel Name is required")
    @Size(min = 2, max = 120, message = "Hotel Name must be between 2 and 120 characters")
    private String name;

    /**
     * Full address or nearby city/province description
     */
    @NotBlank(message = "Address is required")
    @Size(min = 5, max = 200, message = "Address must be between 5 and 200 characters")
    private String address;

    /**
     * Short descriptive paragraph about the hotel
     */
    @Size(max = 1500, message = "Description can be maximum 1500 characters")
    private String description;

    /**
     * Views available from the hotel (sea, garden, mountain, etc.)
     */
    private List<String> views;

    /**
     * Languages spoken by staff
     */
    @NotEmpty(message = "Languages Spoken cannot be empty")
    private List<@NotBlank(message = "Languages Spoken cannot contain blank values") String> languagesSpoken;
}
