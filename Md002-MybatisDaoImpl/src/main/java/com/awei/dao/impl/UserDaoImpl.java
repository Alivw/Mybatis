package com.awei.dao.impl;

import com.awei.dao.UserDao;
import com.awei.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-01 17:28
 **/
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> findAll() throws IOException {
        String config = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        String sqlId = "com.awei.dao.UserDao.findAll";
        List<User> userList = sqlSession.selectList(sqlId);
        sqlSession.close();
        return userList;
    }
}
