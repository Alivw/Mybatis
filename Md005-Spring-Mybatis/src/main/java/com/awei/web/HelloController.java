package com.awei.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-02 22:33
 **/
@Controller
public class HelloController {

    @GetMapping("/hello")
    public @ResponseBody
    String hello(String[] ids) {
        System.out.println(ids);
        return "Hello world";
    }

}
