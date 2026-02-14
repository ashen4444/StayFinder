package com.stayfinder.backend.dto.hotel;

import com.stayfinder.backend.model.hotel.*;
import lombok.Data;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Data
public class HotelCreateRequest {

    @NotNull(message = "basicInfo is required")
    @Valid
    private BasicInfo basicInfo;

    @Valid
    private ImageSet images;

    @NotEmpty(message = "rooms cannot be empty")
    @Valid
    private List<Room> rooms;

    @NotNull(message = "facilities is required")
    @Valid
    private Facilities facilities;

    @Valid
    private SwimmingPool swimmingPool;

    @Valid
    private List<Review> reviews;

    @NotNull(message = "metadata is required")
    @Valid
    private Metadata metadata;
}

