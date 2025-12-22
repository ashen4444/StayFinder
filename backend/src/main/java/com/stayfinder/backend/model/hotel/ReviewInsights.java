package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewInsights {

    /**
     * Overall sentiment derived from all reviews
     * Example: Mostly Positive, Mixed, Negative
     */
    private String overallSentiment;

    /**
     * Frequently mentioned positive aspects
     */
    private List<String> goodThings;

    /**
     * Common complaints from guests
     */
    private List<String> complaints;

    /**
     * Guest profiles this hotel is best suited for
     */
    private List<String> bestFor;

    /**
     * Guest profiles this hotel may not be ideal for
     */
    private List<String> notIdealFor;
}
