package com.awei.dao;

import com.awei.entity.User;

import java.util.List;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-02 22:27
 **/
public interface UserDao {


    /**
     * 通过id 数组查找用户
     * @param ids
     * @return
     */
    List<User> findUserByIds(Integer[] ids);
}
