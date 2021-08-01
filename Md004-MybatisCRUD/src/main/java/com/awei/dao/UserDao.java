package com.awei.dao;

import com.awei.model.User;

import java.io.IOException;
import java.util.List;

/**
 * @program: Md001-HelloMybatis
 * @author: Awei
 * @create: 2021-08-01 17:26
 **/
public interface UserDao {
    List<User> findAll();

    Integer insertByUser(User user);

}
