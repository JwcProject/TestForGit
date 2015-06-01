package com.struts2Login.dao;

import com.struts2Login.bean.User;

import java.util.Map;

/**
 * Created by Super on 2015/6/1.
 */
public interface BaseDao {
    /**
     * 接口文件模拟从数据库中读出数据放入Map中返回
     * @param filename 文件名（绝对地址）
     * @return 存储用户信息的Map
     */
    Map<String,String> findAllUser(String filename);

    /**
     * 将数据写入一个txt文件
     * @param user 存储用户信息的对象
     */
    void writeData(User user);
}
