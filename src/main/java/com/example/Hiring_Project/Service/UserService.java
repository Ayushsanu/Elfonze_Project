package com.example.Hiring_Project.Service;

import com.example.Hiring_Project.DTOs.ResponseDTOs.UserResponseDTO;
import com.example.Hiring_Project.Entity.User;
import com.example.Hiring_Project.Repositories.UserRepository;
import com.example.Hiring_Project.Transformers.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserResponseDTO addUser(User user) throws RuntimeException {
        if (user.getUsername()==null || user.getEmail()==null || user.getPassword()==null)
            throw new RuntimeException("Please enter valid details");
        userRepository.save(user);
        UserResponseDTO userResponseDTO= UserTransformer.convertEntityToDto(user);
        return userResponseDTO;
    }
}
