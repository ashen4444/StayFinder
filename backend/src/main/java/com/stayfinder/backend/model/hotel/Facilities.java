package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Facilities {

    // ===================== ROOM SERVICES =====================
    private List<String> roomServices;

    // ===================== FOOD & DRINK =====================
    private List<String> foodAndDrink;

    // ===================== BATHROOM =====================
    private List<String> bathroom;

    // ===================== INTERNET =====================
    private List<String> internetFacilities;

    // ===================== SAFETY & SECURITY =====================
    private List<String> safetyAndSecurity;

    // ===================== BUSINESS CENTRE =====================
    private List<String> businessFacilities;

    // ===================== CLEANING SERVICES =====================
    private List<String> cleaningServices;

    // ===================== OUTDOORS =====================
    private List<String> outdoors;

    // ===================== ENTERTAINMENT =====================
    private List<String> entertainment;

    // ===================== OUTDOOR ACTIVITIES =====================
    private List<String> outdoorActivities;

    // ===================== GENERAL =====================
    private List<String> generalFacilities;

    // ===================== FRONT DESK =====================
    private List<String> frontDeskServices;

    // ===================== SPA & WELLNESS =====================
    private List<String> spaAndWellness;

    // ===================== CUSTOM / OTHER =====================
    /**
     * Any facilities that do not fit the above categories
     */
    private List<String> custom;
}

