package com.stayfinder.backend.model.hotel;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HouseRules {

    @Pattern(
            regexp = "^(0[1-9]|1[0-2]):[0-5][0-9] (AM|PM)$",
            message = "checkInFrom must be in format hh:mm AM/PM (e.g., 02:00 PM)"
    )
    private String checkInFrom;

    @Pattern(
            regexp = "^(0[1-9]|1[0-2]):[0-5][0-9] (AM|PM)$",
            message = "checkInTo must be in format hh:mm AM/PM (e.g., 02:00 PM)"
    )
    private String checkInTo;

    @Pattern(
            regexp = "^(0[1-9]|1[0-2]):[0-5][0-9] (AM|PM)$",
            message = "checkOutFrom must be in format hh:mm AM/PM (e.g., 11:00 AM)"
    )
    private String checkOutFrom;

    @Pattern(
            regexp = "^(0[1-9]|1[0-2]):[0-5][0-9] (AM|PM)$",
            message = "checkOutTo must be in format hh:mm AM/PM (e.g., 11:00 AM)"
    )
    private String checkOutTo;

    private List<
            @NotBlank(message = "rules cannot contain blank values")
            @Size(max = 300, message = "Each rule can be maximum 300 characters")
                    String> rules;

    @Valid
    private ChildPolicy childPolicy;
}