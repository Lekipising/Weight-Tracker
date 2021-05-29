package com.weighttracker.weighttracker.controllers;

import com.weighttracker.weighttracker.classes.User;
import com.weighttracker.weighttracker.repository.UserRepository;
import com.weighttracker.weighttracker.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// path "account"
@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    // view user - GET(id)
    @RequestMapping(value = "/account/{username}", method = RequestMethod.GET)
    public User getUser(@PathVariable("username") String username){
        return userService.getUser(username);
    }
    
    // view all users - GET

    // create user - POST (user)

    // update user - PUT(user)

    // delete user - DELETE(user)
}
