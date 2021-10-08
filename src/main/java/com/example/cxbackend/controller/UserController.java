package com.example.cxbackend.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.cxbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public JSONObject addUser(@RequestBody JSONObject requestJson){
        return userService.addUser(requestJson);
    }
}
