package com.ankita.leanring.controller;

import com.ankita.leanring.entity.User;
import com.ankita.leanring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by amitshrivastava on 14/01/17.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/api/getAll")
    public List<User> getUser() {
        return userService.findAll();
    }

    @DeleteMapping("/admin/delete/:id")
    public boolean deleteImage(@PathVariable("id") Long imageId) {
        return true;
    }
}
