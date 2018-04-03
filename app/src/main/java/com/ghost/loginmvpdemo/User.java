package com.ghost.loginmvpdemo;

/**
 * 作者：Ghost
 * 时间：2018/4/3
 * 功能：用户实体类，属性  用户名  密码  方法 getter setter方法
 */
public class User {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
