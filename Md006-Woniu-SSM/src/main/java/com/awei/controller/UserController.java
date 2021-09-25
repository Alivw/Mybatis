package com.awei.controller;

import com.awei.model.User;
import com.awei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
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

    @GetMapping("/users")
    public List<User> Users(@RequestBody List<User> users) {
        System.out.println();
        return users;
    }
}
