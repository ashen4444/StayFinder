package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SwimmingPool {

    /**
     * Outdoor pools information
     */
    private Pool outdoor;

    /**
     * Indoor pools information
     */
    private Pool indoor;

    /**
     * Kids pool information
     */
    private Pool kids;

    /**
     * Common features across pools
     */
    private List<String> commonFeatures;

    /**
     * Age restrictions or notes
     */
    private String agePolicy;
}

