package com.Learning.SpringSecurity.Controller;

import com.Learning.SpringSecurity.Model.User;
import com.Learning.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public User register(@RequestBody User user){
        userService.saveUser(user);
        return user;
    }
}
