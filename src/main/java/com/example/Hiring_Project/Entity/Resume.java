package com.example.Hiring_Project.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "resumes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String candidateName;
    private String fileUrl;
    @OneToOne(mappedBy = "user")
    private User user;
}
