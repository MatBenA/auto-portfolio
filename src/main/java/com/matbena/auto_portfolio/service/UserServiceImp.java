package com.matbena.auto_portfolio.service;

import com.matbena.auto_portfolio.model.User;
import com.matbena.auto_portfolio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImp implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User userType) {
        return userRepository.save(userType);
    }

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User updateUser(User newUser, int id) {
        User updateUser = userRepository.findById(id).orElse(null);

        assert updateUser != null;
        updateUser.setName(newUser.getName());
        updateUser.setBudget(newUser.getBudget());
        updateUser.setPassword(newUser.getPassword());

        return userRepository.save(updateUser);
    }

    @Override
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }
}