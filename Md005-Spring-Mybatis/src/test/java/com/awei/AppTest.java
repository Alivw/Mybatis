package com.awei;

import com.awei.dao.UserDao;
import com.awei.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-03 08:25
 **/
public class AppTest {


    @Autowired
    private UserDao userDao;

    @Test
    public void testUserdao() {
        Integer[] ids = {1, 2};
        List<User> userList = userDao.findUserByIds(ids);
        for (User u : userList) {
            System.out.println(u);
        }

    }
}
