package com.example.Hiring_Project.Repositories;

import com.example.Hiring_Project.Entity.Recruiter;
import com.example.Hiring_Project.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter,Long> {
    public Optional<Recruiter> findByEmail(String email);
}
