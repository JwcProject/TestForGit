package com.struts2Login.service;

/**
 * Created by Super on 2015/5/28.
 */
public interface LoginServeice {

    /**
     * 验证用户输入的姓名、密码是否匹配
     * @param username 用户输入的姓名
     * @param password 用户输入的密码
     * @return 验证通过，返回true;反之，返回false
     */
    public boolean checkUserLogin(String username, String password);

    /**
     * 检查用户名是否存在
     * @param username 用户注册的用户名
     * @return 验证通过，返回true;反之，返回false
     */
    public boolean checkUsernameExist(String username);
}
