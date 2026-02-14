package com.stayfinder.backend.model.hotel;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    /**
     * Internal identifier for the review
     * Optional (can be generated)
     */
    private String reviewId;

    /**
     * Source of the review (Google Reviews, Booking.com, etc.)
     */
    @NotBlank(message = "Review source is required")
    @Size(max = 100, message = "Source can be maximum 100 characters")
    private String source;

    /**
     * Rating value (e.g., 4.5)
     */
    @DecimalMin(value = "0.0", inclusive = false, message = "Rating must be greater than 0")
    @DecimalMax(value = "5.0", message = "Rating cannot be more than 5")
    private double rating;

    /**
     * Raw review text collected manually
     */
    @NotBlank(message = "Review text is required")
    @Size(min = 5, max = 5000, message = "Review text must be between 5 and 5000 characters")
    private String reviewText;

    /**
     * Date when the review was posted
     */
    @NotNull(message = "Review date is required")
    @PastOrPresent(message = "Review date cannot be in the future")
    private LocalDate reviewDate;
}
