package com.example.Hiring_Project.Service;

import com.example.Hiring_Project.Entity.User;
import com.example.Hiring_Project.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String createUser(User user) throws RuntimeException {
        if (user.getUsername()==null || user.getEmail()==null || user.getPassword()==null)
            throw new RuntimeException("Please enter valid details");
        user=userRepository.save(user);
        return "User is successfully added with required information";
    }
}
