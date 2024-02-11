package com.example.Hiring_Project.Controller;

import com.example.Hiring_Project.DTOs.ResponseDTOs.JDResponseDTO;
import com.example.Hiring_Project.Entity.Job_Description;
import com.example.Hiring_Project.Service.JobDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job-descriptions")
public class JobDescriptionController {
    @Autowired
    JobDescriptionService jobDescriptionService;

    @PostMapping("/add")
    public ResponseEntity<JDResponseDTO> createJobDescription(@RequestBody Job_Description jobDescription) {
        try {
            JDResponseDTO created = jobDescriptionService.createJobDescription(jobDescription);
            created.setStatusCode("202");
            created.setStatusMessage("Job description is added successfully with required details");
            return new ResponseEntity<>(created, HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            JDResponseDTO error=new JDResponseDTO();
            error.setStatusMessage("400");
            error.setStatusMessage("FAILURE!! Some error occur. "+e.getMessage());
            return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/get-all-job-descriptions")
    public ResponseEntity<?> getAllJobDescriptions() {
        try {
            List<Job_Description> jobDescriptions = jobDescriptionService.getAllJobDescriptions();
            return new ResponseEntity<>(jobDescriptions,HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
}
