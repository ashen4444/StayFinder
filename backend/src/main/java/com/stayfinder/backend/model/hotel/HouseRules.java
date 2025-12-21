package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HouseRules {

    private String checkInFrom;
    private String checkInTo;
    private String checkOutFrom;
    private String checkOutTo;

    private List<String> rules;

    private ChildPolicy childPolicy;
}