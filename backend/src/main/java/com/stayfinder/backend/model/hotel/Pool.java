package com.stayfinder.backend.model.hotel;

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
    private int count;

    /**
     * Whether usage is free or not
     */
    private boolean free;

    /**
     * Additional features (infinity pool, pool with view, etc.)
     */
    private String description;
}

