package com.awei.service;

import com.awei.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 通过 id数组 查询用户
     * @param ids
     * @return
     */
    List<User> findUserByIds(Integer[] ids);


}
