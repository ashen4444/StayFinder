package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MealPlan {

    /**
     * Meals included in this package
     * Example: Breakfast, Lunch, Dinner
     */
    private List<String> included;

    /**
     * Human-readable description
     */
    private String description;
}
