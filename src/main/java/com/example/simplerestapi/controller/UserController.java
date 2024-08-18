package com.example.simplerestapi.controller;

import com.example.simplerestapi.model.User;
import com.example.simplerestapi.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/user")
    public User getUser(@RequestParam int id) {
        User user = userService.getUser(id);
        return user;
    }
}
