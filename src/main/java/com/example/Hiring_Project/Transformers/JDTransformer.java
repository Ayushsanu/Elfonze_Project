package com.example.Hiring_Project.Transformers;

import com.example.Hiring_Project.DTOs.ResponseDTOs.JDResponseDTO;
import com.example.Hiring_Project.Entity.Job_Description;

public class JDTransformer {
    public static JDResponseDTO convertEntityToDto(Job_Description jobDescription){
        JDResponseDTO jdResponseDTO=JDResponseDTO.builder()
                .title(jobDescription.getTitle())
                .description(jobDescription.getDescription())
                .experience(jobDescription.getExperience())
                .skills(jobDescription.getSkills())
                .education(jobDescription.getEducation())
                .build();
        return jdResponseDTO;
    }
}
