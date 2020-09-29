package com.prince.consumer.controller;

import com.prince.consumer.client.ProductClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CousumerController {

    @Resource
    private ProductClient productClient;

    @GetMapping("cus/name")
    public String getProductName(){
        return productClient.getName();
    }
}
