package com.vams.registration.service;

import com.vams.registration.model.User;
import com.vams.registration.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepository repo;

    public User saveUser(User user) {
        return repo.save(user);
    }

    public User fetchUserByEmailId(String email) {
        return repo.findByEmailId(email);
    }

    public User fetchUserByEmailIdAndPassword(String email, String password) {
        return repo.findByEmailIdAndPassword(email, password);
    }
}
