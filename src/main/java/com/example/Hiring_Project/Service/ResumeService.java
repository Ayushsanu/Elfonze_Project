package com.example.Hiring_Project.Service;

import com.example.Hiring_Project.Entity.Resume;
import com.example.Hiring_Project.Repositories.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class ResumeService {
    @Autowired
    private ResumeRepository resumeRepository;
    public String uploadResume(Resume file) throws RuntimeException{
        if (file.getFileUrl()==null || file.getUser().getUsername()==null)
            throw new RuntimeException("Please enter required details");
        resumeRepository.save(file);
        return "Resume added successfully";
    }

    public List<Resume> getAllResumes() throws RuntimeException{
        List<Resume> resumes=resumeRepository.findAll();
        if (resumes.size()==0)
            throw new RuntimeException("No resume found");
        return resumes;
    }
}
