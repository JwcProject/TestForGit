package com.struts2Login.dao;

import com.struts2Login.bean.User;

import java.util.Map;

/**
 * Created by Super on 2015/5/30.
 */
public interface UserDao {
    /**
     * �ӿ��ļ�ģ������ݿ��ж������ݷ���Map�з���
     * @param filename �ļ��������Ե�ַ��
     * @return �洢�û���Ϣ��Map
     */
    public Map<String,String> readData(String filename);

    /**
     * ������д��һ��txt�ļ�
     * @param filename �ļ��������Ե�ַ��
     * @param user �洢�û���Ϣ�Ķ���
     */
    public void write(String filename,User user);


    /**
     * ͨ���û�������û��������û���Ϣ
     * @param username �û�������û���
     * @return �洢�û���Ϣ��user����
     */
    public User findUserByName(String username);


}
