package com.hxy.service;

import java.util.List;

import com.hxy.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
