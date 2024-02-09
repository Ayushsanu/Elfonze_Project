package com.example.Hiring_Project.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/getCurrentLoggedInUser")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}