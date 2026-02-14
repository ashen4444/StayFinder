package com.stayfinder.backend.model.hotel;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    /**
     * Internal unique identifier for the room type
     * (Optional for creating. If you want it required, add @NotBlank)
     */
    private String roomId;

    /**
     * Display name (e.g., Deluxe Double Room)
     */
    @NotBlank(message = "roomName is required")
    @Size(min = 2, max = 120, message = "roomName must be between 2 and 120 characters")
    private String roomName;

    /**
     * Maximum number of guests allowed
     */
    @Min(value = 1, message = "maxGuests must be at least 1")
    @Max(value = 20, message = "maxGuests must be 20 or less")
    private int maxGuests;

    /**
     * Bed configuration description
     */
    @NotBlank(message = "bedType is required")
    @Size(max = 60, message = "bedType can be maximum 60 characters")
    private String bedType;

    /**
     * Images related to this room
     */
    @Valid
    private ImageSet images;

    /**
     * Facilities available in this room
     */
    @Valid
    private RoomFacilities roomFacilities;

    /**
     * Different purchasable variants of this room
     */
    @NotEmpty(message = "packages cannot be empty")
    @Valid
    private List<RoomPackage> packages;
}
