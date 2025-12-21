package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SwimmingPool {

    // Pool availability
    private int outdoorPoolCount;
    private int indoorPoolCount;
    private int kidsPoolCount;

    // Access rules
    private boolean freeAccess;
    private String agePolicy; // e.g. "All ages welcome", "Adults only"

    // Pool features
    private boolean poolWithView;
    private boolean infinityPool;
    private boolean shallowEnd;
    private boolean poolBar;
    private boolean sunLoungers;
    private boolean sunUmbrellas;

    // Additional notes or custom services
    private List<String> customPoolFeatures;
}
