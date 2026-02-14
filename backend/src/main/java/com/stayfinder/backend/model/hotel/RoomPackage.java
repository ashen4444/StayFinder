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
public class RoomPackage {

    /**
     * Unique identifier for this package
     * Optional during creation (usually generated)
     */
    private String packageId;

    /**
     * Display title shown to users
     * Example: Deluxe Double Room with Breakfast
     */
    @NotBlank(message = "Package title is required")
    @Size(min = 5, max = 150, message = "Package title must be between 5 and 150 characters")
    private String title;

    /**
     * Number of guests covered by this package
     */
    @Min(value = 1, message = "Guests must be at least 1")
    @Max(value = 20, message = "Guests must be 20 or less")
    private int guests;

    /**
     * Pricing details
     */
    @NotNull(message = "Price details are required")
    @Valid
    private Price price;

    /**
     * Meal plan information
     */
    @Valid
    private MealPlan mealPlan;

    /**
     * Whether free cancellation is allowed
     */
    private boolean refundable;

    /**
     * Extra benefits included in this package
     */
    private List<@NotBlank(message = "extraBenefits cannot contain blank values") String> extraBenefits;

    /**
     * Additional notes or tags
     */
    @Size(max = 500, message = "customNotes can be maximum 500 characters")
    private String customNotes;
}