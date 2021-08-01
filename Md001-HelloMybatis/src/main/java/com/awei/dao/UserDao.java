package com.awei.dao;

import com.awei.model.User;

import java.util.List;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-01 16:22
 **/
public interface UserDao {
    public List<User> findAll();
}
