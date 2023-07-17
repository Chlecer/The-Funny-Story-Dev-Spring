package com.guiguib.thefunnystory.controller;

import com.guiguib.thefunnystory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String registrationPage() {
        return "registration";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam("email") String email, @RequestParam("password") String password) {
        userService.registerNewUser(email, password);
        return "redirect:/login";
    }
}
