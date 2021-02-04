package com.rick.bootdemo.service.user;

import com.rick.bootdemo.domain.User;

import java.util.List;

public interface UserService {
    void insertUser(User user);
    List<User> queryAll();
}