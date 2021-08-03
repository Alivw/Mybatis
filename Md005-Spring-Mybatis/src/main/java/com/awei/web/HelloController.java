package com.awei.web;

import com.awei.entity.User;
import com.awei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-02 22:33
 **/
@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("/hellouser")
    public @ResponseBody
    List<User> hello(Integer[] ids) {
        System.out.println(ids);
        return userService.findUserByIds(ids);
    }

}
