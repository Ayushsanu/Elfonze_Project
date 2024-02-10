package com.example.Hiring_Project.Repositories;

import com.example.Hiring_Project.Entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResumeRepository extends JpaRepository<Resume,Long> {
    public Optional<Resume> findById(Long id);
}
