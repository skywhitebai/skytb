package com.sky.skytb.controller;

import com.sky.skytb.model.UUser;
import com.sky.skytb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/getUser")
    public UUser getUser(Long userId){
        return userService.getUser(userId);
    }
}
