package com.stayfinder.backend.dto.hotel;

import com.stayfinder.backend.model.hotel.*;
import lombok.Data;
import java.util.List;

@Data
public class HotelUpdateRequest {

    private BasicInfo basicInfo;
    private ImageSet images;
    private List<Room> rooms;
    private Facilities facilities;
    private SwimmingPool swimmingPool;
    private List<Review> reviews;
    private ReviewInsights reviewInsights;
    private Metadata metadata;
}


