package com.example.Hiring_Project.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "job_descriptions")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Job_Description {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String skills;
    private String experience;
    private String education;
}
