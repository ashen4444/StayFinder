package com.stayfinder.backend.model.hotel;

import jakarta.validation.constraints.*;
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
     *
     * Optional object, but if present,
     * must contain at least one valid meal.
     */
    @NotEmpty(message = "Meal plan must include at least one meal")
    private List<
            @NotBlank(message = "Included meals cannot be blank")
            @Size(max = 50, message = "Meal name can be maximum 50 characters")
                    String> included;

    /**
     * Human-readable description (optional)
     */
    @Size(max = 300, message = "Meal plan description can be maximum 300 characters")
    private String description;
}