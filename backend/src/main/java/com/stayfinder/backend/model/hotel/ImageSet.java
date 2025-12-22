package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImageSet {

    /**
     * Main image shown in listings and comparisons
     */
    private String cover;

    /**
     * Additional images for the gallery view
     */
    private List<String> gallery;
}
