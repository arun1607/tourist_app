package com.ankita.leanring.service;

import com.ankita.leanring.entity.User;

/**
 * Created by amitshrivastava on 14/01/17.
 */
public interface UserService {

    User createUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(Long userId);

    boolean findUserByUserName(String username);
}
