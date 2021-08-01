package com.awei.dao;

import com.awei.model.User;

import java.util.List;

/**
 * @program: Md001-HelloMybatis
 * @author: Awei
 * @create: 2021-08-01 17:09
 **/
public interface UserDao {
    public List<User> findAll();
}
