package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CancellationPolicy {

    private String policyName;                 // e.g. "Free cancellation"
    private int freeCancellationUntilDays;     // days before check-in
    private double penaltyPercentage;           // e.g. 50.0
    private boolean nonRefundable;
    private String description;
}
