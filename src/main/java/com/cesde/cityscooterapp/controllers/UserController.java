package com.cesde.cityscooterapp.controllers;


import com.cesde.cityscooterapp.domain.User;
import com.cesde.cityscooterapp.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/User")
public class UserController {

    private final UserService userService;


    public UserController (UserService userService){
        this.userService = userService;
    }

    @PostMapping("/create")
    User createUser(@RequestBody User user){
        return userService.createUser(user) ;
    }


}
