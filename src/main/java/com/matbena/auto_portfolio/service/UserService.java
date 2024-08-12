package com.matbena.auto_portfolio.service;

import com.matbena.auto_portfolio.model.User;

import java.util.List;

public interface UserService {
    //create getAll getById update delete

    public User createUser(User user);

    public List<User> getUserList();

    public User getUserById(int id);

    public User updateUser(User newUser, int id);

    public void deleteUserById(int id);
}
