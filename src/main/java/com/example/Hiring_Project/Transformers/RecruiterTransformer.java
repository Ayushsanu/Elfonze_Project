package com.example.Hiring_Project.Transformers;

import com.example.Hiring_Project.DTOs.ResponseDTOs.RecruiterResponseDTO;
import com.example.Hiring_Project.Entity.Recruiter;

public class RecruiterTransformer {
    public static RecruiterResponseDTO convertEntityToDto(Recruiter recruiter){
        RecruiterResponseDTO recruiterDTO=RecruiterResponseDTO.builder()
                .username(recruiter.getName())
                .email(recruiter.getEmail())
                .build();
        return recruiterDTO;
    }
}
