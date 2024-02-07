package com.example.Hiring_Project.Controller;

import com.example.Hiring_Project.Entity.Resume;
import com.example.Hiring_Project.Service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ResumeController {
    @Autowired
    ResumeService resumeService;
    @PostMapping("/add_resumes")
    public ResponseEntity<Resume> uploadResume(@RequestBody MultipartFile file) {
        Resume uploadedResume = resumeService.uploadResume(file);
        return ResponseEntity.ok(uploadedResume);
    }

    @GetMapping("/get_resumes")
    public ResponseEntity<List<Resume>> getAllResumes() {
        List<Resume> resumes = resumeService.getAllResumes();
        return ResponseEntity.ok(resumes);
    }
}
