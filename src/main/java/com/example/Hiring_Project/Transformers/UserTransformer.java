package com.example.Hiring_Project.Transformers;


import com.example.Hiring_Project.DTOs.ResponseDTOs.UserResponseDTO;
import com.example.Hiring_Project.Entity.User;

public class UserTransformer {
    public static UserResponseDTO convertEntityToDto(User user){
        UserResponseDTO userDTO=UserResponseDTO.builder()
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
        return userDTO;
    }
}
