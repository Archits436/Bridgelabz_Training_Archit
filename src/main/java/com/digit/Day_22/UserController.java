package com.digit.Day_22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("add")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    @PutMapping("users/{id}/email")
    public void updateUserEmail(@PathVariable Long id, @RequestParam String newEmail) {
        userService.updateUserEmail(id, newEmail);
    }
}

