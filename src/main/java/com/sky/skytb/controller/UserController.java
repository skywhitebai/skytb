package com.sky.skytb.controller;

import com.sky.skytb.dto.response.BaseResponse;
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
    public BaseResponse<UUser> getUser(Long userId){
        return userService.getUser(userId);
    }
    @GetMapping("/getUserByUserName")
    public BaseResponse<UUser> getUserByUserName(String userName){
        return userService.getUserByUserName(userName);
    }
}
