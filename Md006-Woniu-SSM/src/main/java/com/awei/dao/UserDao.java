package com.awei.dao;

import com.awei.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
* @Description:
* @Param:
* @return:
* @Author: shizuwei
* @Date: 2021/8/21
*/
@Repository
public interface UserDao {
    /**
     * 根据主键删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findUserByName(String name);
}