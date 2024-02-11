package com.example.Hiring_Project.Controller;

import com.example.Hiring_Project.DTOs.ResponseDTOs.RecruiterResponseDTO;
import com.example.Hiring_Project.Entity.Recruiter;
import com.example.Hiring_Project.Service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recruiter")
public class RecruiterController {
    @Autowired
    RecruiterService recruiterService;
    @PostMapping("/add")
    public ResponseEntity<RecruiterResponseDTO> addRecruiter(@RequestBody Recruiter recruiter) {
        try {
            RecruiterResponseDTO recruiterDTO = recruiterService.addRecruiter(recruiter);
            recruiterDTO.setStatusCode("202");
            recruiterDTO.setStatusMessage("SUCCESS!! "+recruiterDTO.getUsername()+" with "+recruiterDTO.getEmail()+" is added successfully");
            return new ResponseEntity<>(recruiterDTO, HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            RecruiterResponseDTO recruiterDTO=new RecruiterResponseDTO();
            recruiterDTO.setStatusCode("400");
            recruiterDTO.setStatusMessage("FAILURE!! Some error occur. "+e.getMessage());
            return new ResponseEntity<>(recruiterDTO,HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/allRecruiters")
    public ResponseEntity<?> getAllRecruiters() {
        try {
            List<Recruiter> list=recruiterService.getAllRecruiters();
            return new ResponseEntity<>(list,HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
}
