package com.awei.model;

import java.util.List;

/**
 * @Description: 用户类
 * @Author: Awei
 * @Create: 2021-08-01 15:42
 **/
public class User {
    private String name;
    private Integer age;
    private Integer cid;
    private List<Computer> computers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cid=" + cid +
                '}';
    }
}
