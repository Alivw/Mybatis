package com.awei.service.impl;

import com.awei.dao.UserDao;
import com.awei.model.User;
import com.awei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-08 09:47
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findUserByName(String name) {
        return userDao.findUserByName(name);
    }

}
