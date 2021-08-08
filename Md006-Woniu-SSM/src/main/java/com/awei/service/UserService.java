package com.awei.service;

import com.awei.model.User;

import java.util.List;

/**
 * @program: Mybatis
 * @author: Awei
 * @create: 2021-08-08 09:46
 **/
public interface UserService {
    List<User> findUserByName(String name);
}
