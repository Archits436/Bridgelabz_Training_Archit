package com.digit.Day_22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.addUser(user);
    }
    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }
}

