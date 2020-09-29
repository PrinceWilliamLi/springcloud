package com.prince.consumer.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.prince.consumer.model.sys.User;
import com.prince.consumer.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author kyle
 * @since 2020-09-27
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @GetMapping("/getObject")
    public User  getUser (){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id","1");
        return userService.getOne(queryWrapper);
    }
}
