package com.example.Hiring_Project.DTOs.ResponseDTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RecruiterResponseDTO {
    private String username;
    private String email;
    private String statusCode;
    private String statusMessage;
}
