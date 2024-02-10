package com.example.Hiring_Project.Service;

import com.example.Hiring_Project.DTOs.ResponseDTOs.RecruiterResponseDTO;
import com.example.Hiring_Project.Entity.Recruiter;
import com.example.Hiring_Project.Repositories.RecruiterRepository;
import com.example.Hiring_Project.Transformers.RecruiterTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecruiterService {
    @Autowired
    private RecruiterRepository recruiterRepository;
    public RecruiterResponseDTO addRecruiter(Recruiter recruiter) {
        if (recruiter.getEmail()==null || recruiter.getJobDescriptionURL()==null || recruiter.getName()==null)
            throw new RuntimeException("Please enter valid details");
        recruiterRepository.save(recruiter);
        RecruiterResponseDTO recruiterDTO= RecruiterTransformer.convertEntityToDto(recruiter);
        return recruiterDTO;
    }

    public List<Recruiter> getAllRecruiters() {
        List<Recruiter> allRecruiters=recruiterRepository.findAll();
        if (allRecruiters.size()==0)
            throw new RuntimeException("No recruiter is present");
        return allRecruiters;
    }
}
