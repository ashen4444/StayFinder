package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    // Basic room details
    private String roomName;              // e.g. "Deluxe Double Room"
    private String roomType;              // e.g. "Deluxe", "Standard"
    private double roomSize;              // in square meters
    private String description;

    // Room-level structured facilities (checkbox-friendly)
    private boolean airConditioning;
    private boolean fan;
    private boolean hotWater;
    private boolean flatScreenTv;
    private boolean satelliteTv;
    private boolean socketNearBed;
    private boolean mosquitoNet;
    private boolean dryingRackForClothing;
    private boolean refrigerator;
    private boolean minibar;
    private boolean teaCoffeeMaker;
    private boolean soundproofRoom;
    private boolean privateBathroom;

    // Views
    private List<String> views;            // e.g. "Sea view", "Garden view"

    // Room packages
    private List<RoomPackage> roomPackages;

    // Images
    private List<String> imageUrls;

    // Custom room features (rare / unique)
    private List<String> customRoomFeatures;
}
