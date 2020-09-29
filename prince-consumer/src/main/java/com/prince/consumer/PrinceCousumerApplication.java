package com.prince.consumer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@EnableEurekaClient
@EnableFeignClients
@ComponentScan(value = "com.prince.*")
@MapperScan(value = "com.prince.consumer.mapper")
public class PrinceCousumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrinceCousumerApplication.class, args);
    }

}
