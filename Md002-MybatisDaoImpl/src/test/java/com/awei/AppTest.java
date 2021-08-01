package com.awei;

import static org.junit.Assert.assertTrue;

import com.awei.dao.UserDao;
import com.awei.dao.impl.UserDaoImpl;
import com.awei.model.User;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void mybatisTest() throws IOException {
        UserDao userDao = new UserDaoImpl();
        List<User> userList = userDao.findAll();
        userList.forEach(user -> System.out.println(user));
    }
}
