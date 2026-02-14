package com.stayfinder.backend.model.hotel;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Metadata {

    /**
     * Indicates how the hotel data was collected
     * Example: Manual, Google Reviews, Booking.com
     */
    @NotBlank(message = "dataSource is required")
    @Size(max = 100, message = "dataSource can be maximum 100 characters")
    private String dataSource;

    /**
     * Last update date of this hotel document
     */
    @NotNull(message = "lastUpdated date is required")
    @PastOrPresent(message = "lastUpdated cannot be in the future")
    private LocalDate lastUpdated;

    /**
     * Embedding generation status
     * Example: PENDING, COMPLETED
     */
    @NotBlank(message = "embeddingStatus is required")
    @Pattern(
            regexp = "^(PENDING|COMPLETED|FAILED)$",
            message = "embeddingStatus must be PENDING, COMPLETED, or FAILED"
    )
    private String embeddingStatus;
}