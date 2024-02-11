package com.example.Hiring_Project.Controller;

import com.example.Hiring_Project.DTOs.ResponseDTOs.UserResponseDTO;
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
    public ResponseEntity<UserResponseDTO> addUser(User user){
        try {
            UserResponseDTO userDTO=userService.addUser(user);
            userDTO.setStatusCode("202");
            userDTO.setStatusMessage("SUCCESS!! "+userDTO.getUsername()+" with "+userDTO.getEmail()+" is added successfully");
            return new ResponseEntity<>(userDTO, HttpStatus.ACCEPTED);
        }
        catch (Exception e) {
            UserResponseDTO userResponseDTO=new UserResponseDTO();
            userResponseDTO.setStatusCode("400");
            userResponseDTO.setStatusMessage("FAILURE!! Some error occur. "+e.getMessage());
            return new ResponseEntity<>(userResponseDTO,HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getCurrentLoggedInUser")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
