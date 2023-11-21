package com.poc.orderservice.domain;

import com.poc.orderservice.model.Order;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ListOrdersResponse {
    private List<Order> orders;
}
