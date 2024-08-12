package com.matbena.auto_portfolio.controller;

import com.matbena.auto_portfolio.model.User;
import com.matbena.auto_portfolio.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserServiceImp userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @GetMapping
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @PutMapping("/update/{id}")
    public User updateUser(@RequestBody User newUser, @PathVariable int id){
        return userService.updateUser(newUser, id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        userService.deleteUserById(id);
        return "User deleted";
    }
}
