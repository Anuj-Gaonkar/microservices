package com.poc.orderservice.controller;

import com.poc.orderservice.domain.ListOrdersResponse;
import com.poc.orderservice.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/dummy-order")
public class DummyOrder {

    @GetMapping
    public ResponseEntity<ListOrdersResponse> getOrders(){
        Order order = Order.builder()
                .id(UUID.randomUUID())
                .customerName("dummy")
                .isDelivered(false)
                .quantity(10)
                .customerAddress("India")
                .build();

        ListOrdersResponse response = ListOrdersResponse.builder().orders(List.of(order)).build();
        return ResponseEntity.ok(response);
    }
}
