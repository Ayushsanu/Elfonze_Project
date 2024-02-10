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
    public Resume uploadResume(Resume file) {
        return resumeRepository.save(file);
    }

    public List<Resume> getAllResumes() {
        List<Resume> resumes=resumeRepository.findAll();
        if (resumes.size()==0)
            throw new RuntimeException("No resume found");
        return resumes;
    }
}
