package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomPackage {

    // Package identity
    private String packageName;          // e.g. "Deluxe Double Room with Breakfast"
    private String packageCode;          // optional internal reference

    // Guest & bed details
    private int maxGuests;
    private String bedType;              // e.g. "1 Queen Bed", "2 Single Beds"

    // Meal & pricing
    private String mealPlan;             // e.g. "Room only", "Breakfast included"
    private double pricePerNight;
    private String currency;             // e.g. "USD", "LKR"

    // Cancellation & refund
    private boolean refundable;
    private CancellationPolicy cancellationPolicy;

    // Extra notes for AI reasoning
    private List<String> highlights;     // e.g. "Sea view", "Best for couples"
    private List<String> additionalNotes;
}
