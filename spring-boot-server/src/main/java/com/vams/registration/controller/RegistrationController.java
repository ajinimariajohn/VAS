package com.vams.registration.controller;

import com.vams.registration.model.User;
import com.vams.registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService service;

    @PostMapping("/registeruser")
    @CrossOrigin(origins = "http://localhost:4200")
    public User RegisterUser(@RequestBody User user) throws Exception {
        String tempEmailId = user.getEmailId();
        if (tempEmailId != null && !"".equals(tempEmailId)) {
            User userObj = service.fetchUserByEmailId(tempEmailId);
            if (userObj != null) {
                throw new Exception("User with "+tempEmailId+" is already registered");
            }
        }
        User userObj = null;
        userObj = service.saveUser(user);
        return userObj;
    }

    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:4200")
    public User loginUser(@RequestBody User user) throws Exception {
        String tempEmailId = user.getEmailId();
        String tempPass = user.getPassword();
        User userObj = null;
        if (tempEmailId != null && tempPass != null) {
            userObj = service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
        }
        if (userObj == null) {
            throw new Exception("bad credentials");
        }
        return userObj;
    }
}
