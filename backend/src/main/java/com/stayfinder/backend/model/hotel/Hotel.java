package com.stayfinder.backend.model.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "hotels")
public class Hotel {

    // ===================== EXISTING CORE =====================

    @Id
    private String id;

    // ===================== BASIC INFO =====================

    private BasicInfo basicInfo;

    // ===================== IMAGES (LOCKED STRUCTURE) =====================

    private ImageSet images;

    // ===================== ROOMS =====================

    private List<Room> rooms;

    // ===================== FACILITIES & SERVICES =====================

    private Facilities facilities;

    // ===================== SWIMMING POOLS =====================

    private SwimmingPool swimmingPool;

    // ===================== REVIEWS =====================

    // Raw reviews (manual / collected)
    private List<Review> reviews;

    // AI-generated review summary
    private ReviewInsights reviewInsights;

    // ===================== METADATA =====================

    private Metadata metadata;
}

