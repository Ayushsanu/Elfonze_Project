package com.example.Hiring_Project.Controller;

import com.example.Hiring_Project.Entity.User;
import com.example.Hiring_Project.Repositories.UserRepository;
import com.example.Hiring_Project.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseEntity<String> addUser(User user){
        try {
            String message=userService.createUser(user);
            return new ResponseEntity<>(message, HttpStatus.ACCEPTED);
        }
        catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/getCurrentLoggedInUser")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
