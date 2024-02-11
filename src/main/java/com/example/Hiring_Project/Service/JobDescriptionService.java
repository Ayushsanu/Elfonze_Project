package com.example.Hiring_Project.Service;

import com.example.Hiring_Project.DTOs.ResponseDTOs.JDResponseDTO;
import com.example.Hiring_Project.Entity.Job_Description;
import com.example.Hiring_Project.Repositories.JDRepository;
import com.example.Hiring_Project.Transformers.JDTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobDescriptionService {
    @Autowired
    private JDRepository jdRepository;
    public JDResponseDTO createJobDescription(Job_Description jobDescription) throws RuntimeException {
        if (jobDescription.getTitle()==null || jobDescription.getDescription()==null || jobDescription.getEducation()==null || jobDescription.getExperience()==null || jobDescription.getSkills()==null)
            throw new RuntimeException("Please enter required details");
        jdRepository.save(jobDescription);
        JDResponseDTO jdResponseDTO= JDTransformer.convertEntityToDto(jobDescription);
        return jdResponseDTO;
    }

    public List<Job_Description> getAllJobDescriptions() throws RuntimeException {
        List<Job_Description> jdList=jdRepository.findAll();
        if (jdList.size()==0)
            throw new RuntimeException("No job description found");
        return jdList;
    }
}
