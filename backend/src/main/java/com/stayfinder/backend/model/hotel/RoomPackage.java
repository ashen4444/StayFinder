package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomPackage {

    /**
     * Unique identifier for this package
     */
    private String packageId;

    /**
     * Display title shown to users
     * Example: Deluxe Double Room with Breakfast
     */
    private String title;

    /**
     * Number of guests covered by this package
     */
    private int guests;

    /**
     * Pricing details
     */
    private Price price;

    /**
     * Meal plan information
     */
    private MealPlan mealPlan;

    /**
     * Whether free cancellation is allowed
     */
    private boolean refundable;

    /**
     * Extra benefits included in this package
     */
    private List<String> extraBenefits;

    /**
     * Additional notes or tags
     */
    private String customNotes;
}

