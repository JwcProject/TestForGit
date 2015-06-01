package com.struts2Login.service;

import com.struts2Login.bean.User;

/**
 * Created by Super on 2015/5/28.
 */

public interface UserService {

    int SUCCESS=0;
    int PASSWORD_WRONG=1;
    int No_THIS_USER=2;
    int MULTI_USER =3;

    /**
     * 验证用户输入的姓名、密码是否匹配
     * @param username 用户输入的姓名
     * @param password 用户输入的密码
     * @return 验证通过，返回true;反之，返回false
     */
    int checkUserLogin(String username, String password);

    /**
     * 检查用户名是否存在
     * @param username 用户注册的用户名
     * @return 验证通过，返回true;反之，返回false
     */
    boolean checkUsernameExist(String username);

    void addUser(User user);
}
