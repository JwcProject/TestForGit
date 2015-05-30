package com.struts2Login.dao.impl;

import com.struts2Login.bean.User;
import com.struts2Login.dao.UserDao;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Super on 2015/5/30.
 */
public class UserDaoImpl implements UserDao {

    @Override
    public Map<String, String> readData(String filename) {
        Map<String, String> map = new HashMap<String, String>();

        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String dataString = null;
            while ((dataString = in.readLine()) != null) {
                String[] data=dataString.split(",");
                map.put(data[0],data[1]);

            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }

    @Override
    public void write(String filename, User user) {
        String dataString = user.getUsername() + "," + user.getPassword();
        try {
            BufferedWriter out=new BufferedWriter(new FileWriter(new File(filename),true));
            out.write(dataString+"\r\n");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public User findUserByName(String username) {
        User user=new User();
        String filename = "D:\\sql.txt";
        Map<String, String> map = new HashMap<String, String>();
        map=readData(filename);
        Set<String> set = new HashSet<String>();
        set = map.keySet();
        for (String name : set) // µü´úmapÖÐµÄkey
        {
            if (name.equals(username))
            {
                user.setUsername(username);
                user.setPassword(map.get(name));
            }
        }
        return user;
    }
}
