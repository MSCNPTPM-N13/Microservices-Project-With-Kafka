package com.kharzixen.ordervalidationserviceretry1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItem {
    private Long id;
    private String productId;
    private int quantity;
}
