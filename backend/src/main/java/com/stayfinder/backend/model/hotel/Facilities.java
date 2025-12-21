package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Facilities {

    // General facilities
    private boolean freeWifi;
    private boolean parking;
    private boolean restaurant;
    private boolean bar;
    private boolean gym;
    private boolean spa;
    private boolean wheelchairAccessible;
    private boolean elevator;
    private boolean smokingArea;

    // Room-related facilities
    private boolean airConditioning;
    private boolean hotWater;
    private boolean flatScreenTv;
    private boolean refrigerator;
    private boolean minibar;
    private boolean teaCoffeeMaker;
    private boolean soundproofRooms;

    // Safety & security
    private boolean cctv;
    private boolean fireExtinguishers;
    private boolean smokeAlarms;
    private boolean security24Hours;
    private boolean safetyDepositBox;

    // Custom user-defined facilities
    private List<String> customFacilities;
}
