package com.stayfinder.backend.model.hotel;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pool {

    /**
     * Number of pools of this type
     */
    @Min(value = 0, message = "Pool count cannot be negative")
    private int count;

    /**
     * Whether usage is free or not
     */
    private boolean free;

    /**
     * Additional features (infinity pool, pool with view, etc.)
     */
    @Size(max = 300, message = "Pool description can be maximum 300 characters")
    private String description;
}
