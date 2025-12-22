package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    // Review source
    private String source;          // e.g. "Google", "Booking.com", "Manual"

    // Reviewer info
    private String authorName;
    private boolean verified;       // verified by external platform

    // Review content
    private double rating;          // e.g. 4.5
    private String reviewText;
    private String language;

    // Metadata
    private LocalDate reviewDate;
}
