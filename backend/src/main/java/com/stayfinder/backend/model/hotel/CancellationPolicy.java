package com.stayfinder.backend.model.hotel;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CancellationPolicy {

    /**
     * e.g. "Free cancellation"
     */
    @NotBlank(message = "policyName is required")
    @Size(max = 100, message = "policyName can be maximum 100 characters")
    private String policyName;

    /**
     * Days before check-in when cancellation is free
     */
    @Min(value = 0, message = "freeCancellationUntilDays cannot be negative")
    @Max(value = 365, message = "freeCancellationUntilDays cannot exceed 365")
    private int freeCancellationUntilDays;

    /**
     * Penalty percentage (e.g., 50.0)
     */
    @DecimalMin(value = "0.0", message = "penaltyPercentage cannot be negative")
    @DecimalMax(value = "100.0", message = "penaltyPercentage cannot exceed 100")
    private double penaltyPercentage;

    /**
     * Whether the booking is completely non-refundable
     */
    private boolean nonRefundable;

    /**
     * Human-readable description
     */
    @Size(max = 500, message = "description can be maximum 500 characters")
    private String description;
}