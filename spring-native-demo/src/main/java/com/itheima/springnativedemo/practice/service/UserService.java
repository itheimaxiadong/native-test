package com.itheima.springnativedemo.practice.service;

import com.itheima.springnativedemo.practice.entity.User;
import com.itheima.springnativedemo.practice.entity.UserDetails;

import java.util.List;

public interface UserService {
    List<UserDetails> getUserDetails();

    List<User> getUsers();
}
