package com.ankita.leanring.service;

import com.ankita.leanring.entity.User;

import java.util.List;

/**
 * Created by amitshrivastava on 14/01/17.
 */
public interface UserService {

    User createUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(Long userId);

    User findUserByUserName(String username);

    List<User> findAll();
}
