package com.stayfinder.backend.model.hotel;

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
    private String currency;

    /**
     * Price amount (per night)
     */
    private double amount;

    /**
     * Optional note (e.g., per night, includes taxes, etc.)
     */
    private String priceNote;
}

