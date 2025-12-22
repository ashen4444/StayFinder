package com.stayfinder.backend.model.hotel;

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
    private String dataSource;

    /**
     * Last update date of this hotel document
     */
    private LocalDate lastUpdated;

    /**
     * Embedding generation status
     * Example: PENDING, COMPLETED
     */
    private String embeddingStatus;
}

