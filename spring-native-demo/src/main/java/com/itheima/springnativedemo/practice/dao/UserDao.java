package com.itheima.springnativedemo.practice.dao;

import com.itheima.springnativedemo.practice.entity.UserDetails;

import java.util.List;

public interface UserDao {
    List<UserDetails> findUsers();
}
