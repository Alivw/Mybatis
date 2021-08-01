package com.awei;

import com.awei.dao.UserDao;
import com.awei.model.User;
import com.awei.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.SelectableChannel;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void mybatisTest() throws IOException {
        String config = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.findAll();
        userList.forEach(user -> System.out.println(user));
    }

    @Test
    public void insertTest() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        User user = new User();
        user.setName("李四");
        user.setAge(23);
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.insertByUser(user);

        // 提交事务
        sqlSession.commit();

    }
}
