package com.poc.orderservice.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
public class Order {

    private UUID id;
    private String customerName;
    private String customerAddress;
    private Integer quantity;
    private boolean isDelivered;
}
