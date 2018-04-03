package com.ghost.loginmvpdemo;

/**
 * 作者：Ghost
 * 时间：2018/4/3
 * 功能：
 */
public class UserModel implements UserInf {
    @Override
    public void login(final String userName, final String password, final OnLoginListener onLoginListener) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //模式网络请求
                    Thread.sleep(3000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (userName.equals("110") & password.equals("110")) {
                    User user = new User();
                    user.setPassword(password);
                    user.setUserName(userName);
                    onLoginListener.loginSuccess(user);
                }else {

                }
            }
        }).start();
    }
}
