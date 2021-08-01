package com.awei.model;

/**
 * @Description: 电脑类
 * @Author: Awei
 * @Create: 2021-08-01 15:43
 **/
public class Computer {
    private String cname;
    private Integer uid;
    private User user;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cname='" + cname + '\'' +
                ", uid=" + uid +
                ", user=" + user +
                '}';
    }

    public void setUser(User user) {
        this.user = user;
    }
}
