package com.struts2Login.dao;

import com.struts2Login.bean.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by Super on 2015/5/30.
 */

public interface UserDao extends BaseDao{

    /**
     * 通过用户输入的用户名查找用户信息
     * @param username 用户输入的用户名
     * @return 存储用户信息的user对象
     */
    User findUserByName(String username);

}
