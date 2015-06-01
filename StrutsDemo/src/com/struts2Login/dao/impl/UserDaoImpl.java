package com.struts2Login.dao.impl;

import com.struts2Login.bean.User;
import com.struts2Login.dao.BaseDao;
import com.struts2Login.dao.UserDao;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Super on 2015/5/30.
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl implements UserDao {

    @Override
    public User findUserByName(String username) {
        User user=null;
        Map<String, String> map=findAllUser(filename);
        Set<String> set=map.keySet();
        for (String name : set) // µü´úmapÖÐµÄkey
        {
            if (name.equals(username))
            {
                user=new User();
                user.setUsername(username);
                user.setPassword(map.get(name));
            }
        }
        return user;
    }

}
