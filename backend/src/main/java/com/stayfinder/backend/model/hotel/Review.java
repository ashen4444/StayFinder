package com.stayfinder.backend.model.hotel;

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
     */
    private String reviewId;

    /**
     * Source of the review (Google Reviews, Booking.com, etc.)
     */
    private String source;

    /**
     * Rating value (e.g., 4.5)
     */
    private double rating;

    /**
     * Raw review text collected manually
     */
    private String reviewText;

    /**
     * Date when the review was posted
     */
    private LocalDate reviewDate;
}

