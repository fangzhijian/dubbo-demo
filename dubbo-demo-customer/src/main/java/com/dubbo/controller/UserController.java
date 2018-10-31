package com.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.demo.model.User;
import dubbo.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2018/10/31 16:34
 * 走路呼呼带风
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("getUserInfo")
    public User getUserInfo(){
        return userService.getUserById(1);
    }

}
