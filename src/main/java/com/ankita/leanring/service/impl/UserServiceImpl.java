package com.ankita.leanring.service.impl;

import com.ankita.leanring.entity.User;
import com.ankita.leanring.repository.UserRepository;
import com.ankita.leanring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by amitshrivastava on 14/01/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(Long userId) {
        return false;
    }

    @Override
    public boolean findUserByUserName(String username) {
        return false;
    }
}
