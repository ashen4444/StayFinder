package com.stayfinder.backend.model.hotel;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChildPolicy {

    @NotNull(message = "childrenAllowed must be provided (true/false)")
    private Boolean childrenAllowed;

    private Boolean extraBedAvailable;

    @Size(max = 200, message = "extraBedChargeNote can be maximum 200 characters")
    private String extraBedChargeNote;
}