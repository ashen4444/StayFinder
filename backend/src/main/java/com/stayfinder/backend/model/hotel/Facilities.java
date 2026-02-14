package com.stayfinder.backend.model.hotel;

import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Facilities {

    // ===================== ROOM SERVICES =====================
    private List<
            @NotBlank(message = "roomServices cannot contain blank values")
            @Size(max = 100, message = "Facility name can be max 100 characters")
                    String> roomServices;

    // ===================== FOOD & DRINK =====================
    private List<
            @NotBlank(message = "foodAndDrink cannot contain blank values")
            @Size(max = 100, message = "Facility name can be max 100 characters")
                    String> foodAndDrink;

    // ===================== BATHROOM =====================
    private List<
            @NotBlank(message = "bathroom cannot contain blank values")
            @Size(max = 100, message = "Facility name can be max 100 characters")
                    String> bathroom;

    // ===================== INTERNET =====================
    private List<
            @NotBlank(message = "internetFacilities cannot contain blank values")
            @Size(max = 100, message = "Facility name can be max 100 characters")
                    String> internetFacilities;

    // ===================== SAFETY & SECURITY =====================
    private List<
            @NotBlank(message = "safetyAndSecurity cannot contain blank values")
            @Size(max = 100, message = "Facility name can be max 100 characters")
                    String> safetyAndSecurity;

    // ===================== BUSINESS CENTRE =====================
    private List<
            @NotBlank(message = "businessFacilities cannot contain blank values")
            @Size(max = 100, message = "Facility name can be max 100 characters")
                    String> businessFacilities;

    // ===================== CLEANING SERVICES =====================
    private List<
            @NotBlank(message = "cleaningServices cannot contain blank values")
            @Size(max = 100, message = "Facility name can be max 100 characters")
                    String> cleaningServices;

    // ===================== OUTDOORS =====================
    private List<
            @NotBlank(message = "outdoors cannot contain blank values")
            @Size(max = 100, message = "Facility name can be max 100 characters")
                    String> outdoors;

    // ===================== ENTERTAINMENT =====================
    private List<
            @NotBlank(message = "entertainment cannot contain blank values")
            @Size(max = 100, message = "Facility name can be max 100 characters")
                    String> entertainment;

    // ===================== OUTDOOR ACTIVITIES =====================
    private List<
            @NotBlank(message = "outdoorActivities cannot contain blank values")
            @Size(max = 100, message = "Facility name can be max 100 characters")
                    String> outdoorActivities;

    // ===================== GENERAL =====================
    private List<
            @NotBlank(message = "generalFacilities cannot contain blank values")
            @Size(max = 100, message = "Facility name can be max 100 characters")
                    String> generalFacilities;

    // ===================== FRONT DESK =====================
    private List<
            @NotBlank(message = "frontDeskServices cannot contain blank values")
            @Size(max = 100, message = "Facility name can be max 100 characters")
                    String> frontDeskServices;

    // ===================== SPA & WELLNESS =====================
    private List<
            @NotBlank(message = "spaAndWellness cannot contain blank values")
            @Size(max = 100, message = "Facility name can be max 100 characters")
                    String> spaAndWellness;

    // ===================== CUSTOM / OTHER =====================
    private List<
            @NotBlank(message = "custom facilities cannot contain blank values")
            @Size(max = 100, message = "Facility name can be max 100 characters")
                    String> custom;
}
