package com.stayfinder.backend.dto.hotel;

import com.stayfinder.backend.model.hotel.*;
import jakarta.validation.Valid;
import lombok.Data;

import java.util.List;

@Data
public class HotelUpdateRequest {

    @Valid
    private BasicInfo basicInfo;

    @Valid
    private ImageSet images;

    @Valid
    private List<Room> rooms;

    @Valid
    private Facilities facilities;

    @Valid
    private SwimmingPool swimmingPool;

    @Valid
    private List<Review> reviews;

    @Valid
    private ReviewInsights reviewInsights;

    @Valid
    private Metadata metadata;
}
