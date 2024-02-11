package com.example.Hiring_Project.DTOs.ResponseDTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JDResponseDTO {
    private String title;
    private String description;
    private String skills;
    private String experience;
    private String education;
    private String statusCode;
    private String statusMessage;
}
