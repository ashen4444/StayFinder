package com.stayfinder.backend.model.hotel;

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
     */
    private String roomId;

    /**
     * Display name (e.g., Deluxe Double Room)
     */
    private String roomName;

    /**
     * Maximum number of guests allowed
     */
    private int maxGuests;

    /**
     * Bed configuration description
     */
    private String bedType;

    /**
     * Images related to this room
     */
    private ImageSet images;

    /**
     * Facilities available in this room
     */
    private RoomFacilities roomFacilities;

    /**
     * Different purchasable variants of this room
     */
    private List<RoomPackage> packages;
}
