package com.prince.product.controller;


import com.prince.entity.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {
    /**
     * 获取名称
     * @return
     */
    @RequestMapping(value = "name")
    public String getName(){
        User user = new User();
        user.setId("adsf");
        return user.getId();
    }

}
