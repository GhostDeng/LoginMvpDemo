package com.ghost.loginmvpdemo;

/**
 * 作者：Ghost
 * 时间：2018/4/3
 * 功能：
 */
public interface UserInf {

    void login(String userName,String password,OnLoginListener onLoginListener);

    interface OnLoginListener{

        void loginSuccess(User user);

        void loginFailed();
    }
}
