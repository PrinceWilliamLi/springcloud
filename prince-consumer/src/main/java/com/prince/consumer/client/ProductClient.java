package com.prince.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-server",path ="/product")
public interface ProductClient {

    @GetMapping("/name")
    String getName();
}
