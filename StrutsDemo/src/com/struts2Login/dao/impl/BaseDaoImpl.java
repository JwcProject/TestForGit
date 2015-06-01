package com.struts2Login.dao.impl;

import com.struts2Login.bean.User;
import com.struts2Login.dao.BaseDao;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Super on 2015/6/1.
 */
public class BaseDaoImpl implements BaseDao {
    String filename = "D:\\sql.txt";

    @Override
    public Map<String, String> findAllUser(String filename) {
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
    public void writeData(User user) {
        String dataString = user.getUsername() + "," + user.getPassword();
        try {
            BufferedWriter out=new BufferedWriter(new FileWriter(new File(filename),true));
            out.write(dataString+"\r\n");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
