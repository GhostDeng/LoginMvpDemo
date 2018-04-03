package com.ghost.loginmvpdemo;

/**
 * 作者：Ghost
 * 时间：2018/4/3
 * 功能：
 */
public interface LoginView {

    //显示正在登录动画
    void showProgressBar();

    //隐藏正在登录动画
    void hideProgressBar();

    //获取用户名
    void getUserName(String userName);

    //获取密码
    void getPassword(String Password);

}
