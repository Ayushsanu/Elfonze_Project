package com.example.Hiring_Project.Controller;

import com.example.Hiring_Project.Entity.Resume;
import com.example.Hiring_Project.Service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/resume")
public class ResumeController {
    @Autowired
    ResumeService resumeService;
    @PostMapping("/add")
    public ResponseEntity<String> uploadResume(@RequestBody Resume file) {
        try {
            String success = resumeService.uploadResume(file);
            return new ResponseEntity<>(success,HttpStatus.ACCEPTED);
        }
        catch (Exception  e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/get_resumes")
    public ResponseEntity<?> getAllResumes() {
        try {
            List<Resume> resumes = resumeService.getAllResumes();
            return new ResponseEntity<>(resumes, HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
}
