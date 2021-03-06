package com.awei.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-01 17:47
 **/
public class MybatisUtil {
    private static SqlSessionFactory factory;

    static {
        String config = "mybatis-config.xml";
        try {
            InputStream in = Resources.getResourceAsStream(config);
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        SqlSession sqlSession = null;
        if (null != factory) {
            sqlSession = factory.openSession();
        }
        return sqlSession;
    }
}
