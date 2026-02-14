package com.stayfinder.backend.model.hotel;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Price {

    /**
     * Currency code (e.g., LKR, USD)
     */
    @NotBlank(message = "Currency is required")
    @Pattern(regexp = "^[A-Z]{3}$", message = "Currency must be a valid 3-letter ISO code (e.g., LKR, USD)")
    private String currency;

    /**
     * Price amount (per night)
     */
    @Positive(message = "Amount must be a positive value")
    private double amount;

    /**
     * Optional note (e.g., per night, includes taxes, etc.)
     */
    @Size(max = 200, message = "priceNote can be maximum 200 characters")
    private String priceNote;
}