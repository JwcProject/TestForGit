package com.struts2Login.service.impl;

import com.struts2Login.bean.User;
import com.struts2Login.dao.UserDao;
import com.struts2Login.dao.impl.UserDaoImpl;
import com.struts2Login.service.LoginServeice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Super on 2015/5/28.
 */
public class LoginServiceImpl implements LoginServeice {

    private UserDao userDao=new UserDaoImpl();
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    /**
     *验证用户输入的姓名、密码是否匹配
     * @param username 用户输入的姓名
     * @param password 用户输入的密码
     * @return 验证通过，返回true;反之，返回false
     */
    @Override
    public boolean checkUserLogin(String username, String password) {
        /*String filename = "D:\\sql.txt";
        Map<String, String> map = new HashMap<String, String>();
        map=userDao.readData(filename);
        Set<String> set = new HashSet<String>();
        set = map.keySet();
        for (String name : set) // 迭代map中的key
        {
            if (name.equals(username) && password.equals(map.get(name)))
            { // 验证客户端传进的username和password与读取出的key和value值是否相同
                return true;
            }
        }
        return false;*/
        User user=userDao.findUserByName(username);
        if(username.equals(user.getUsername())&&password.equals(user.getPassword())){
            return true;
        }
        return false;
    }

    @Override
    public boolean checkUsernameExist(String username) {
        User user=userDao.findUserByName(username);
        if(user.getUsername().length()!=0){
            return true;
        }
        return false;
    }
}
