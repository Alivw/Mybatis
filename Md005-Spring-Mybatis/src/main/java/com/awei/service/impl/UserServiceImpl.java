package com.awei.service.impl;

import com.awei.dao.UserDao;
import com.awei.entity.User;
import com.awei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUserByIds(Integer[] ids) {
        return userDao.findUserByIds(ids);
    }
}
