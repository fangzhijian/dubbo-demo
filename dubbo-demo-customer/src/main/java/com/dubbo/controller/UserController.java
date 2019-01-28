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

    @Reference(version = "6.66", parameters = "getUserById.retries=4")
    private UserService userService;


    @GetMapping("getUserInfo")
    public User getUserInfo(){
        long startTime = System.currentTimeMillis();
        User userById = userService.getUserById(1);
        System.out.println(System.currentTimeMillis()-startTime);
        return userById;
    }

    @GetMapping("delete")
    public String delete(int i){
        userService.deleteUser(i);
        return "好嗨哦";
    }

    @GetMapping("getName")
    public String getName(){
        return userService.getUserName();
    }

}
