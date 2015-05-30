package com.struts2Login.dao;

import com.struts2Login.bean.User;

import java.util.Map;

/**
 * Created by Super on 2015/5/30.
 */
public interface UserDao {
    /**
     * 接口文件模拟从数据库中读出数据放入Map中返回
     * @param filename 文件名（绝对地址）
     * @return 存储用户信息的Map
     */
    public Map<String,String> readData(String filename);

    /**
     * 将数据写入一个txt文件
     * @param filename 文件名（绝对地址）
     * @param user 存储用户信息的对象
     */
    public void write(String filename,User user);


    /**
     * 通过用户输入的用户名查找用户信息
     * @param username 用户输入的用户名
     * @return 存储用户信息的user对象
     */
    public User findUserByName(String username);


}
