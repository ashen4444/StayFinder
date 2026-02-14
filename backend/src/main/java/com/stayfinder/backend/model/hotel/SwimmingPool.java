package com.stayfinder.backend.model.hotel;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
    @Valid
    private Pool outdoor;

    /**
     * Indoor pools information
     */
    @Valid
    private Pool indoor;

    /**
     * Kids pool information
     */
    @Valid
    private Pool kids;

    /**
     * Common features across pools
     */
    private List<
            @NotBlank(message = "commonFeatures cannot contain blank values")
            @Size(max = 100, message = "Feature name can be max 100 characters")
                    String> commonFeatures;

    /**
     * Age restrictions or notes
     */
    @Size(max = 300, message = "agePolicy can be maximum 300 characters")
    private String agePolicy;
}
