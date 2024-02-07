package com.example.Hiring_Project.Controller;

import com.example.Hiring_Project.Entity.Job_Description;
import com.example.Hiring_Project.Service.JobDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class JobDescriptionController {
    @Autowired
    JobDescriptionService jobDescriptionService;

    @PostMapping("/job-descriptions")
    public ResponseEntity<Object> createJobDescription(@RequestBody Job_Description jobDescription) {
        Job_Description createdJobDescription = jobDescriptionService.createJobDescription(jobDescription);
        return ResponseEntity.ok(createdJobDescription);
    }

    @GetMapping("/job-descriptions")
    public ResponseEntity<List<Job_Description>> getAllJobDescriptions() {
        List<Job_Description> jobDescriptions = jobDescriptionService.getAllJobDescriptions();
        return ResponseEntity.ok(jobDescriptions);
    }
}
