package com.tumbwe.artisanmktplace.service;

import com.tumbwe.artisanmktplace.entity.User;

import java.util.List;

public interface UserService {
    void createUser(User user);


    List<User> getUsers();

    void updateUser(Long id, User user);

    User getUser(Long id);
}
