package com.awei.controller;

import com.awei.model.User;
import com.awei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-08 09:45
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/user")
    public List<User> getUser(User user) {
        return userService.findUserByName(user.getName());
    }
}
