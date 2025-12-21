package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChildPolicy {

    private Boolean childrenAllowed;
    private Boolean extraBedAvailable;
    private String extraBedChargeNote;
}
