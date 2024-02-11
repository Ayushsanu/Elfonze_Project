package com.example.Hiring_Project.Repositories;

import com.example.Hiring_Project.Entity.Job_Description;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JDRepository extends JpaRepository<Job_Description,Long> {
}
